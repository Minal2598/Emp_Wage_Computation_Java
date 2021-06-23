package com.employeeprogram;

public class EmployeeWage {

    int IS_FULL_TIME;
    int IS_PART_TIME;
    int WAGE_PER_HRS;
    int FULL_DAY_HRS;
    int PART_TIME_HRS;
    int EMP_HR;
   // int dailyEmpWage;
    String company_name;


    EmployeeWage(int ft,int ft1,int ft2,int ft3,int ft4,int ft5,String company_name)
    {
        this.IS_FULL_TIME=ft;
        this.IS_PART_TIME=ft1;
        this.WAGE_PER_HRS=ft2;
        this.FULL_DAY_HRS=ft3;
        this.PART_TIME_HRS=ft4;
        this.EMP_HR=ft5;
        this.company_name=company_name;

    }


    public  void attendance(String company_name){
        this.set_wage_per_hr(company_name);

        int dailyEmpWage=0;
        int day = 0;

        double empCheck = Utility.getRandomDouble();
        System.out.println(empCheck);
        while (day <= 19) {

            int n = Utility.getRandomInt();
            switch (n) {
                case 1:
                    System.out.println("present fullday");
                    dailyEmpWage = (dailyEmpWage + (WAGE_PER_HRS * FULL_DAY_HRS));

                    day++;
                    break;
                case 2:
                    System.out.println("present PartTime");
                    dailyEmpWage = (dailyEmpWage + (WAGE_PER_HRS * FULL_DAY_HRS));


                    day++;
                    break;
                default:
                    System.out.println("Employee is absent. ");
                    dailyEmpWage = (dailyEmpWage + (WAGE_PER_HRS * EMP_HR));
                    day++;

                    if( EMP_HR == 100)
                        break;
            }
        }
        System.out.println("total wage of a month is::" + dailyEmpWage);


    }

    public void set_wage_per_hr(String company_name){


        switch (company_name) {
            case "A":  this.WAGE_PER_HRS = 10;
                break;
            case "B":   this.WAGE_PER_HRS = 100;
                break;
            case "C":   this.WAGE_PER_HRS = 1000;
                break;
            case "D":   this.WAGE_PER_HRS = 10000;
                break;

            default: this.WAGE_PER_HRS = 5;
                break;
        }


    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation....!!!");


        System.out.println("This is for compony A::");
        EmployeeWage e1= new EmployeeWage(100,100,100,100,100,7,"A");
        e1.attendance("A");

        System.out.println("This is for compony B::");
        EmployeeWage e2= new EmployeeWage(100,100,100,100,100,7, "B");
        e2.attendance("B");

        System.out.println("This is for compony C::");
        EmployeeWage e3= new EmployeeWage(100,100,100,100,100,7, "C");
        e3.attendance("C");

        System.out.println("This is for compony D::");
        EmployeeWage e4= new EmployeeWage(100,100,100,100,100,7, "D");
        e4.attendance("D");

    }

}
