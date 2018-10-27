package com.spring.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.model.Customer;
import com.spring.repo.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyApplicationTests {

	@Autowired
	private CustomerRepository repository;
		
	@Test
	public void testSave() {
		Customer customer = new Customer();
		customer.setName("customer-test");
		repository.save(customer);
		
	}
	
	@Test
	public void testfindByName() {
		List<Customer> list=repository.findByName("customer1");
		list.forEach(p->System.out.println(p.getId()+"\t"+p.getName()));
	}

}
