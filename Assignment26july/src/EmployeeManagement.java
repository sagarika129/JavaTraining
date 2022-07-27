import java.util.*;
public class EmployeeManagement {

	public static void main(String[] args) {
		//creating employee object
		Employee emp1=new Employee(321,"Smuel","s@gmail.com","Male",34900.50f);
		Employee emp2=new Employee(322,"Alaska","a@gmail.com","Female",44900.00f);
		Employee emp3=new Employee(323,"Urvi","u@gmail.com","Female",50000.0f);
		Employee emp4=new Employee(324,"Rudy","r@gmail.com","Male",33900.50f);
			
		//add Employee to DB
		EmployeeDB ed1=new EmployeeDB();
		boolean res=ed1.addEmployee(emp1);
		checkAddStatus(res,emp1.empId);
		res =ed1.addEmployee(emp2);
		checkAddStatus(res,emp2.empId);
		res=ed1.addEmployee(emp3);
		checkAddStatus(res,emp3.empId);
		res=ed1.addEmployee(emp4);
		checkAddStatus(res,emp4.empId);
		
		//Again trying to add emp1
		res=ed1.addEmployee(emp1);
		checkAddStatus(res,emp1.empId);
		
		//print Pay slip
		 System.out.println("Employee pay slip: "+ed1.showPaySlip(emp2.empId));
		 
		 //delete employee
		 boolean deleteRes=ed1.deleteEmployee(emp4.empId);
		 checkDelStatus(deleteRes);
		 //again trying to delete same employee
		 deleteRes=ed1.deleteEmployee(emp4.empId);
		 checkDelStatus(deleteRes);
		 
		
	}
	static void checkAddStatus(boolean r,int id)
	{
		if(r==true)
		{
			System.out.println("Employee Id "+id+" is Added");
		}
		else
		{
			System.out.println("Employee Id "+id+" already exists in the DB.");
		}
	}
	static void checkDelStatus(boolean deleteRes)
	{
		 if(deleteRes==false) {
			 System.out.println("Deletion of employee data failed");
		 }
		 else {
			 System.out.println("employee data is deleted");
		 }
		
	}

}
class Employee{
	
	 int empId;
	 String empName;
	 String email;
	 String gender;
	 float salary;
	Employee(int eid,String en,String em,String gn,float sal)
	{
		empId=eid;
		empName=en;
		email=em;
		gender=gn;
		salary=sal;
			
	}
	 void GetEmployeeDetails() {
		 System.out.println("Employee I'd: "+empId);
		 System.out.println("Employee Name: "+empName);
		 System.out.println("Employee email: "+email);
		 System.out.println("Employee gender: "+gender);
		 System.out.println("Employee salary: "+salary);
		
		 
	 }
}
class EmployeeDB{
	ArrayList<Employee> emp=new ArrayList<>();
	boolean addEmployee(Employee e) {
		if(emp.contains(e))
		{
		return false;
		}
		else 
			emp.add(e);
			return true;
	}
	 boolean deleteEmployee(int empId) {
		 boolean b=false;
		
		 for(int i=0;i<emp.size();i++)
			{
				if(emp.get(i).empId==empId)
				{
				b=true;
				emp.remove(emp.get(i));
				break;
				}
			}
		 if(b==true)
		 {
			return true;
		 }
		 else
			 return false;
		
	 }

	String showPaySlip(int empId)
	{
		String s="";
		for(int i=0;i<emp.size();i++)
		{
			if(emp.get(i).empId==empId)
			{
				s="";
				s=s+"Name "+emp.get(i).empName+",salary "+emp.get(i).salary+",Id "+emp.get(i).empId;
				break;
			}
			else
			{
				s="Employee doesn't exist.";
			}
		}

	return s;
	
	}
}



