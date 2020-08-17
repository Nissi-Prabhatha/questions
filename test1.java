import java.util.*;
 class Rectangle{
    int width;
    int height;
	Rectangle(){
		
	}
	
     void display()
    {
        System.out.println(width+" "+height);
        
    }
}
class RectangleArea extends Rectangle{
	RectangleArea(){
		
	}
    void read_input(){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter width:");
        width=sc.nextInt();
		System.out.println("Enter height:");
        height=sc.nextInt();
        
    }
    void display()
    {
		super.display();
        System.out.println("AREA of RECTANGLE is:"+width*height);
    }
}
class Test{
     public static void main(String []args){
		 RectangleArea a=new RectangleArea();
        a.read_input();
		//Rectangle r=new RectangleArea();
        a.display();
     }
}
