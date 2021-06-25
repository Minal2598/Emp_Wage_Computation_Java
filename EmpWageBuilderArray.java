package com.employeeprogram;

public class EmpWageBuilderArray {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilderArray() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(int wagePerHr, int numOfWorkingDays, String company, int maxHrPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(wagePerHr, numOfWorkingDays, company, maxHrPerMonth);
        numOfCompany++;

    }
    

        public void computeWage() {
            for (int i = 0; i < numOfCompany; i++) {

                companyEmpWageArray[i].setDailyEmpWage(this.computeWage(companyEmpWageArray[i]));
                System.out.println(companyEmpWageArray[i]);

            }
        }



    public int computeWage(CompanyEmpWage companyEmpWage) {
        int empHr;
        int totalEmpHr = 0;
        int totalWorkingDays = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);

        while (totalEmpHr <= companyEmpWage.maxHrPerMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDays) {
             totalWorkingDays++;

            int Check = (int) (Math.random() * 10) % 3;
            switch (Check) {
                case IS_FULL_TIME:
                    empHr = 8;
                    break;
                case IS_PART_TIME:
                    empHr = 4;
                    break;
                default:
                    empHr = 0;

            }
            totalEmpHr += empHr;
            System.out.println("Day#::" + totalWorkingDays + "Emp Hr::" + empHr);
        }
        return totalEmpHr * CompanyEmpWage.wagePerHr;


    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation....!!!");


        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpWage(20, 20, "DMart", 20);
        empWageBuilder.addCompanyEmpWage(40, 25, "Amazon", 25);
        empWageBuilder.addCompanyEmpWage(50, 15, "Flipkart", 28);

        empWageBuilder.computeWage();
    }



}
