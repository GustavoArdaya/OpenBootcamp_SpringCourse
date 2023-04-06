package com.springCourse.SpringCourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;


    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;

    }
}
