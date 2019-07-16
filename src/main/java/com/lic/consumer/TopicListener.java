package com.lic.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author lichai
 * @date 22:34 2019/7/15
 */
@Component
public class TopicListener {

    @JmsListener(destination = "publish.topic",containerFactory = "jmsListenerContainerTopic")
    public void receive(String text){
        System.out.println("TopicListener: consumer收到信息: "+text);
    }
}
