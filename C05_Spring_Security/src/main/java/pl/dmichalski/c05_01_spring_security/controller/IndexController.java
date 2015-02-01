package pl.dmichalski.c05_01_spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Daniel
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping
    public String goToMessageList() {
        return "messageList";
    }

}
