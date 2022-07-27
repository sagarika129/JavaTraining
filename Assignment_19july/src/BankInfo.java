
public class BankInfo {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		System.out.println("ICICI Savings Interest Rate "+i.getSavingsInterestRate());
		System.out.println("ICICI Fixed Deposit Interest Rate "+i.getFixedDepositInterestRate());
		
		KotMBank k=new KotMBank();
		System.out.println("KotM Savings Interest Rate "+k.getSavingsInterestRate());
		System.out.println("KotM Fixed Deposit Interest Rate "+k.getFixedDepositInterestRate());
		
		GeneralBank gk=new KotMBank();
		System.out.println("KotM Savings Interest Rate using General bank ref "+gk.getSavingsInterestRate());
		System.out.println("KotM Fixed Deposit Interest Rate using General bank ref "+gk.getFixedDepositInterestRate());
		
		GeneralBank gi=new ICICIBank();
		System.out.println("ICICI Savings Interest Rate using General bank ref "+gi.getSavingsInterestRate());
		System.out.println("ICICI Fixed Deposit Interest Rate using General bank ref "+gi.getFixedDepositInterestRate());



	}

}
abstract class GeneralBank{
	abstract String getSavingsInterestRate();
	abstract String getFixedDepositInterestRate ();
	
}
class ICICIBank extends GeneralBank{
	String getSavingsInterestRate()
	{
		return "4%";
	}
	String getFixedDepositInterestRate ()
	{
		return "8.5%";
	}
	
}

class KotMBank extends GeneralBank{
	String getSavingsInterestRate()
	{
		return "6%";
	}
	String getFixedDepositInterestRate ()
	{
		return "9%";
	}
}

