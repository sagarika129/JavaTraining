package Person;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("sagarika");
		emp.setNAN("12345");
		emp.setYearOfJoining(2000);
		emp.setSalary(3456.00);
		
		System.out.println("Name "+emp.getName());
		System.out.println("Salary "+emp.getSalary());
		System.out.println("Date of joining "+emp.getYearOfJoining());
		System.out.println("NAN "+emp.getNAN());

	}

}

