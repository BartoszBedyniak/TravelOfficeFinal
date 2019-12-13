package com.example.demo.model;

import lombok.Data;

@Data
public class MyDate {
    private int year;
    private int day;
    private int month;
    public MyDate(int year,int month, int day) {
        this.year = year;
        this.day = day;
        this.month = month;
    }
    public MyDate() {

    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }


    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", day=" + day +
                ", month=" + month +
                '}';
    }
}
