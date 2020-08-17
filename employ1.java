import java.util.*;
 class Employee {
    private String name,address;
    private int year;
	  public Employee(String name, int year, String address){
	      this.name = name;
	      this.year = year;
	      this.address = address;
	  }
	  public String toString(){
	      return this.name +"\t"+this.year+"\t"+this.address; 
	  }


    public static void main(String args[])
    {
        Employee e1=new Employee("Robert",1994,"64C- WallStreet");
        Employee e2=new Employee("Sam",2000,"68D- WallStreet");
        Employee e3=new Employee("John",1999,"26B- WallStreet");
       System.out.println("Name\t"+"year\t"+"Address\t"); 
       System.out.println(e1);
       System.out.println(e2);
       System.out.println(e3);
    }
}