package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Student;
import in.ashokit.repository.ProductRepository;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ProductRepository productRepository = context.getBean(ProductRepository.class);
		
		  Product p = new Product();
                  int i= 10;
		  p.setProductName("Keyboard");
		  p.setProductPrice(100.20);
		  productRepository.save(p);
		  
		  System.out.println(" Product Inserted");
		
	}
}
