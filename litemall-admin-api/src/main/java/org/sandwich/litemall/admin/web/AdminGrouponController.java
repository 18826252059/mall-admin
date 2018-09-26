package org.sandwich.litemall.admin.web;

import org.sandwich.litemall.admin.annotation.LoginAdmin;
import org.sandwich.litemall.core.util.JacksonUtil;
import org.sandwich.litemall.core.util.ResponseUtil;
import org.sandwich.litemall.core.validator.Order;
import org.sandwich.litemall.core.validator.Sort;
import org.sandwich.litemall.db.domain.LitemallGoods;
import org.sandwich.litemall.db.domain.LitemallGroupon;
import org.sandwich.litemall.db.domain.LitemallGrouponRules;
import org.sandwich.litemall.db.service.LitemallGoodsService;
import org.sandwich.litemall.db.service.LitemallGrouponRulesService;
import org.sandwich.litemall.db.service.LitemallGrouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/groupon")
@Validated
public class AdminGrouponController {
    @Autowired
    private LitemallGrouponRulesService rulesService;
    @Autowired
    private LitemallGoodsService goodsService;
    @Autowired
    private LitemallGrouponService grouponService;

    @GetMapping("/listRecord")
    public Object listRecord(@LoginAdmin Integer adminId,
                             String grouponId,
                             @RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "10") Integer limit,
                             @Sort @RequestParam(defaultValue = "add_time") String sort,
                             @Order @RequestParam(defaultValue = "desc") String order) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }

        List<LitemallGroupon> grouponList = grouponService.querySelective(grouponId, page, limit, sort, order);
        int total = grouponService.countSelective(grouponId, page, limit, sort, order);

        List<Map<String, Object>> records = new ArrayList<>();
        for (LitemallGroupon groupon : grouponList) {
            Map<String, Object> RecordData = new HashMap<>();
            List<LitemallGroupon> subGrouponList = grouponService.queryJoinRecord(groupon.getId());
            LitemallGrouponRules rules = rulesService.queryById(groupon.getRulesId());
            LitemallGoods goods = goodsService.findById(rules.getGoodsId());

            RecordData.put("groupon", groupon);
            RecordData.put("subGroupons", subGrouponList);
            RecordData.put("rules", rules);
            RecordData.put("goods", goods);

            records.add(RecordData);
        }

        Map<String, Object> data = new HashMap<>();
        data.put("total", total);
        data.put("items", records);

        return ResponseUtil.ok(data);
    }

    @GetMapping("/list")
    public Object list(@LoginAdmin Integer adminId,
                       String goodsId,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }

        List<LitemallGrouponRules> rulesList = rulesService.querySelective(goodsId, page, limit, sort, order);
        int total = rulesService.countSelective(goodsId, page, limit, sort, order);
        Map<String, Object> data = new HashMap<>();
        data.put("total", total);
        data.put("items", rulesList);

        return ResponseUtil.ok(data);
    }

    @PostMapping("/update")
    public Object update(@LoginAdmin Integer adminId, @RequestBody String grouponRulesBody) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }

        Integer id = JacksonUtil.parseInteger(grouponRulesBody, "id");
        Integer goodsId = JacksonUtil.parseInteger(grouponRulesBody, "goodsId");
        String discount = JacksonUtil.parseString(grouponRulesBody, "discount");
        Integer discountMember = JacksonUtil.parseInteger(grouponRulesBody, "discountMember");
        String expireTimeString = JacksonUtil.parseString(grouponRulesBody, "expireTime");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime expireTime = LocalDateTime.parse(expireTimeString, df);

        LitemallGoods goods = goodsService.findById(goodsId);
        if (goods == null) {
            return ResponseUtil.badArgumentValue();
        }

        LitemallGrouponRules grouponRules = rulesService.queryById(id);
        if (grouponRules == null) {
            return ResponseUtil.badArgumentValue();
        }

        grouponRules.setGoodsId(goodsId);
        grouponRules.setDiscount(new BigDecimal(discount));
        grouponRules.setDiscountMember(discountMember);
        grouponRules.setGoodsName(goods.getName());
        grouponRules.setExpireTime(expireTime);
        grouponRules.setPicUrl(goods.getPicUrl());

        rulesService.update(grouponRules);

        return ResponseUtil.ok();
    }


    @PostMapping("/create")
    public Object create(@LoginAdmin Integer adminId, @RequestBody String grouponRulesBody) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }

        Integer goodsId = JacksonUtil.parseInteger(grouponRulesBody, "goodsId");
        String discount = JacksonUtil.parseString(grouponRulesBody, "discount");
        Integer discountMember = JacksonUtil.parseInteger(grouponRulesBody, "discountMember");
        String expireTimeString = JacksonUtil.parseString(grouponRulesBody, "expireTime");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime expireTime = LocalDateTime.parse(expireTimeString, df);

        LitemallGoods goods = goodsService.findById(goodsId);
        if (goods == null) {
            return ResponseUtil.badArgumentValue();
        }

        LitemallGrouponRules grouponRules = new LitemallGrouponRules();
        grouponRules.setGoodsId(goodsId);
        grouponRules.setDiscount(new BigDecimal(discount));
        grouponRules.setDiscountMember(discountMember);
        grouponRules.setAddTime(LocalDateTime.now());
        grouponRules.setGoodsName(goods.getName());
        grouponRules.setExpireTime(expireTime);
        grouponRules.setPicUrl(goods.getPicUrl());

        rulesService.createRules(grouponRules);

        return ResponseUtil.ok(grouponRules);
    }


    @PostMapping("/delete")
    public Object delete(@LoginAdmin Integer adminId, @RequestBody String body) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }

        Integer id = JacksonUtil.parseInteger(body, "id");

        rulesService.delete(id);
        return ResponseUtil.ok();
    }
}
