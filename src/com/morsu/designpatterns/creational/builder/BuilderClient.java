package com.morsu.designpatterns.creational.builder;

import java.util.logging.Logger;

public class BuilderClient {

    private static Logger logger = Logger.getLogger(BuilderClient.class.getName());

    public static void main(String args[]) {
        User user = new User.UserBuilder("Umesh", "Morsu")
                .age(38)
                .phone("469-781-0033")
                .address("812 Westview Dr")
                .build();

        logger.info(user.toString());

    }
}
