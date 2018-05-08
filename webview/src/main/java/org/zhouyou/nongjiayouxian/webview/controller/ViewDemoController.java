package org.zhouyou.nongjiayouxian.webview.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zhouyou.nongjiayouxian.webview.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author  zhouyou
 * @create  2018/5/8 14:27
 * @desc
 **/

@Controller
@RequestMapping(value = "viewDemo")
public class ViewDemoController {

    @RequestMapping(value = "thymeleaf",method = RequestMethod.GET)
    public String index(Model model){
        Map map = new HashMap();
        map.put("msg", "Hello Freemarker");
        model.addAttribute("map",map);

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        model.addAttribute("list",list);

        User user = new User();
        user.setId(1);
        user.setUsername("zhouyou");
        user.setPsd("123");
        model.addAttribute("user",user);

        User user2 = new User();
        user2.setId(2);
        user2.setUsername("hero");
        user2.setPsd("123");

        List users = new ArrayList();
        users.add(user);
        users.add(user2);
        model.addAttribute("users",users);

        return "thymeleaf_demo";
    }

}
