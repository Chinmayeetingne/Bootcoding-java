package oops.Assignment.discount.Service;

import oops.Assignment.discount.Customer;

import java.util.UUID;


public class CustomerService {
    private static final int LIMIT = 100;
    public Customer[] getAllCustomers(){
        Customer[] customers = new Customer[LIMIT];
        for(int i= 0;i<LIMIT ;i++){
            Customer customer = buildCustomer();
            customers[0] = customer;
        }
        return customers;
    }
    private Customer buildCustomer(){
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setName(NameGenerator.getName());
        customer.setOrderCount(OrderCountGenerator.getOrderCount());
        customer.setVisitCount(VisitCountGenerator.getVisitCount());
        return customer;
    }
}
