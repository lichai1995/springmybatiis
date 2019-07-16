package com.lic.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author lichai
 * @date 22:33 2019/7/15
 */
@Component
public class QueueListener {

    @JmsListener(destination = "publish.queue",containerFactory = "jmsListenerContainerQueue")
    @SendTo("out.queue")
    public String receive(String text){
        System.out.println("QueueListener: consumer收到信息: "+text);
        return "consumer received: "+text;
    }
}
