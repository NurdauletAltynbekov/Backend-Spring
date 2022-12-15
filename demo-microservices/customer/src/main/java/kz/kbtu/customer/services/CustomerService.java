package kz.kbtu.customer.services;

import kz.kbtu.customer.models.Customer;
import kz.kbtu.customer.repositories.CustomerRepository;
import kz.kbtu.customer.request.CustomerRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getFirstname())
                .build();
        customerRepository.save(customer);
    }
}
