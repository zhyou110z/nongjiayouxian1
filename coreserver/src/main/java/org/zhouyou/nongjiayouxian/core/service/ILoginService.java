package org.zhouyou.nongjiayouxian.core.service;

/**
 * @desc 登录接口
 * @author  zhouyou
 * @create  2018/5/8 14:39
 * @link
 **/
public interface ILoginService {

    /**
     * 登录
     * @param username
     * @param psd
     * @return
     * @throws Exception
     */
    public boolean login(String username, String psd) throws Exception;

}
