package oops.Assignment.discount.Service;

import oops.Assignment.discount.Customer;
import oops.Assignment.discount.Discount;

import java.util.List;

public class DiscountService {

    private static final int LIMIT = 100;

    public Discount[] getAllCustomersDiscount(){

        Discount[] discounts = new Discount[LIMIT];
        CustomerService customerService = new CustomerService();
        Customer[] allCustomers = customerService.getAllCustomers();

        for(int i=0;i< LIMIT;i++){
            Discount discount = buildDiscount();
            discounts[i] = discount;
        }
        return discounts;
    }
    private Discount  buildDiscount(Customer customer) {
        int visitCount = customer.getVisitCount();
        int orderCount = customer.getOrderCount();
        String name = customer.getName();

        int discountInPercentage = calculateDiscount(visitCount, orderCount);
            Discount discount = new Discount();
            discount.setCustomerName(name);
            discount.setDiscount(discountInPercentage);
            return discount;
        }
        private int calculateDiscount(int visitCount, int orderCount){
            int totalCount = visitCount + orderCount;
            if (totalCount > 1000) {
                return 50;
            }
            if (totalCount > 750) {
                return 40;
            }
            if (totalCount > 500) {
                return 30;
            }
            if (totalCount > 250) {
                return 20;
            }
            if (totalCount > 100) {
                return 10;
            }
            return 0;

        }

    }
}
