import java.util.Scanner;
public class KnowBmi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter patient weight(in kg)");
		float w=sc.nextFloat();
		System.out.println("Enter patient height(in meters)");
		float h=sc.nextFloat();
		Patient obj=new Patient(w,h);
		System.out.println("BMI of the patient "+obj.computeBMI());
	}

}
class Patient{
	float weight,height;
	Patient(float w,float h)
	{
		weight=w;
		height=h;
	}
	double computeBMI()
	{
		return weight/(height*height);
	}
}