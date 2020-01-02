package com.cgt.mavenweb.config;

import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan("com.cgt.mavenweb")
@PropertySource("classpath:database.properties")
public class MyDispatcherServletConfig {

	@Autowired
	private Environment environment;
	
	@Bean
	public ComboPooledDataSource dataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		
		try {
			dataSource.setDriverClass(this.environment.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dataSource.setJdbcUrl(this.environment.getProperty("jdbc.url"));
		dataSource.setUser(this.environment.getProperty("jdbc.username"));
		dataSource.setPassword(this.environment.getProperty("jdbc.password"));
		
		// connection pool config
		dataSource.setMaxPoolSize(Integer.parseInt(this.environment.getProperty("pool.maxPoolSize")));
		dataSource.setMinPoolSize(Integer.parseInt(this.environment.getProperty("pool.minPoolSize")));
		dataSource.setMaxIdleTime(Integer.parseInt(this.environment.getProperty("pool.maxIdleTime")));

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
