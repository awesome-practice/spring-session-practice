package com.practice.spring.session;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MyLoginController {

    @RequestMapping("/mylogin")
    public String login(HttpServletRequest request) {
        request.getSession().setAttribute("member_id", 111);
        request.getSession().setAttribute("tenant_id", 211);
        return "login done";
    }
}
