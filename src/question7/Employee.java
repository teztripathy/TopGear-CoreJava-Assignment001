package question7;
import java.util.Scanner;
public class Employee {
	private String id = null;
	private String name = null;
	private String addrs = null;
	private int sal = 0;
	
	void getData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee ID:  ");
		id = sc.next();
		System.out.println("Name:         ");
		name = sc.next();
		System.out.println("Address:      ");
		addrs = sc.next();
		System.out.println("Salary:       ");
		sal = sc.nextInt();
	}
	
	boolean searchBot(String srch) {
		if(name.matches(srch) || id.matches(srch))
			return true;
		else
			return false;
	}
	
	
	void displayData() {
		System.out.println("Employee ID:  "+id);
		System.out.println("Name:         "+name);
		System.out.println("Address:      "+addrs);
		System.out.println("Salary:       "+sal);
	}
}
