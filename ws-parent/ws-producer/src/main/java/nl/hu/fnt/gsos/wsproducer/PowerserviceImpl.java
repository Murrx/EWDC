//package nl.hu.fnt.gsos.wsproducer;
//
//import javax.jws.WebService;
//
//@WebService(endpointInterface = "nl.hu.fnt.gsos.wsinterface.WSInterface")
//public class PowerserviceImpl implements WSInterface {
//
//	@Override
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
////
////}
