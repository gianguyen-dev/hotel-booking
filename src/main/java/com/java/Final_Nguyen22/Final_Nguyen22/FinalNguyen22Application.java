package com.java.Final_Nguyen22.Final_Nguyen22;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackages = {"com.java"})
@EntityScan("com.java.Model")
@EnableJpaRepositories("com.java.repository")
public class FinalNguyen22Application {

	public static void main(String[] args) {
		SpringApplication.run(FinalNguyen22Application.class, args);
	}
}