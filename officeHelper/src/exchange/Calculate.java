package exchange;

public class Calculate {
	private GetRate rate = new GetRate();
	
	public void run(double cz, double eu, double us) {
		double[] rates = this.rate.get();
		
		
		if(cz == 0 && eu == 0 && us != 0) {
			cz = us * rates[0];
			eu = us * rates[5];
			Exchange.frame.write(cz, eu, us);
		} else if(cz == 0 && us == 0 && eu != 0) {
			cz = eu * rates[2];
			us = eu * rates[4];
			Exchange.frame.write(cz, eu, us);
		}
		else if(eu == 0 && us == 0 && cz != 0) {
			eu = cz * rates[3];
			us = cz * rates[1];
			Exchange.frame.write(cz, eu, us);
		} else {
			cz = 0;
			eu = 0;
			us = 0;
			Exchange.frame.write(cz, eu, us);
		}
		
		
	}
	
}
