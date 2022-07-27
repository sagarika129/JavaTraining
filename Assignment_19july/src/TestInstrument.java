
import java.util.Random;
public class TestInstrument {

	public static void main(String[] args) {
		Random rn=new Random();
		Instrument ins[]=new Instrument[10];
		  for (int i = 0; i < 10; i++) {
		    	int r= rn.nextInt(3)+1;
		    	
		    	if (r == 1)
		    		ins[i] =  new Flute();
		    	else if (r == 2)
		    		ins[i] =new Piano();
		    	else if (r== 3)
		    		ins[i] = new Guitar();
		    }
		  System.out.println("Index of all the objects");
		  for(int i=0;i<10;i++)
		  {
		  if (ins[i] instanceof Flute) 
	    		System.out.println("Index of Flute " + i);
	    	else if (ins[i] instanceof Piano) 
	    		System.out.println("Index of Piano " + i);
	    	else if (ins[i] instanceof Guitar) 
	    		System.out.println("Index of Guitar " + i);
	    }
		  System.out.println();
		  System.out.println("Polymorphic behavior of play method");
		  for(int i=0;i<10;i++)
		  {
			  ins[i].play();
		  }
	}

}
abstract class Instrument{
	abstract void play();
}
class Flute extends Instrument{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
	
}
class Piano extends Instrument{
	void play()
	{
		System.out.println("Piano is playing tan tan tan tan ");
	}
	
}
class Guitar extends Instrument{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin  ");
	}
	
}