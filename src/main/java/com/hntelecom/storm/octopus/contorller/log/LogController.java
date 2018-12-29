package com.hntelecom.storm.octopus.contorller.log;

import org.springframework.web.servlet.ModelAndView;

public interface LogController {

    /**
     *登录
     * @return
     */
    public ModelAndView login();

    /**
     *退出
     * @return
     */
    public ModelAndView logout();



}
