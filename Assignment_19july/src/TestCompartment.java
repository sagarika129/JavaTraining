import java.util.Random;
public class TestCompartment {

	public static void main(String[] args) {
		Random r=new Random();
		Compartment cr[]=new Compartment[10];
		for(int i=0;i<10;i++)
		{
			cr[i]=StoreComp(r.nextInt(4)+1);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(cr[i].notice());
		}
	}
		static Compartment StoreComp(int x)
		{
		switch(x) 
		{
		case 1:
			Ladies l= new Ladies();
			return l;
		case 2:
			FirstClass f=new FirstClass();
			return f;
		case 3:
			General g=new General();
			return g;
		case 4:
			Luggage lg=new Luggage();
			return lg;
		default:
			return new Ladies();
	}


	}

}

abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public  String notice()
	{
		return "This is First Class";
	}
}
class Ladies extends Compartment{
	public  String notice()
	{
		return "Only for Ladies";
	}
	
}
class  General extends Compartment{
	public  String notice()
	{
		return " This is General";
	}
	
}
class Luggage extends Compartment{
	public  String notice()
	{
		return "Put your Luggage here";
	}
	
}
