import java.util.*;
class Complex { 
  
    int real, imaginary; 
    Complex()  { 
	}
    Complex(int rel, int imag) { 
        real = rel; 
        imaginary = imag; 
    } 
  
    Complex addComp(Complex C1, Complex C2) 
    { 
        
        Complex com = new Complex();  
        com.real = C1.real + C2.real; 
        com.imaginary = C1.imaginary + C2.imaginary; 
        return com; 
    } 
    Complex subtractComp(Complex C1, Complex C2) 
    {  
        Complex com = new Complex(); 
        com.real = C1.real - C2.real; 
        com.imaginary = C1.imaginary - C2.imaginary;  
        return com; 
    } 
	Complex productComp(Complex C1, Complex C2) 
	{
		Complex com =new Complex();
		com.real=((C1.real*C2.real)-(C1.imaginary*C2.imaginary));
		com.imaginary=((C1.real*C2.imaginary)+(C1.imaginary*C2.real));
		return com;
	}
    void printComplexNumber() 
    { 
        System.out.println("Complex number: "
                           + real + " + "
                           + imaginary + "i"); 
    } 
} 
class Exam{ 
    public static void main(String[] args) 
    { 
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();

        Complex C1 = new Complex(a, b); 
        C1.printComplexNumber(); 
		
        int c=sc.nextInt();
        int d=sc.nextInt();
      
        Complex C2 = new Complex(c, d); 
        C2.printComplexNumber(); 
  
        Complex C3 = new Complex(); 
		
        C3 = C3.addComp(C1, C2); 
        System.out.print("Sum of "); 
        C3.printComplexNumber(); 
  
        C3 = C3.subtractComp(C1, C2); 
        System.out.print("Difference of "); 
        C3.printComplexNumber(); 
		
		C3 = C3.productComp(C1, C2); 
        System.out.print("Product of "); 
        C3.printComplexNumber(); 
    } 
}