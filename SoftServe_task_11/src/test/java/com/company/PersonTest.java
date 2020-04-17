package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void newPerson(){
        person = new Person(20,105);
    }
    @Test
    @DisplayName("Age < 25")
    public void salaryFor25(){
        assertEquals(105,person.salaryWithBonus());
    }

    @Test
    @DisplayName("Age < 30")
    public void salaryFor30(){
        person.setAge(27);
        assertEquals(115.5,person.salaryWithBonus(),0.01);
    }@Test
    @DisplayName("Age > 30")
    public void salaryForMore30(){
        person.setAge(31);
        assertEquals(131.25,person.salaryWithBonus(),0.01);
    }
}
