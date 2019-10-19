import java.util.Scanner;
class Area2{
	double length,breadth;
	
	//constructor that sets values of length and breadth as an argument
	Area2(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	//method that returns calculated area
	double returnArea(){
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
	Area2 a=new Area2(l,b);
	System.out.println("Area="+a.returnArea());
}
}

		