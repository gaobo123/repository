package com.ws.cxf.spring.tomcat.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

@WebService
public interface HelloService {
	
	public String sayHello(String name);
	
	public String sayGoodBye(String name);
}
