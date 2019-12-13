package com.example.demo.model;

import lombok.Data;

@Data
public class Adress {
    private String street;
    private String city;
    private int zip;
    public Adress(String street,String city,int zip)
    {
        this.city=city;
        this.street=street;
        this.zip=zip;
    }
    public Adress()
    {

    }


    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                '}';
    }
}
