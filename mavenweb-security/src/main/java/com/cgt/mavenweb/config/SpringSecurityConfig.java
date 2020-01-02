package com.cgt.mavenweb.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;



@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		// credential config
		
		// jdbc authentication
		auth.jdbcAuthentication().dataSource(this.dataSource);
			/*.usersByUsernameQuery("select * from userdetails where userid=? and password=?")
			.groupAuthoritiesByUsername("select roles from roletable where userid=?");*/
		
		
		// in memory auth
		/*UserBuilder builder = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()  // composable methods
			.withUser(builder.username("First").password("abc").roles("EMPLOYEE"))
			.withUser(builder.username("Second").password("abc").roles("EMPLOYEE","ADMIN"))
			.withUser(builder.username("Third").password("abc").roles("EMPLOYEE","MANAGER"));*/
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		/*http.authorizeRequests()
				.anyRequest()
				.authenticated()*/
		
		http.authorizeRequests()
			.antMatchers("/").hasRole("EMPLOYEE")
			.antMatchers("/manager/**").hasRole("MANAGER")
			.antMatchers("/admin/**").hasRole("ADMIN")
		.and()
			.formLogin()
				.loginPage("/custom-login")
				.loginProcessingUrl("/validate") // will be provided inbuilt...
				.permitAll()
		.and()  // HttpSecurity
			.logout()
				.logoutUrl("/logout").permitAll(); // will be provided
		/*.and()
			.exceptionHandling()
				.accessDeniedPage("/access-denied");*/
				
			
	}
	
}
