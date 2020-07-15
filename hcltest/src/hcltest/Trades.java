package hcltest;

public class Trades implements ExecutionService {

	/**
	 * Implementaion of Trades
	 */
	@Override
	public void buy(String security, double price, int volume) {
		System.out.println("Bought "+volume +" of "+security+"at "+price);

	}

	@Override
	public void sell(String security, double price, int volume) {
		System.out.println("Sold "+volume +" of "+security+"at "+price);
	}

}
