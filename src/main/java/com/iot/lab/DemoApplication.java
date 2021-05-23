package com.iot.lab;

import com.iot.lab.enums.Services;
import com.iot.lab.manager.UserManager;
import com.iot.lab.modals.Client;
import com.iot.lab.modals.Employee;
import com.iot.lab.modals.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        List<User> objects = List.of(
                new Client("Nazar Vashchyshyn", "Male", Services.BUSINESS_PAPERS_PREPARATION,
                        17, 1),
                new Employee("Nastia Shulgina", "Female", Services.BUSINESS_PAPERS_PREPARATION,
                        18, 1, 3, 5),
                new Client("Bogdan Didukh", "Male", Services.APPLICATION_REGISTRATION,
                        19, 3),
                new Employee("Sofia Paska", "Female", Services.BUSINESS_PAPERS_PREPARATION,
                        14, 7, 2, 4));
        UserManager userManager = new UserManager(objects);
        userManager.printObjects(userManager.searchByServicesAndSortByName(false,
                Services.BUSINESS_PAPERS_PREPARATION));
    }

}

