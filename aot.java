import java.util.*;
class Triangle 
{
  public static void main(String args[]){   
     Scanner s= new Scanner(System.in);
         System.out.println("Enter 1st side:");
         int a= s.nextInt();
     System.out.println("Enter 2nd side:");
     int b= s.nextInt();
         System.out.println("Enter the 3rd side:");
         int c= s.nextInt();
  if((a+b)>c && (a+c)>b && (b+c)>a){
           int s=(a+b+c)/2;
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
             System.out.println("Area of Triangle is: " + area);    
           }
         else  
           System.out.println("Area of Triangle not exit");
   }
}