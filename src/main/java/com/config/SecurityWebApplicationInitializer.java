package com.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.stereotype.Component;

@Order(1)
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	//未使用spring将websecurityconfig传递到超类
//	public SecurityWebApplicationInitializer() {
//		super(WebSecurityConfig.class);
//	}
	
	
	
}
