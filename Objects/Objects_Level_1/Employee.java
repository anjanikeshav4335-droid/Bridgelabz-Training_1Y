
public class Employee{
	String name;
	int id;
	int Salary;
	public Employee(String name,int id,int Salary){
		this.name=name;
		this.id=id;
		this.Salary=Salary;
	}
	public void displaydetails(){
		System.out.println("Name is "+name);
		System.out.println("ID IS "+id);
		System.out.println("Salary is "+Salary);
	}
	public static void main(String args[]){
		Employee emp=new Employee("Krishna",1,50000);
		emp.displaydetails();
	}
}