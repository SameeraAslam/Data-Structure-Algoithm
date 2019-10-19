import java.util.Scanner;
class Area1{
	double length,breadth;
	
	//method that sets the dimensions as length and breadth
	public void SetDim(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	//method that returns calculated area
	double getArea(){
		double z=length*breadth;
		return z;
	}
public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	double l,b;
	System.out.print("Enter Length Of Rectangle=");
	l=obj.nextDouble();
	System.out.print("Enter Breadth Of Rectangle=");
	b=obj.nextDouble();
	Area1 a=new Area1();
	a.SetDim(l,b);
	System.out.println("Area is="+a.getArea());
	
	
	
}
}

		