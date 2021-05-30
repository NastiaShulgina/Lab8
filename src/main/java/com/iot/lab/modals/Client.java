package com.iot.lab.modals;

import com.iot.lab.enums.Services;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Client extends User {
    private int priceLimit;

    public Client(String fullName, String sex, String services, int age, int priceLimit, int id) {
        super(fullName, sex, services, age, id);
        this.priceLimit = priceLimit;
    }
}
