package noora;
import java.util.*;
class Employee{
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee(int no,int sal,String name) {
		eNo = no;
		eSalary = sal;
		eName = name;
	
	}
	public void showData() {
		System.out.println("empId = " + eNo + "Name = " + eName + "Salary = " + eSalary);
		
	}
}

public class EmpArrObjects {
public static void main(String[] args) {
	int eid,esal,i;
	String ename;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of employees:");
	int n=s.nextInt();
	Employee employees[] = new Employee[n];
	System.out.println("Enter Employee details one by one");
	for(i=0;i<n;i++) {
		System.out.println("Enter "+(i+1)+"employee details (id name salary):");
		eid= s.nextInt();
		ename= s.next();
		esal= s.nextInt();
		employees[i]=new Employee (eid,esal,ename);
	}
	System.out.println("\nEmployees are:");
	for (Employee emp:employees) emp.showData();
	System.out.println("\nEnter employee number to search:");
	int semp = s.nextInt();
	boolean found = false;
	for (Employee e: employees) {
		if (semp == e.eNo) {
			found = true;
			System.out.println("Employee found:");
			e.showData();
			break;
		}
	}
	if (!found)
		System.out.println("Employee not found");
}
}