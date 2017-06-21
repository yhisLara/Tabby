package com.example.yhislaraf.tabby.Models;

/**
 * Created by yhislaraf on 21-06-17.
 */

public class Country {

    private String name;
    private String countryCode;

    public Country(String name, String countryCode){
        this.name = name;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void getFlagUrl(String countryCode){
        //http://www.geognos.com/api/en/countries/ ag/{0}.png
    }

}
