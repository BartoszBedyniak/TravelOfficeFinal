package com.example.demo.controller;

import com.example.demo.exception.MyException;
import com.example.demo.model.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import java.util.Map;

@Data
@RestController
public class Test {

    @Autowired
    private TravelOffice office;

    @PostMapping("/display")
    public String FunkcjaWyswietlanie() {

        StringBuilder sb = new StringBuilder();


        for (Customer c : office.getCustomerList().values()) {

            if (c.getTrip() instanceof AboardTrip) {
                ((AboardTrip) c.getTrip()).setInsurance(100);
            }
            if (c.getTrip() instanceof DomesticTrip) {
                ((DomesticTrip) c.getTrip()).setOwnArrivalDiscount(10);
            }

        }

        sb.append(office.getInfo());
        return sb.toString();
    }

    @GetMapping("/add")
    public void FunkcjaWstawianie() {

        office.addCustomer("bborys2", new DomesticTrip(new MyDate(2000, 12, 12), new MyDate(2000, 12, 12), "Polska"), new Adress("Sachar", "lodz", 92515));
        office.addCustomer("bborys2", new AboardTrip(new MyDate(2000, 12, 12), new MyDate(2000, 12, 12), "Anglia"), new Adress("Fajna", "lodz", 92515));
        office.getCustomerList().get((long) 1).getTrip().setPrince(1000);
        office.getCustomerList().get((long) 2).getTrip().setPrince(2000);

    }
    @GetMapping("/JSON")
    public Map<Long,Customer> DisplayDataJSON(){
        return office.getCustomerList();
    }
    @PostMapping("/Customer")
    public Customer Post(@RequestBody Customer customer) {
        office.addCustomer(null, null, null);
       // return customer;
        return office.getCustomerList().get((long)1);

    }
    @PostRemove()
    public void Remove() {


    }
    @PostUpdate()
    public void Update() {


    }
}
