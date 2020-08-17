import java.util.*;
class Triangle
{
double Area;
Triangle(double a,double b,double c){
	double s=(a+b+c)/2;
Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));  
   }
}
 class Demo{
	 
   public static void main(String args[]){ 
   
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter 1st side:");
       double a= sc.nextDouble();
       System.out.println("Enter 2nd side:");
       double b= sc.nextDouble();
       System.out.println("Enter 3rd side:");
	   double c= sc.nextDouble();
	   
       Triangle t=new Triangle(a,b,c);
      System.out.println("Area of Triangle is: " + t.Area);      
     }
}