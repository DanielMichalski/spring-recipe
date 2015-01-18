package pl.dmichalski.c05_01_spring_security.service;

import org.springframework.stereotype.Service;
import pl.dmichalski.c05_01_spring_security.model.Message;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Daniel
 */
@Service
public class MessageBoardServiceImpl implements MessageBoardService {

    private Map<Long, Message> messages = new LinkedHashMap<>();

    @Override
    public List<Message> listMessages() {
        return new ArrayList<>(messages.values());
    }

    @Override
    public synchronized void postMessage(Message message) {
        message.setId(System.currentTimeMillis());
        messages.put(message.getId(), message);
    }

    @Override
    public void deleteMessage(Message message) {
        messages.remove(message.getId());
    }

    @Override
    public Message findMessageById(Long messageId) {
        return messages.get(messageId);
    }

}
