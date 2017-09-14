package com.ws.cxf.spring.tomcat.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-02-09T22:55:42.069+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "HelloServerImplService", 
                  wsdlLocation = "http://localhost:8080/WebService_CXF_Spring_Tomcat_Server_1/ws/sayHello?wsdl",
                  targetNamespace = "http://server.tomcat.spring.cxf.ws.com/") 
public class HelloServerImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.tomcat.spring.cxf.ws.com/", "HelloServerImplService");
    public final static QName HelloServerImplPort = new QName("http://server.tomcat.spring.cxf.ws.com/", "HelloServerImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/WebService_CXF_Spring_Tomcat_Server_1/ws/sayHello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloServerImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/WebService_CXF_Spring_Tomcat_Server_1/ws/sayHello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloServerImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServerImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServerImplPort")
    public HelloService getHelloServerImplPort() {
        return super.getPort(HelloServerImplPort, HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServerImplPort")
    public HelloService getHelloServerImplPort(WebServiceFeature... features) {
        return super.getPort(HelloServerImplPort, HelloService.class, features);
    }

}
