package com.patika.paycore.HelperProject.messaging.consumer;

import com.patika.paycore.HelperProject.config.RabbitMQConfig;
import com.patika.paycore.HelperProject.model.Transaction;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionConsumer {

//    @RabbitListener(queues = RabbitMQConfig.QUEUE)
//    public void consumeMessageFromQueue(String message) {
//        System.out.println("Message received & consumed from queue : " + message);
//    }
//
//    @RabbitListener(queues = RabbitMQConfig.QUEUE)
//    public void consumeMessageFromQueue(Transaction transaction) {
//        System.out.println(transaction);
//    }
}
