package com.tts.ShoppingCart;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	/*
	 * @Override public void addViewControllers(ViewControllerRegistry registry) {
	 * registry.addViewController("/").setViewName("home"); }
	 */
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
			.addResourceHandler("/media/**")
			.addResourceLocations("file:/C:/Users/paulh/Documents/workspace-spring-tool-suite-4-4.6.2.RELEASE/ShoppingCart/src/main/resources/static/media/");
	
	}
	
	
}
