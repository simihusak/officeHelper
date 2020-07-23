package exchange;

public class GetRate {
	
	public double[] get() {
		
		double usdcze = 23.38;
		double czeusd = 0.043;
		
		double eurcze = 26.70;
		double czeeur = 0.037;
		
		double eurusd = 1.14;
		double usdeur = 0.88;
		
		double[] rates = {usdcze, czeusd, eurcze, czeeur, eurusd, usdeur};
		
		return(rates);
	}
	
}