
public class AgeValidation {

	public static void main(String[] args) throws AgeException {
		String nm=args[0];
		int age=0;
		try {
		age=Integer.parseInt(args[1]);
		if(age>60||age<1)
		{
			throw new AgeException(age);
		}
		
		}catch(NumberFormatException e) {
			System.out.println("age should be an integer");
		}
		
		
	}

}
 class AgeException extends Exception{
	 AgeException(int a)
	 {
		 System.err.println(a+" is not allowed");
	 }
 }