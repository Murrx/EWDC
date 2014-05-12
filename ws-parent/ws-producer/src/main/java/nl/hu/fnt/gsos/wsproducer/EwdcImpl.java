//package nl.hu.fnt.gsos.wsproducer;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import javax.jws.WebService;
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//
//import nl.hu.fnt.gsos.wsinterface.Fault_Exception;
//import nl.hu.fnt.gsos.wsinterface.GlobalWeatherSoap;
//import nl.hu.fnt.gsos.wsinterface.ICalculator;
//import nl.hu.fnt.gsos.wsinterface.Request;
//import nl.hu.fnt.gsos.wsinterface.Response;
//import nl.hu.fnt.gsos.wsinterface.WSInterface;
//
//@WebService(endpointInterface = "nl.hu.fnt.gsos.wsinterface.WSInterface")
//public class EwdcImpl implements WSInterface {
//
////	@Override
////	public Response calculatePower(Request request) throws Fault_Exception {
////		ObjectFactory factory = new ObjectFactory();
////		Response response = factory.createResponse();
////		try {
////			Double result = Math.pow(request.getX().doubleValue(), request
////					.getPower().doubleValue());
////			// x en power zijn altijd gehele getallen dan is er geen afronding
////			long actualResult = result.longValue();
////			response.setResult(actualResult);
////		} catch (RuntimeException e) {
////			Fault x = factory.createFault();
////			x.setErrorCode((short) 1);
////			x.setMessage("Kan de macht van " + request.getX()
////					+ " tot de macht " + request.getPower().toString()
////					+ " niet berekenen.");
////			Fault_Exception fault = new Fault_Exception(
////					"Er ging iets mis met het berekenen van de power", x);
////			throw fault;
////		}
////		return response;
////	}
//
//	@Override
//	public Response calculateDifference(Request req) throws Fault_Exception{
//		
//	   	URL wsdlURL = null;
//		try {
//			wsdlURL = new URL("http://www.webservicex.com/globalweather.asmx?WSDL");
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		QName serviceName = new QName("http://www.webserviceX.NET", "GlobalWeather");
//	   	Service weatherService = Service.create(wsdlURL, serviceName);
//	   	GlobalWeatherSoap weather = weatherService.getPort(GlobalWeatherSoap.class);
//	   	
//	   	String loc1res= weather.getWeather(req.getLocation1().getCity(), req.getLocation1().getCountry());
//	   	String loc2res= weather.getWeather(req.getLocation2().getCity(), req.getLocation2().getCountry());
//
////	   	loc1res.indexOf("<Temperature>, fromIndex);
//		
////		URL wsdlURL = new URL("http://soaptest.parasoft.com/calculator.wsdl");
////	   	QName serviceName = new QName("http://www.parasoft.com/wsdl/calculator/", "Calculator");
////	   	Service calcService = Service.create(wsdlURL,serviceName);
////	   	ICalculator calc = calcService.getPort(ICalculator.class);
////	   	float result = calc.add(2.0f, 2.0f);
////	   	System.out.println(result);
////	   	
////	   	wsdlURL = new URL("http://www.webservicex.com/globalweather.asmx?WSDL");
////	   	serviceName = new QName("http://www.webserviceX.NET", "GlobalWeather");
////	   	Service weatherService = Service.create(wsdlURL, serviceName);
////	   	GlobalWeatherSoap weather = weatherService.getPort(GlobalWeatherSoap.class);
////	   	String result2 = weather.getWeather("soest", "netherlands");
////	   	System.out.println(result2);
//		return null;
//	}
//
//}
