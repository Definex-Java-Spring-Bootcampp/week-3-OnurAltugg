package com.patika.notificationservice.strategy;

import org.springframework.stereotype.Component;

import com.patika.notificationservice.dto.NotificationDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MobileNotification implements NotificationStrategy {

	@Override
    public void sendNotification(NotificationDTO notificationDTO) {
        log.info("Mobil bildirim gönderildi: {}", notificationDTO);
    }

}
