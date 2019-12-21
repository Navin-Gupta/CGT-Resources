package com.cgt.mavenweb.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.cgt.mavenweb")
@PropertySource("classpath:database.properties")
public class MyDispatcherServletConfig {

	/*@Value("${jdbc.url}")
	private String driver;*/
	@Autowired
	private Environment environment;
	
	// exposing DataSource Bean
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		// config DS
		// dataSource.setDriverClassName("com.jdbc.mysql.Driver");
		// dataSource.setDriverClassName(this.driver);
		dataSource.setDriverClassName(this.environment.getProperty("jdbc.driver"));
		dataSource.setUrl(this.environment.getProperty("jdbc.url"));
		dataSource.setUsername(this.environment.getProperty("jdbc.username"));
		dataSource.setPassword(this.environment.getProperty("jdbc.password"));
		
		return dataSource;
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
		
}
