package com.notification.service.service;

import com.notification.service.entity.Notification;
import com.notification.service.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public Optional<Notification>getNotificationById(int notificationId){
        return notificationRepository.findById(notificationId);
    }
    public Notification addNotification(Notification notification){
        return notificationRepository.save(notification);
    }
}
