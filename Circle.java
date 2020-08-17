import java.util.*;
public class Circle {  
   private double radius;
   private String color;
   
   public Circle() {
      radius = 1.0;
      color = "red";
   }
  public Circle(double r) {  
      radius = r;
      color = "red";
   }
   
  public double getRadius() {
     return radius; 
   }
   public double getArea() {
      return radius*radius*(22/7);
   }
 
   public static void main(String[] args) {
   Circle c1 = new Circle();
   System.out.println("The circle radius:"+ c1.getRadius() +" "+" area :" + c1.getArea());
   
   Circle c2 = new Circle(2.0);
   System.out.println("The circle radius of "+ c2.getRadius() + " "+" area :" + c2.getArea());
   }
   }