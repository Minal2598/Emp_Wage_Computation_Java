public class EmpWage {

 public void attendance() {
        double empCheck = Utility.getRandomInt();
        System.out.println(empCheck);

        int FullDayHr = 8;
        int PartTimeHr = 4;
        int WagePerHr = 20;
        int day = 0;
        int empHr = 0;
        int totalWage = 0;
       
        while (day <= 19) {

            int n = Utility.getRandomInt();
            switch (n) {
                case 1:
                    System.out.println("present fullday");
                    totalWage = (totalWage + (WagePerHr * FullDayHr));

                    day++;
                    break;
                case 2:
                    System.out.println("present PartTime");
                    totalWage = (totalWage + (WagePerHr * PartTimeHr));


                    day++;
                    break;
                default:
                    System.out.println("Employee is absent. ");
                    totalWage = (totalWage + (WagePerHr * empHr));
                    day++;

                    if( empHr == 100)
                        break;
            }
        }
        System.out.println("total wage of a month is::" + totalWage);

    }
    public static void main(String[] args) {

            System.out.println("Welcome to Employee Wage Computation");
           
			EmpWage emp = new EmpWage();
			emp.attendance();
        }
    }
