package com.bishe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bishe.entity.ProductSwiperImage;
import com.bishe.mapper.ProductSwiperImageMapper;
import com.bishe.service.IProductSwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//商品轮播图片Service实现类
@Service("productSwiperImageService")
public class IProductSwiperImageServiceImpl extends ServiceImpl<ProductSwiperImageMapper, ProductSwiperImage> implements IProductSwiperImageService {
    @Autowired
    private ProductSwiperImageMapper productSwiperImageMapper;
}
