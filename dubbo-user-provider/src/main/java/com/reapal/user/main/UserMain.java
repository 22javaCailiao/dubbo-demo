package com.reapal.user.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jack-cooper on 2017/2/11.
 */
public class UserMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath*:spring/spring-provider.xml", "classpath*:spring/spring.xml"
        });
        context.start();
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
