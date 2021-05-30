package com.iot.lab;

import com.iot.lab.enums.Services;
import com.iot.lab.manager.UserManager;
import com.iot.lab.modals.Client;
import com.iot.lab.modals.Employee;
import com.iot.lab.modals.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

