package info.vinkrish.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import info.vinkrish.model.Customer;
import info.vinkrish.util.CalendarFactory;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	@Autowired
    private Calendar cal;
	
	@Override
	public List<Customer> findAll() {
		
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Vinay");
		customer.setSecondName("Krishna");
		
		System.out.println("cal: " + cal.getTime());
		
		customers.add(customer);
		
		return customers;
	}
}
