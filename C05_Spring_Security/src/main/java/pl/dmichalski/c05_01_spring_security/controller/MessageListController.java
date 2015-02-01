package pl.dmichalski.c05_01_spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dmichalski.c05_01_spring_security.model.Message;
import pl.dmichalski.c05_01_spring_security.service.MessageBoardService;

import java.util.Collections;
import java.util.List;

/**
 * Author: Daniel
 */
@Controller
@RequestMapping("/messageList*")
public class MessageListController {

    @Autowired
    private MessageBoardService messageBoardService;

    @RequestMapping(method = RequestMethod.GET)
    public String generateList(Model model) {
        List<Message> messages = Collections.emptyList();
        messages = messageBoardService.listMessages();
        model.addAttribute("messages", messages);
        return "messageList";
    }

}
