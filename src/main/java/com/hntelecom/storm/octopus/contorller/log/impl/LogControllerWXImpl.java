package com.hntelecom.storm.octopus.contorller.log.impl;

import com.hntelecom.storm.octopus.contorller.log.LogController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LogControllerWXImpl implements LogController {
    String WXURL = "";
    String APPID = "";
    String REDIRECTURL = "";
    @RequestMapping("/wxlogin/callback.do")
    public ModelAndView login(ModelAndView model) {
        return null;
    }

    @Override
    public ModelAndView logout() {
        return null;
    }
}
