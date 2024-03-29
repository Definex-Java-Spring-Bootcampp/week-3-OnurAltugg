package com.patika.notificationservice.listener;

import com.patika.notificationservice.dto.NotificationDTO;
import com.patika.notificationservice.strategy.NotificationStrategy;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationListener {
	
	private final NotificationStrategy notificationStrategy;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void sendNotification(@Qualifier("emailNotification")NotificationDTO notificationDTO) {
    	notificationStrategy.sendNotification(notificationDTO);
    }

}
