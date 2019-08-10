package com.mythsman.test;

@Getterb
public class MyGetterb  {

    private String lastName;

    public MyGetterb(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "MyGetterb{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
}
