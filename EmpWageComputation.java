public class EmpWageComputation{

	public static void main(String[] args) {
		
		 int n = (int)(Math.random()*10)%3;  
		 int FullDayHr=8;
		 int PartTimeHr=4;
		 int WagePerHr=20;
		switch(n) {
		case 1:
			System.out.println("present FullDayHr Emp");
			System.out.println(WagePerHr*FullDayHr);
			break;
		case 2:
			System.out.println("present PartTime Emp");
			System.out.println(WagePerHr*PartTimeHr);
			break;
		default:
			System.out.println("absent");
		}
	}
}