package pl.dmichalski.c05_01_spring_security.service;

import pl.dmichalski.c05_01_spring_security.model.Message;

import java.util.List;

/**
 * Author: Daniel
 */
public interface MessageBoardService {

    List<Message> listMessages();

    void postMessage(Message message);

    void deleteMessage(Message message);

    Message findMessageById(Long messageId);

}
