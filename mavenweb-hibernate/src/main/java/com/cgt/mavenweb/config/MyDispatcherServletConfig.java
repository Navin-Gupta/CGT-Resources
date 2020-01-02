package com.cgt.mavenweb.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.cgt.mavenweb")
@PropertySource("classpath:database.properties")
public class MyDispatcherServletConfig {

	/*@Value("${jdbc.url}")
	private String driver;*/
	@Autowired
	private Environment environment;
	
	
	public ComboPooledDataSource getPoolDataSource() {
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
	
	public Properties getHibernateProperties() {
		Properties properties = new Properties();
		
		// properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.setProperty("hibernate.dialect", this.environment.getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.show_sql", this.environment.getProperty("hibernate.show_sql"));
		return properties;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		sessionFactory.setDataSource(this.getPoolDataSource());
		sessionFactory.setHibernateProperties(this.getHibernateProperties());
		sessionFactory.setPackagesToScan(this.environment.getProperty("hibernate.packagesToScan"));
		
		return sessionFactory;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		
		// txManager.setSessionFactory(this.sessionFactory());
		txManager.setSessionFactory(sessionFactory);
		
		return txManager;
	}
	
	
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
