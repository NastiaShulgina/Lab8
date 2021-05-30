package com.iot.lab.controller;

import com.iot.lab.modals.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("user")
@RestController
public class UserController {
    int counter = 0;
    private final Map<Integer, User> users = new HashMap<>();

    @PostMapping
    public ResponseEntity<Object> addUsers(@RequestBody User user) {
        user.setId(counter++);
        users.put(user.getId(), user);
        return ResponseEntity.ok(Collections.singletonMap("id", user.getId()));
    }

    @GetMapping
    public Collection<User> getUser() {
        return users.values();
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id) {
        User user = users.get(id);
        if (user != null)
            return ResponseEntity.ok(user);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") int id) {
        User user = users.get(id);
        if (user != null) {
            users.remove(id);
            return ResponseEntity.ok(Collections.singletonMap("id", id));
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@RequestBody User newUser, @PathVariable("id") int id) {
        User oldUser = users.get(id);
        if (oldUser != null) {
            newUser.setId(id);
            users.replace(id, newUser);
            return ResponseEntity.ok(newUser);
        }
        return ResponseEntity.notFound().build();
    }
}
