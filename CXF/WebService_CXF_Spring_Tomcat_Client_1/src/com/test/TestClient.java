package com.test;

import com.ws.cxf.spring.tomcat.server.HelloServerImplService;
import com.ws.cxf.spring.tomcat.server.HelloService;

public class TestClient {
	
	public static void main(String[] args) {
		HelloServerImplService helloService = new HelloServerImplService();
		HelloService service = helloService.getHelloServerImplPort();
		String response = service.sayHello("中科江南");
		System.out.println(response);
	}
}
