package com.iot.lab.modals;

import com.iot.lab.enums.Services;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Employee extends User {
    private int priceOfOneService;
    private int yearsOfExperience;
    private int salary;
    public Employee(String fullName, String sex, String services, int age, int priceOfOneService,
                    int yearsOfExperience, int salary, int id) {
        super(fullName, sex, services, age, id);
    }
}
