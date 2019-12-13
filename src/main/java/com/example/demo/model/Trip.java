package com.example.demo.model;

import lombok.Data;

@Data
public class Trip {
    private MyDate start;
    private MyDate end;
    private String description;
    double prince;


    public Trip(MyDate start, MyDate end, String description)
    {
        this.start=start;
        this.end=end;
        this.description=description;
    }
    public Trip()
    {

    }

    @Override
    public String toString() {
        return "Trip{" +
                "start=" + start +
                ", end=" + end +
                ", description='" + description + '\'' +
                ", prince=" + prince +
                '}';
    }
}
