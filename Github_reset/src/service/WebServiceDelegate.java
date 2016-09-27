package service;

@javax.jws.WebService(targetNamespace="http://service/",serviceName="WebServiceService",portName="WebServicePort",wsdlLocation="WEB-INF/wsdl/WebServiceService.wsdl")
public class WebServiceDelegate{

	service.WebService webService=new service.WebService();

	public String test(String userName){
		return webService.test(userName);
	}

}