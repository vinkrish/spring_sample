package info.vinkrish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import info.vinkrish.model.Customer;
import info.vinkrish.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		super();
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
