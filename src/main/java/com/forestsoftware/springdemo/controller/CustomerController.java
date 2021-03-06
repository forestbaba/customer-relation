package com.forestsoftware.springdemo.controller;


import com.forestsoftware.entity.Customer;
import com.forestsoftware.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model){

        List<Customer> customers = customerService.getCustomers();
//        System.out.println("PPP" + customers);
        model.addAttribute("customers", customers);
        return  "list-customers";
    }

    @GetMapping("/showFormAdd")
    public String showFormAdd(Model model){

        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return  "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){

        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

}
