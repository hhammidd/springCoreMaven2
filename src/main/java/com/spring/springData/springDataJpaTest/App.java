package com.spring.springData.springDataJpaTest;

import com.spring.springData.springDataJpaTest.service.UserService;

public class App {
    public static void main(String[] args) {
        UserService uus = new UserService();
        uus.initDB();

    }
}
