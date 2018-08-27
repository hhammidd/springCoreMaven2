package com.spring.springData.jpaMysqlData.main;

import com.spring.springData.jpaMysqlData.service.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDataJPAMain {
    public static void main(String[] args) {
        //Create Spring application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/springDataJpa/springData.xml");

        //Get service from context.
        ProductService productService = ctx.getBean(ProductService.class);


		/* //this is mock data
		//Add some items
		productService.add(new Product(1, "Television"));
		productService.add(new Product(2, "Phone"));
		productService.addAll(Arrays.asList(
				new Product(3, "Peach"),
				new Product(4, "Strawberry"),
				new Product(5, "Melone"),
				new Product(6, "Onion")
				));

				*/

        //Test entity listing
        System.out.println("findAll=" + productService.findAll());

        //Test specified find methods
        System.out.println("findByName is 'Peach': " + productService.findByNameIs("Peach"));
        System.out.println("findByNameContainingIgnoreCase 'on': " + productService.findByNameContainingIgnoreCase("on"));

        ctx.close();
    }
}
