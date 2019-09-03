package com.star.demo1.openApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhixin.huang
 * @date 2019/09/03 18:33
 */
@RestController
@RequestMapping("api/demo1Facade")
public class Demo1Facade {

    @GetMapping("/demo1")
    public String demo1() {
        return "demo1方法返回值";
    }
}
