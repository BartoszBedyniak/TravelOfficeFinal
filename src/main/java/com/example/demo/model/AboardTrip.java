package com.example.demo.model;

import lombok.Data;

@Data
public class AboardTrip extends Trip {
    double insurance;

    public double getInsurance() {
        return insurance;
    }

    public AboardTrip(MyDate start, MyDate end, String description, double insurance) {
        super(start, end, description);
        this.insurance = insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public AboardTrip(MyDate start, MyDate end, String description) {
        super(start, end, description);
    }

    @Override
    public double getPrince() {
        return super.getPrince()+insurance;
    }

    @Override
    public void setPrince(double prince) {
        super.setPrince(prince);
    }


}
