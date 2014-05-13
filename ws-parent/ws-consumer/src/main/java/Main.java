import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import nl.hu.fnt.gsos.weatherinterface.GlobalWeatherSoap;
import nl.hu.fnt.gsos.wsinterface.ICalculator;

public class Main {
	public static void main(String[]args) throws MalformedURLException{
//	   	URL wsdlURL = new URL("http://soaptest.parasoft.com/calculator.wsdl");
//	   	QName serviceName = new QName("http://www.parasoft.com/wsdl/calculator/", "Calculator");
//	   	Service calcService = Service.create(wsdlURL,serviceName);
//	   	ICalculator calc = calcService.getPort(ICalculator.class);
//	   	float result = calc.add(2.0f, 2.0f);
//	   	System.out.println(result);
//	   	
//	   	wsdlURL = new URL("http://www.webservicex.com/globalweather.asmx?WSDL");
//	   	serviceName = new QName("http://www.webserviceX.NET", "GlobalWeather");
//	   	Service weatherService = Service.create(wsdlURL, serviceName);
//	   	GlobalWeatherSoap weather = weatherService.getPort(GlobalWeatherSoap.class);
//	   	String result2 = weather.
	   	String weather ="<?xml version=\"1.0\" encoding=\"utf-16\"?>\n"+
	   	"<CurrentWeather>\n"+
	    "<Location>Soesterberg, Netherlands (EHSB) 52-08N 005-17E 25M</Location>\n"+
	    "<Time>Nov 20, 2008 - 04:25 AM EST / 2008.11.20 0925 UTC</Time>\n"+
	    "<Wind> from the W (280 degrees) at 16 MPH (14 KT):0</Wind>\n"+
	    "<Visibility> greater than 7 mile(s):0</Visibility>\n"+
	    "<Temperature> 51 F (11 C)</Temperature>\n"+
	    "<DewPoint> 48 F (9 C)</DewPoint>\n"+
	    "<RelativeHumidity> 87%</RelativeHumidity>\n"+
	    "<Pressure> 29.83 in. Hg (1010 hPa)</Pressure>\n"+
	    "<Status>Success</Status>\n"+
	  "</CurrentWeather>";
	   	
	   	//parse weather data
	   	int i = weather.indexOf("<Temperature>");
	   	int iend = weather.indexOf("</Temperature>");
	   	String tempSub = weather.substring(i, iend);
	   	i = tempSub.indexOf('(');
	   	iend = tempSub.indexOf(')');
	   	String celcius = tempSub.substring(++i,iend);
	   	String result = celcius.split("\\s")[0];
	   	
	}
}
