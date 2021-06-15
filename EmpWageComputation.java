public class EmpWageComputation{
	public static void main(String[] args){
		
		int isFullTime=1;
		int isPartTime=2;
		//int empHr;
		int WagePerHr=20;
		int FullDayHr=8;
		int PartTimeHr=4;
		
		double empCheck = Math.floor(Math.random()*10)%3;
		if(empCheck == isFullTime)
		{
			System.out.println("Employee is Present");
			int DailyEmpWage=WagePerHr*FullDayHr;
			System.out.println("DailyEmpWage of FullTime Employee::"+DailyEmpWage);
			
			
		}
		else if(empCheck == isPartTime)
		{
			System.out.println("Employee is Present");
			int DailyEmpWage=WagePerHr*PartTimeHr;
			System.out.println("DailyEmpWage of PartTime Employee::"+DailyEmpWage);
		}else
		{
			System.out.println("Employee is Abscent");
			//empHr=0;
			
		}
		
		
		
	}
	
}