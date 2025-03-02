package com.tekadept.demo;

import com.tekadept.demo.domain.model.Person;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello, Java");

        Person Bob = new Person("Robert", "Smith");
        System.out.println("The new employee's name is " + Bob.getFirstName());

        Bob.setFirstName("Bob");
        System.out.println("His name is now " + Bob.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2010);
        System.out.println("The max value is " + maxInt);
    }
}
