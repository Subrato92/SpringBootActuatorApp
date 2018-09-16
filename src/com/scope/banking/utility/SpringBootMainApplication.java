package com.scope.banking.utility;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication( exclude = {SecurityAutoConfiguration.class })
// To Exclude Whitelabel error
@EnableAutoConfiguration( exclude = {ErrorMvcAutoConfiguration.class } )
@ComponentScan(basePackages="com.scope.banking.*")
@EnableJpaRepositories(basePackages="com.scope.banking.*")
@EntityScan("com.scope.banking.*")
public class SpringBootMainApplication {
	
	
	public static void main(String[] args){
		SpringApplication.run(SpringBootMainApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver(){
		SessionLocaleResolver sessLocRes = new SessionLocaleResolver();
		sessLocRes.setDefaultLocale(Locale.US);
		return sessLocRes;
	}
	
	@Bean
	public ResourceBundleMessageSource messageSource(){
		ResourceBundleMessageSource msgSrc = new ResourceBundleMessageSource();
		msgSrc.setBasename("messages");
		msgSrc.setDefaultEncoding("UTF-8");
		return msgSrc;
	}
	
}