package ru.javaops.bootjava.restaurantvoting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestaurantVotingApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantVotingApplication.class, args);
    }

}
