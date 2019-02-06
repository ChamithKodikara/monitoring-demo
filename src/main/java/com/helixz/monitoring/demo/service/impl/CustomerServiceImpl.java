package com.helixz.monitoring.demo.service.impl;

import com.helixz.monitoring.demo.entity.Customer;
import com.helixz.monitoring.demo.repository.CustomerRepository;
import com.helixz.monitoring.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author Chamith
 */
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> retrieveCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

}
