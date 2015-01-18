package pl.dmichalski.c05_01_spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.dmichalski.c05_01_spring_security.model.Message;
import pl.dmichalski.c05_01_spring_security.service.MessageBoardService;

/**
 * Author: Daniel
 */
@Controller
@RequestMapping("/messageDelete*")
public class MessageDeleteController {

    @Autowired
    private MessageBoardService messageBoardService;

    @RequestMapping(method = RequestMethod.GET)
    public String messageDelete(@RequestParam(required = true,
            value = "messageId") Long messageId, Model model){

        Message message = messageBoardService.findMessageById(messageId);
        messageBoardService.deleteMessage(message);
        model.addAttribute("messages", messageBoardService.listMessages());
        return "redirect:messageList";
    }


}
