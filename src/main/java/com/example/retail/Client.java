package com.example.retail;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Client {
    String firstName;
    String lastName;
    LocalDate birthDate;

    Integer getAge() {
        return this.birthDate.until( LocalDate.now()).getYears();
    }
}