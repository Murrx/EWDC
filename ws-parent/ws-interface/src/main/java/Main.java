//import java.net.MalformedURLException;
//import java.net.URL;
//
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//
//import nl.hu.fnt.gsos.wsinterface.GlobalWeatherSoap;
//public class Main {
//	public static void main(String[]args) throws MalformedURLException{
////	   	URL wsdlURL = new URL("http://soaptest.parasoft.com/calculator.wsdl");
////	   	QName serviceName = new QName("http://www.parasoft.com/wsdl/calculator/", "Calculator");
////	   	Service calcService = Service.create(wsdlURL,serviceName);
////	   	ICalculator calc = calcService.getPort(ICalculator.class);
////	   	float result = calc.add(2.0f, 2.0f);
////	   	System.out.println(result);
////	   	
//	   	URL wsdlURL = new URL("http://www.webservicex.com/globalweather.asmx?WSDL");
//	   	QName serviceName = new QName("http://www.webserviceX.NET", "GlobalWeather");
//	   	Service weatherService = Service.create(wsdlURL, serviceName);
//	   	GlobalWeatherSoap weather = weatherService.getPort(GlobalWeatherSoap.class);
//	   	String result = weather.getWeather("soest", "netherlands");
//	   	System.out.println(result);
//	   	
//	}
//}
