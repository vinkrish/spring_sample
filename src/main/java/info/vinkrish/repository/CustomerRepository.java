package info.vinkrish.repository;

import java.util.List;

import info.vinkrish.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}