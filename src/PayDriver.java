
public class PayDriver {
public static void main(String[]args){
	Regularpay regular = new Regularpay();
	HazardPay hazard = new HazardPay();
	regular.computepay(4, 4);
	hazard.computepay(4, 4);
	System.out.println(regular.payrate);
	System.out.println(hazard.payrate);
}
}
