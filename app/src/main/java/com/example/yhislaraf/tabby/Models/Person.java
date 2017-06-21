package com.example.yhislaraf.tabby.Models;

/**
 * Created by yhislaraf on 21-06-17.
 */

public class Person {

    private String name;
    private Country country;

    public Person(String name, Country country){
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
