package info.vinkrish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import info.vinkrish.service.CustomerService;
import info.vinkrish.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"info.vinkrish"})
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service =  new CustomerServiceImpl();
		return service;
	}

}
