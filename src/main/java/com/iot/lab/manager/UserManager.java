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

    private final List<User> objects;

    public List<User> sortByFullName(final boolean sortOrder) {
        List<User> objectsSorted = new ArrayList<>(objects);
        if (sortOrder) {
            objectsSorted.sort(Comparator.comparing(User::getFullName));
        } else {
            objectsSorted.sort(Comparator.comparing(User::getFullName).reversed());
        }
        return objectsSorted;
    }
    public List<User> searchByServicesAndSortByName(final boolean sortOrder, final Services services) {
        List<User> objectsSorted = new ArrayList<>(objects);
        objectsSorted = objectsSorted.stream().filter(object -> object.getServices() == services).collect(Collectors.toList());

        UserManager userManager = new UserManager(objectsSorted);
        objectsSorted = userManager.sortByFullName(sortOrder);

        return objectsSorted;
    }
    public void printObjects(final List<User> objects) {
        objects.forEach(System.out::println);
    }
}
