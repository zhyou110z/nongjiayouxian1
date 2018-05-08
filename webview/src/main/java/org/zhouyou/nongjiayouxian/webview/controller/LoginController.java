package org.zhouyou.nongjiayouxian.webview.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhouyou.nongjiayouxian.core.service.ILoginService;

@Controller
@RequestMapping(value = "login")
public class LoginController {

    private Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private ILoginService loginService;


    @RequestMapping(value = "loginView")
    private String loginView(){
        return "/user/login";
    }

    @RequestMapping(value = "login")
    @ResponseBody
    private String login(@RequestParam String username, @RequestParam String psd){
        try{
            log.info("username :"+username);
            log.info("psd :"+psd);

           boolean rs =  loginService.login(username,psd);
            log.info("rs : " +rs);

        }catch (Exception e){

        }

        return "index";
    }


}
