package info.vinkrish.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import info.vinkrish.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Vinay");
		customer.setSecondName("Krishna");
		
		customers.add(customer);
		
		return customers;
	}
}
