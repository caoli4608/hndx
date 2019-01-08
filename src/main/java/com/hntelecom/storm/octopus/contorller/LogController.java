package com.hntelecom.storm.octopus.contorller.log;

import com.hntelecom.storm.octopus.util.WechatUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.net.URLEncoder;
import java.util.Map;

@Controller
public class LogController {

    String codeURL = "https://open.weixin.qq.com/connect/qrconnect?appid=%s&redirect_uri=%s&response_type=code&scope=%s&state=%s";
    String APPID = "";
    String REDIRECT_URI = URLEncoder.encode("34324GDFGDF");
    String SCOPE = "snsapi_userinfo";
    String STATE = "123";
    String tokenURL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=SECRET&code=CODE&grant_type=authorization_code";
    String SECRET = "";


    @RequestMapping("/wxLogin.do")
    public String wxLogin(ModelAndView model) {
        String newURL = String.format(codeURL , APPID, REDIRECT_URI, SCOPE, STATE);
        return "redirect:"+newURL;
    }

    @RequestMapping("/wxlogin/callback.do")
    public ModelAndView wxLoginCallback(@RequestParam("code")String code , @RequestParam("state")String state, ModelAndView model) {
        String newUri = String.format(tokenURL,APPID, SECRET, code);
        Map<String, String> res =WechatUtils.getUserInfoAccessToken(newUri);
        return null;
    }


    public ModelAndView logout() {
        return null;
    }


}
