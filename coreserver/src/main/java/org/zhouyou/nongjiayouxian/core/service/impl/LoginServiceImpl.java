package org.zhouyou.nongjiayouxian.core.service.impl;

import org.springframework.stereotype.Service;
import org.zhouyou.nongjiayouxian.core.service.ILoginService;

/**
 * 登录
 * @author  zhouyou
 * @create  2018/5/8 10:23
 * @desc
 **/
@Service("loginService")
public class LoginServiceImpl implements ILoginService {

    @Override
    public boolean login(String username, String psd) throws Exception {
        return false;
    }
}