package com.bishe.controller;

import com.bishe.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bishe")
public class testcontroller {
    @GetMapping("/test")
    public R test(){
        return R.ok("bishe");
    }
}
