import java.util.Scanner;
public class Employee {
    int salary,workhour;
    void getInfo(int salary, int workhour){
        this.salary=salary;
        this.workhour=workhour;
    }
    void AddSal(){
        if(salary<500){
            salary+=10;
            
        }
    }
     void AddWork(){
        if(workhour>6){
            salary+=5;
		
         System.out.println("Final Salary="+salary);
		 
		 
     
            
        }
    }
     
     public static void main(String a[]){
         Scanner obj=new Scanner(System.in);
         int s,w;
         System.out.print("Enter Salary=");
         s=obj.nextInt();
          System.out.print("Enter No of workhours perday=");
         w=obj.nextInt();
         Employee e=new Employee();
         e.getInfo(s,w);
         e.AddSal();
         e.AddWork();
         
         
         
         
         
     }
     }





   
    

