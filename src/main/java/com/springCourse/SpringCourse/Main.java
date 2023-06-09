package com.springCourse.SpringCourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        Saludo saludo = (Saludo) context.getBean("imprimirSaludo");
//
//        saludo.imprimirSaludo();

        UserService userService = (UserService) context.getBean("userService");

        userService.notificationService.saludo();

    }
}
