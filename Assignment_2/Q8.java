package Assignment_2;

//h. Create a parameterized constructor in the above Box class to initialize 
//the instance variables. Then calculate the volume and print it.

public class Q8 {

	public static void main(String[] args){
		
		Box square=new Box(3,3,3);
		Box rectangle=new Box(23,43,23);
		int rectangleVol=rectangle.getVolume();
		int squareVol=square.getVolume();
		System.out.println("Volume of square :"+squareVol);
		System.out.println("Volume of rectange : "+rectangleVol);
		
	}
	
}
class Box{
	private int width,height,depth;
	
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	 public  int getVolume(){
		return this.width*this.height*this.depth;
	}
}

