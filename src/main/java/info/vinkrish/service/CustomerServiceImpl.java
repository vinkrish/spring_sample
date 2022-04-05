package info.vinkrish.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import info.vinkrish.model.Customer;
import info.vinkrish.repository.CustomerRepository;

@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		super();
		System.out.println("CustomerServiceImpl no args constructor");
	}
	
	@PostConstruct
    private void initialize() {
        System.out.println("We're called after the constructors");
    }
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection!");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
