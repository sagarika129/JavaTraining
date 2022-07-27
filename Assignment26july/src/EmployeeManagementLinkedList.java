import java.util.LinkedList;

public class EmployeeManagementLinkedList {
	
		public static void main(String[] args) {
			//creating employee object
			EmployeeL emp1=new EmployeeL(321,"Smuel","s@gmail.com","Male",34900.50f);
			EmployeeL emp2=new EmployeeL(322,"Alaska","a@gmail.com","Female",44900.00f);
			EmployeeL emp3=new EmployeeL(323,"Urvi","u@gmail.com","Female",50000.0f);
			EmployeeL emp4=new EmployeeL(324,"Rudy","r@gmail.com","Male",33900.50f);
				
			//add Employee to DB
			EmployeeDBL ed1=new EmployeeDBL();
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
	class EmployeeL{
		
		 int empId;
		 String empName;
		 String email;
		 String gender;
		 float salary;
		EmployeeL(int eid,String en,String em,String gn,float sal)
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
	class EmployeeDBL{
		LinkedList<EmployeeL> emp=new LinkedList<>();
		boolean addEmployee(EmployeeL e) {
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



