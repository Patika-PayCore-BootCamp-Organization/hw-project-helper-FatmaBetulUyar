package com.patika.paycore.HelperProject.messaging.consumer;

import com.patika.paycore.HelperProject.config.RabbitMQConfig;
import com.patika.paycore.HelperProject.model.Transaction;
import com.patika.paycore.HelperProject.model.Transfer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TransferConsumer {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Transfer transfer) {
        System.out.println("Transfer Details :"+"\n"+
                "Transfer From : "+transfer.getCustomer()+"\n"+
                "Transfer To : " + transfer.getRecipient()+"\n"+
                "Transfer Date : " +transfer.getTransferDate()+"\n"+
                "Amount : " + transfer.getAmount()+"\n"+
                "Transfer Type : " +transfer.getTransferType()+"\n"+
                "Transfer State : " +transfer.getIsSuccess());
    }
}
