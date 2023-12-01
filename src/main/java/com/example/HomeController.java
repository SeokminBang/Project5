package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
//    handlermapping 이 오면 이 url등록해줘 함수하다당 url하나만 가능
    public String home(){

        return "home";
        //index는 view의 이름 viewresolver랑 합쳐줘야함
    }
}
