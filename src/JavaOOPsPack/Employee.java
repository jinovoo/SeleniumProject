package JavaOOPsPack;
public class Employee{
	 int empid;
	 String empname;
	 String company;
	 public Employee(){
		  System.out.println("Employee - Default Constructor");
		}
	 public Employee(int empid, String empname)
	 {
		 System.out.println("Employee Constructor - 2 parameters");
	   this.empid = empid;
	   this.empname = empname;
	 }
	 
	 public Employee(int empid, String empname, String company)
	 {
	   System.out.println("Employee- Parameterized Constructor");	 
	   this.empid = empid;
	   this.empname = empname;
	    this.company = company;    
	 }
	 
	  public void InsertEmpRecord(int id,String name,String comp){
	   empid = id;
	   empname= name;
	   company = comp;
	 }
	 public void displayEmpRecord(){
	   System.out.println("empid = "+ empid + " empname = " + empname + " company = " + company);
	 }
	}
