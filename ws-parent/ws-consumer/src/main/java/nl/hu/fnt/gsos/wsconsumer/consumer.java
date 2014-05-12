//package nl.hu.fnt.gsos.wsconsumer;
//
//import java.math.BigInteger;
//
//import nl.hu.fnt.gsos.wsinterface.Fault_Exception;
//import nl.hu.fnt.gsos.wsinterface.PowerService;
//import nl.hu.fnt.gsos.wsinterface.Request;
//import nl.hu.fnt.gsos.wsinterface.WSInterface;
//
//public class consumer {
//
//	public static void main(String[] args) throws Fault_Exception {
//		PowerService ps = new PowerService();
//		WSInterface wsi = ps.getWSPort();
//		Request r = new Request();
//		r.setPower(new BigInteger("2"));
//		r.setX(new BigInteger("2"));
//		System.out.println(wsi.calculatePower(r));
//		System.out.println("Test");
//	}
//
//}
