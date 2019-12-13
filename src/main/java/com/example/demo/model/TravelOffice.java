package com.example.demo.model;


import com.example.demo.exception.MyException;
import lombok.Data;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;



@Data
@Repository
public class TravelOffice {
    private Map<Long,Customer>customerList=new HashMap<>();//musi byc prywatne i tworzymy gettera do ktorego sie odwolujemy

    public Map<Long, Customer> getCustomerList() {
        return customerList;
    }

    long count=0;

    public String getInfo()
    {
        String s= new String();
        for(Customer customer:customerList.values())
        {
            if(customer!=null) {
               s = s + customer.toString() + " \n";
          }
       }
        System.out.println("Klienci:\n");
        return s;

}
    public void  addCustomer(String name, Trip trip, Adress adress) {
       throw new MyException();
   //       customerList.put((long)customerList.size()+1, new Customer(name));
   //      customerList.get((long)customerList.size()).assignTrip(trip);//zamiana na longa
   //     customerList.get((long)customerList.size()).setAdress(adress);

    }

    public void addCustomer(Customer customer)
    {
        count++;
        customerList.put(count,customer);
    }
    public void addCustomer2(Customer customer)
    {

        customerList.put(1L,customer);
    }
    public long getCustomerCount()
    {
        return count;
    }

    @Override
    public String toString() {
        return "TravelOffice{" +
                "customerList=" + customerList +
                ", count=" + count +
                '}';
    }
}
