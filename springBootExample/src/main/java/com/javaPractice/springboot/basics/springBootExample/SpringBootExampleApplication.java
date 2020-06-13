package com.javaPractice.springboot.basics.springBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*First Demo
	http://localhost:8080/books -> will return a list of hard coded books
	Files:
		Book.java -> POJO 
		BooksController.java -> Maps a return of a list of Book POJOs to the /books URI extension
*/

/*Notes 

	Spring Boot vs Spring vs Spring MVC

	What is the core problem Spring Framework Solves?
		- Dependency Injection -> Define them easily so application is loosely coupled (modular)
			@Autowired -> very important in linking dependencies into your classes
		- Plumbing Code -> Reduce bulk code like massive try catches and PreparedStatements + ResultSets ETC
		- Good Integration with other frameworks
	What is the core problem Spring MVC Framework Solves?
		- Easier way to developing web applications
		- Makes Simple Concepts
			- Dispatcher Servlet
			- ModelAndView
			- View Resolver
	Spring Boot?
		- Makes configuration Easier
		- Less initial setup with everything packaged initially with Spring Boot!

*/

/*List of Common Spring Boot Starters
	https://www.javatpoint.com/spring-boot-starters
*/

/* Spring Actuator Notes
	Used to view MetaData in Spring Boot
	Use the Hal Browser to easily navigate through the meta data - auto starts with localhost8080

*/


@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootExampleApplication.class, args);

		for(String name: applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}

}
