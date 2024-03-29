package com.patika.notificationservice.strategy;

import org.springframework.stereotype.Component;

import com.patika.notificationservice.dto.NotificationDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SMSNotification implements NotificationStrategy {

	@Override
    public void sendNotification(NotificationDTO notificationDTO) {
        log.info("SMS gönderildi: {}", notificationDTO);
    }

}
