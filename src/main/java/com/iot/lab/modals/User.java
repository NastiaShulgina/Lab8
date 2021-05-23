package com.iot.lab.modals;

import com.iot.lab.enums.Services;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    protected String fullName;
    protected String sex;
    protected Services services;
    protected int age;
}


