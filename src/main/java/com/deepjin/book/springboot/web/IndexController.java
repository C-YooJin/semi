package com.deepjin.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index"; // view resolver가 처리한다.. index뒤에 확장자는 알아서 찾아줌.
    }
}
