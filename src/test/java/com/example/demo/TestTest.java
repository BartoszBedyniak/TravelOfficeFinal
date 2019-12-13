package com.example.demo;

import com.example.demo.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class TestTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void TestCustomer()throws Exception {

        Customer customer = FunctionForTestCustomer();
        assertThat(FunctionForTestCustomer().getName().equals("A"));

    }



    private Customer FunctionForTestCustomer() throws Exception {
        Customer customer = getCustomer();
        String postValue = OBJECT_MAPPER.writeValueAsString(customer);
        MvcResult storyResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/Customer")//sciezka
                .contentType(MediaType.APPLICATION_JSON)
                .content(postValue))//
                .andExpect(status().isOk())
                .andDo(print())//logowanie
                .andReturn();
        return OBJECT_MAPPER.readValue(storyResult.getResponse().getContentAsString(),Customer.class);//pobieramy i wysylamy do obiektu "Customer.class

    }

    private Customer getCustomer() {
        Customer customer = new Customer();
        customer.setName("A");
        customer.setAdress(new Adress("zzzzz", "cccccc", 11111));
        customer.setTrip(new AboardTrip(
                new MyDate(19, 11, 2019), new MyDate(19, 12, 2019),
                "xxxxx"));
        return customer;
    }

    @Test
    public void secondTest()throws Exception {

        Customer customer = FunctionForTestCustomer();


    }



    private Customer FunctionForSecondTest2() throws Exception {
        Customer customer = getCustomer();

        String postValue = OBJECT_MAPPER.writeValueAsString(customer);
        MvcResult storyResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/Customer")//sciezka

                .contentType(MediaType.APPLICATION_JSON)
                .content(postValue))//
                .andExpect(status().isOk())
                .andDo(print())//logowanie
                .andReturn();
        return OBJECT_MAPPER.readValue(storyResult.getResponse().getContentAsString(),Customer.class);//pobieramy i wysylamy do obiektu "Customer.class

    }



}
