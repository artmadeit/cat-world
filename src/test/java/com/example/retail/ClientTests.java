package com.example.retail;

import static org.junit.Assert.assertSame;

import java.time.LocalDate;

import org.junit.Test;

public class ClientTests {
    @Test
    public void age() {
        var arthur = new Client();
        arthur.setBirthDate(LocalDate.of(1995, 11, 4));
        assertSame(23, arthur.getAge());
    }
}