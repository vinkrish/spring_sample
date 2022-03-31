package info.vinkrish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import info.vinkrish.repository.CustomerRepository;
import info.vinkrish.repository.HibernateCustomerRepositoryImpl;
import info.vinkrish.service.CustomerService;
import info.vinkrish.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service =  new CustomerServiceImpl(getCustomerRepository());
		return service;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}

}
