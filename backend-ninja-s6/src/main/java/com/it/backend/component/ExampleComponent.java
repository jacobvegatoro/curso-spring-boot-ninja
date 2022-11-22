package com.it.backend.component;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("ExampleComponent")
public class ExampleComponent {
	
	private static final Log LOG=LogFactory.getLog(ExampleComponent.class);
	
	public void sayHello() {
		LOG.info("Hello from component");
	}
}
