package org.zhouyou.nongjiayouxian.webview.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 * @author  zhouyou
 * @create  2018/5/8 14:26
 * @desc
 **/
@Controller
@RequestMapping
public class IndexController {

    Logger log = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "index")
    private String index(){
        return "index";
    }

}
