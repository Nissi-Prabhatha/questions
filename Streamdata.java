import java.util.Arrays;
import java.util.List;

class Employee {
  
    private int id;
    private String name;
    private String designation;
	private int salary;
    private String location;
	Employee(int id,String name,String designation,int salary,String location)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.location=location;
	}
    public int getId() {
        return id;
    }
    public void setId(final int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(final String designation) {
        this.designation = designation;
    }
	public int getSalary(){
	     return salary;
    }
	public void setSalary(final int salary){
	   this.salary=salary;
	}
    public String getLocation() {
        return location;
    }
    public void setLocation(final String location) {
        this.location = location;
    }
    public String toString() {
        return "Employee: [id= " + getId() + ", name= " + getName() + ", designation= " + getDesignation() 
		+ ",salary=" +getSalary() +",location= " + getLocation() + "]";
    }
}
public class Streamdata{
	public static void main(String[] args){
		List<Employee> data=Arrays.asList(
				new Employee(1,"Nissi","Developer of softwarE",100000,"Hyderabad"),
				new Employee(2,"David","Intern",60000,"Mumbai"),
				new Employee(3,"Esther","Admin of DatabasE",10000,"Pondicherry"),
				new Employee(4,"Shiny","Software Engineer",20000,"Bangalore"),
				new Employee(5,"Grace","Web developer",80000,"Manipur"),
				new Employee(6,"Sushma","TechiE",90000,"Punjab"),
				new Employee(7,"Princy","leader of Team",10000,"Manali"),
				new Employee(8,"Mahima","HR",25000,"Guntur"),
				new Employee(9,"Pinky","Analyst",40000,"Mizoram"),
				new Employee(10,"Sam","Azure cloud developer",35000,"Pune")
				);
				System.out.println("names of employees:");	
		data.stream().forEach(n->System.out.println(n.getName()));
                System.out.println("Salary more than 50000:");	
		data.stream().filter(n->n.getSalary()>50000).forEach(n->System.out.println(n.getSalary()));
	            System.out.println("locations with letter M:");	
		data.stream().filter(n->n.getLocation().startsWith("M")).forEach(n->System.out.println(n.getLocation()));
		        System.out.println("designations ending with E:");
		data.stream().filter(n->n.getDesignation().endsWith("E")).forEach(n->System.out.println(n.getDesignation()));
	}

}