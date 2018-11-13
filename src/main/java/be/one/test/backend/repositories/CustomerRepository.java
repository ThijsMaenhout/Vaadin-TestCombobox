package be.one.test.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import be.one.test.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
