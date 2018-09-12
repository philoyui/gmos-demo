package io.philoyui.gmosdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangyu-ds on 2018/9/12.
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
