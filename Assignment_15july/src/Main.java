
public class Main {

	public static void main(String[] args) {
		Box obj=new Box(6,8,4);
		int vl=obj.knowVolume();
		System.out.println("Volume of the box is "+vl);
	}

}
class Box{
	int height,width,depth;
	Box(int h,int w,int d)
	{
		height=h;
		width=w;
		depth=d;
	}
	int knowVolume()
	{
		int vl=height*width*depth;
		return vl;
	}
	
}
