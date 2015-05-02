
public class HazardPay extends PayCalculator{
	
	@Override
	double computepay(double hours, double dollars) {
		payrate = dollars*hours*1.5;
		return (payrate);
		
	}

 
}
