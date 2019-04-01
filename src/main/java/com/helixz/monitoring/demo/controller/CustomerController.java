package com.helixz.monitoring.demo.controller;

import com.helixz.monitoring.demo.dto.request.CustomerCreateRequest;
import com.helixz.monitoring.demo.dto.response.CustomerCreateResponse;
import com.helixz.monitoring.demo.dto.response.CustomerViewResponse;
import com.helixz.monitoring.demo.entity.Customer;
import com.helixz.monitoring.demo.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Chamith
 */
@Api("Sample Customer Rest API Documentation")
@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ModelMapper modelMapper;

    @ApiOperation("Customer create API Documentation is here")
    @PostMapping
    public ResponseEntity<CustomerCreateResponse> create(@Validated @RequestBody CustomerCreateRequest request) {
        Customer customer = modelMapper.map(request, Customer.class);
        Customer savedCustomer = customerService.saveCustomer(customer);
        CustomerCreateResponse response = modelMapper.map(savedCustomer, CustomerCreateResponse.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @ApiOperation("Customer search API Documentation is here")
    @GetMapping(value = "/{id}")
    public ResponseEntity<CustomerViewResponse> create(@PathVariable Long id) {
        Optional<Customer> customer = customerService.retrieveCustomerById(id);
        if (customer.isPresent()) {
            CustomerViewResponse response = modelMapper.map(customer.get(), CustomerViewResponse.class);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new CustomerViewResponse(), HttpStatus.OK);
        }
    }
}
