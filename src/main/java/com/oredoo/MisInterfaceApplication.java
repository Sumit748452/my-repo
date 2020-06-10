package com.oredoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
public class MisInterfaceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MisInterfaceApplication.class, args);
	}

	 @Override
	    
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	    {
	    	return builder.sources(MisInterfaceApplication.class);
	    }
}
