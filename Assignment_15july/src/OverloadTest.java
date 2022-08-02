
	class Test

	{

	 int sum(int x,int y)

	 {

	 return x+y;

	 }

	int sum(int x,int y,int z)

	 {

	 return x+y+z;

	 }

	float sum(int x,float y)

	 {

	 return x+y;

	 }

	float sum(float x,int y)

	 {

	 return x+y;

	 }

	float sum(float x,float y)

	 {

	 return x+y;

	 }

	}//class

	public class OverloadTest {

	

	 public static void main(String[] args)

	 {

	 Test t=new Test();

	 int res=t.sum(34,56);

	 System.out.println("sum is "+res);

	 System.out.println("sum is "+t.sum(45,23.56f));

	 System.out.println("sum is "+t.sum(45,89));

	 System.out.println("sum is "+t.sum(45.45f,67));

	 System.out.println("sum is "+t.sum(45.34f,23.56f));

	 System.out.println("sum is "+t.sum(34,56,78));

	 }//main

	}//class



