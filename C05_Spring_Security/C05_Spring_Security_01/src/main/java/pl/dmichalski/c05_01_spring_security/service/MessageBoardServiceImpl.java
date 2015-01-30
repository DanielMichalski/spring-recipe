package pl.dmichalski.c05_01_spring_security.service;

import org.springframework.security.access.annotation.Secured;
import pl.dmichalski.c05_01_spring_security.model.Message;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Daniel
 */
public class MessageBoardServiceImpl implements MessageBoardService {

    private Map<Long, Message> messages = new LinkedHashMap<>();

    @Override
    @Secured({"ROLE_USER", "ROLE_GUEST"})
    public List<Message> listMessages() {
        return new ArrayList<>(messages.values());
    }

    @Override
    @Secured("ROLE_USER")
    public synchronized void postMessage(Message message) {
        message.setId(System.currentTimeMillis());
        messages.put(message.getId(), message);
    }

    @Override
    @Secured("ROLE_ADMIN")
    public void deleteMessage(Message message) {
        messages.remove(message.getId());
    }

    @Override
    @Secured({"ROLE_USER", "ROLE_GUEST"})
    public Message findMessageById(Long messageId) {
        return messages.get(messageId);
    }

}
