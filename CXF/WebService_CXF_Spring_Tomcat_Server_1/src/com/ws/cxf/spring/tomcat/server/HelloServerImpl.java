package com.ws.cxf.spring.tomcat.server;

import javax.jws.WebService;
import org.springframework.stereotype.Component;

@WebService
@Component
public class HelloServerImpl implements HelloService {

	/**@Component是将实现类交给spring管理。相当于spring.xml中的<bean>
	 * 发布地址 : http://localhost:8080/WebService_CXF_Spring_Tomcat_Server_1/ws
	 * 
	 */
	@Override
	public String sayHello(String name) {
		student student = new student();
		String nameString = student.getNameString();
		return "Hello : " + name + nameString;
	}

	@Override
	public String sayGoodBye(String name) {
		// TODO Auto-generated method stub
		return "GoodBye :" + name;
	}

}
