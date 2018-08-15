#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	//未使用spring将websecurityconfig传递到超类
//	public SecurityWebApplicationInitializer() {
//		super(WebSecurityConfig.class);
//	}
	public SecurityWebApplicationInitializer() {
		
	}
	
}
