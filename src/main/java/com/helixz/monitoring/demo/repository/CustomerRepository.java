package com.helixz.monitoring.demo.repository;

import com.helixz.monitoring.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chamith
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
