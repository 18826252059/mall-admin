package org.sandwich.litemall.admin.dao;

import org.sandwich.litemall.db.domain.LitemallGoods;
import org.sandwich.litemall.db.domain.LitemallGoodsAttribute;
import org.sandwich.litemall.db.domain.LitemallGoodsSpecification;
import org.sandwich.litemall.db.domain.LitemallProduct;

public class GoodsAllinone {
    LitemallGoods goods;
    LitemallGoodsSpecification[] specifications;
    LitemallGoodsAttribute[] attributes;
    // 这里采用 Product 再转换到 LitemallProduct
    LitemallProduct[] products;

    public LitemallGoods getGoods() {
        return goods;
    }

    public LitemallProduct[] getProducts() {
        return products;
    }

    public void setProducts(LitemallProduct[] products) {
        this.products = products;
    }

    public void setGoods(LitemallGoods goods) {
        this.goods = goods;
    }

    public LitemallGoodsSpecification[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(LitemallGoodsSpecification[] specifications) {
        this.specifications = specifications;
    }

    public LitemallGoodsAttribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(LitemallGoodsAttribute[] attributes) {
        this.attributes = attributes;
    }

}
