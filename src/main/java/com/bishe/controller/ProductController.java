package com.bishe.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bishe.entity.Product;
import com.bishe.entity.ProductSwiperImage;
import com.bishe.entity.R;
import com.bishe.service.IProductService;
import com.bishe.service.IProductSwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//商品Controller
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Autowired
    private IProductSwiperImageService productSwiperImageService;

    //查询轮播商品
    @GetMapping("/findSwiper")
    public R findSwiper(){
        List<Product> swiperProductList = productService.list(new QueryWrapper<Product>().eq("isSwiper", true).orderByAsc("swiperSort"));
        Map<String,Object> map =  new HashMap<>();
        map.put("message",swiperProductList);
        return R.ok(map);
    }

    //查询热卖商品
    @GetMapping("/findHot")
    public R findHot(){
        Page<Product> page = new Page<>(0,8);
        Page<Product> pageProduct = productService.page(page,new QueryWrapper<Product>().eq("isHot",true).orderByAsc("hotDateTime"));
        List<Product> hotProductList = pageProduct.getRecords();
        Map<String,Object> map =  new HashMap<>();
        map.put("message",hotProductList);
        return R.ok(map);

    }

    //根据id查询商品详情信息
    @GetMapping("/detail")
    public R detail(Integer id){
        Product product =  productService.getById(id);       //  根据id查询实体
        List<ProductSwiperImage> productSwiperImageList = productSwiperImageService.list(new QueryWrapper<ProductSwiperImage>().eq("productId",product.getId()).orderByAsc("sort"));
        product.setProductSwiperImageList(productSwiperImageList);
        Map<String,Object> map =  new HashMap<>();
        map.put("message",product);
        return R.ok(map);
    }

}
