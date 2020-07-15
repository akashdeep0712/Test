package hcltest;

public class MainClass {
	
	public static void main(String a[]) {
		   Initiator initiater = new Initiator();
	        Responder responder = new Responder();

	        initiater.addPriceListener(responder);

	        initiater.sayHello(); 
	}

}
