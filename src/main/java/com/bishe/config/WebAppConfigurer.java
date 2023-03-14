package com.bishe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Web项目配置类
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //虚拟路径映射
        registry.addResourceHandler("/image/swiper/**").addResourceLocations("file:D:\\DasiX\\swiperImgs\\");
        registry.addResourceHandler("/image/bigType/**").addResourceLocations("file:D:\\DasiX\\bigTypeImgs\\");
        registry.addResourceHandler("/image/product/**").addResourceLocations("file:D:\\DasiX\\productImgs\\");
        registry.addResourceHandler("/image/productSwiperImgs/**").addResourceLocations("file:D:\\DasiX\\productSwiperImgs\\");
        registry.addResourceHandler("/image/productIntroImgs/**").addResourceLocations("file:D:\\DasiX\\productIntroImgs\\");
        registry.addResourceHandler("/image/productParaImgs/**").addResourceLocations("file:D:\\DasiX\\productParaImgs\\");



    }
}
