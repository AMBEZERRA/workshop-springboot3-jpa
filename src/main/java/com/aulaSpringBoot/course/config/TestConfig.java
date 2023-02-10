package com.aulaSpringBoot.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aulaSpringBoot.course.entities.Order;
import com.aulaSpringBoot.course.entities.User;
import com.aulaSpringBoot.course.repositories.OrderRepository;
import com.aulaSpringBoot.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	// classe de configuração para instanciar o DB
	@Autowired
	private UserRepository userRepository;
// tudo que for colocado dentro desse método será instanciado quando inicar 
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Braw", "mariaB@gmail.com", "9888888555", "1234556");
		User u2 = new User(null, "Alex Green", "agreen@gmail.com", "8598565899", "5151255");
		
		// formato ISO 8601
				Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
				Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
				Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
				userRepository.saveAll(Arrays.asList(u1, u2));
				orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}

}
