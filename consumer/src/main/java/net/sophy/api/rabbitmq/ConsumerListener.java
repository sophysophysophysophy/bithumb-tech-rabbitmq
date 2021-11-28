package net.sophy.api.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @RabbitListener(queues = "sample.queue")
    public void receiveMessage(final Message message) {
        System.out.println("##### MESSAGE RECEIVERD #####");
        System.out.println(message.toString());
    }
}
