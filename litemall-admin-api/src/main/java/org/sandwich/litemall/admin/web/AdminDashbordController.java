package org.sandwich.litemall.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sandwich.litemall.admin.annotation.LoginAdmin;
import org.sandwich.litemall.db.service.LitemallGoodsService;
import org.sandwich.litemall.db.service.LitemallOrderService;
import org.sandwich.litemall.db.service.LitemallProductService;
import org.sandwich.litemall.db.service.LitemallUserService;
import org.sandwich.litemall.core.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/dashboard")
@Validated
public class AdminDashbordController {
    private final Log logger = LogFactory.getLog(AdminDashbordController.class);

    @Autowired
    private LitemallUserService userService;
    @Autowired
    private LitemallGoodsService goodsService;
    @Autowired
    private LitemallProductService productService;
    @Autowired
    private LitemallOrderService orderService;

    @GetMapping("")
    public Object info(@LoginAdmin Integer adminId){
        if(adminId == null){
            return ResponseUtil.unlogin();
        }

        int userTotal = userService.count();
        int goodsTotal = goodsService.count();
        int productTotal = productService.count();
        int orderTotal = orderService.count();
        Map<String, Integer> data = new HashMap<>();
        data.put("userTotal", userTotal);
        data.put("goodsTotal", goodsTotal);
        data.put("productTotal", productTotal);
        data.put("orderTotal", orderTotal);

        return ResponseUtil.ok(data);
    }

}
