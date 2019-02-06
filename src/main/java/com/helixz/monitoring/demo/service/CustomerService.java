package com.helixz.monitoring.demo.service;

import com.helixz.monitoring.demo.entity.Customer;

import java.util.Optional;

/**
 * @author Chamith
 */
public interface CustomerService {

    Customer saveCustomer(Customer customer);

    Optional<Customer> retrieveCustomerById(Long customerId);
}
