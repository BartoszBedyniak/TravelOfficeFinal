package com.example.demo.model;

import lombok.Data;

@Data
public class Customer {
    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    private String name;
    private Adress adress;
    private Trip trip;

    public Trip getTrip() {
        return trip;
    }

    public Customer(String name)
    {
        this.name=name;

    }
    public Customer()
    {

    }

    public Customer(String name, Adress adress, Trip trip) {
        this.name = name;
        this.adress = adress;
        this.trip = trip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(Adress adress) {
        this.adress=adress;
    }
    public void assignTrip(Trip trip)
    {
        this.trip=trip;
    }
//    public String toString()
//    {
//        return "Imie: "+this.name+"\n"+this.adress.toString()+"\n"+this.trip.toString();
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                ", trip=" + trip +
                '}';
    }
}
