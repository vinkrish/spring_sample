package info.vinkrish.service;

import java.util.List;

import info.vinkrish.model.Customer;
import info.vinkrish.repository.CustomerRepository;
import info.vinkrish.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();;

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
