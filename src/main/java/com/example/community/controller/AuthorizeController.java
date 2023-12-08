package com.example.community.controller;

import com.example.community.dto.AccessTokenDTO;
import com.example.community.provider.GitProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

/**
 * @Author: Joshua
 * @Date: 06/12/2023 21:12
 */
@Controller
//把provider放进spring的容器里面了
public class AuthorizeController {
    //自动把是spring容器里写好的dto实例化加载到上下文
    @Autowired
    private GitProvider gitProvider;
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,
                           @RequestParam(name="state")  String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("c33d0c89959bb0e66183");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setCliend_secret("8dd4304329afb94dfe149a9ac13c858328514707");
        accessTokenDTO.setState(state);
        gitProvider.getAccess(new AccessTokenDTO());
        return "index";
    }
}
