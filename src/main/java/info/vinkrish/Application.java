package info.vinkrish;

import info.vinkrish.service.CustomerService;
import info.vinkrish.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
