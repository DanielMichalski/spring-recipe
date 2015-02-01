package pl.dmichalski.c05_01_spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dmichalski.c05_01_spring_security.model.Message;
import pl.dmichalski.c05_01_spring_security.service.MessageBoardService;

/**
 * Author: Daniel
 */
@Controller
@RequestMapping("/messagePost*")
public class MessagePostController {

    @Autowired
    private MessageBoardService messageBoardService;

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        Message message = new Message();
        model.addAttribute("message", message);
        return "messagePost";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute("message") Message message, BindingResult result) {
        if (result.hasErrors()) {
            return "messagePost";
        } else {
            messageBoardService.postMessage(message);
            return "redirect:messageList";
        }
    }

}
