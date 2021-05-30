package com.iot.lab.manager;

import com.iot.lab.enums.Services;
import com.iot.lab.modals.User;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class UserManager {

    private final List<User> users;

    public List<User> sortByFullName(final boolean descending) {
        List<User> usersSorted = new ArrayList<>(users);
        if (descending) {
            usersSorted.sort(Comparator.comparing(User::getFullName));
        } else {
            usersSorted.sort(Comparator.comparing(User::getFullName).reversed());
        }
        return usersSorted;
    }

    public void printObjects(final List<User> users) {
        users.forEach(System.out::println);
    }
}
