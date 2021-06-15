import java.util.Scanner;
public class EmpWageComputation{
	public static void main(String [] args) {
		int empCheck = 1;
		int WagePerHr = 20;
		int FullDayHr = 8;
		int PartTimeHr =4; 
		

		
		double value = Math.floor(Math.random() * 10) % 2;
		
		if(value == empCheck) {
			System.out.println("Employee is Present");
			Scanner sc = new Scanner (System.in);
		System.out.println("please Enter 1 for FullTimeEmp or Enter 2 for PartTimeEmp");
		int n = sc.nextInt();
		sc.close();
			switch(n){
		case 1: 
		
		System.out.println(" Daily Wage of FullTime Employee  is: " +WagePerHr*FullDayHr);
		break;
		case 2:
		System.out.println("Daily Wage of PartTime Employee is: " +WagePerHr*PartTimeHr);
			break;
			default:
			System.out.println("please select only between 1 and 2");
			}
			}
		else 
		System.out.println("Employee is Absent");
		
}
}