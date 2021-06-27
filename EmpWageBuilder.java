package com.employeeprogram;
public class EmpWageBuilder implements  IComputeEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;


    private int numOfCompany = 0;
    private final CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilder() {
        companyEmpWageArray = new CompanyEmpWage[5];

    }

    @Override
    public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrPerMonth) {
        companyEmpWageArray[ numOfCompany ] = new CompanyEmpWage( company, empRatePerHr, numOfWorkingDays, maxHrPerMonth);
        numOfCompany++;

    }


    /**
     *
     */
    @Override
    public void computeWage() {
        for (int i = 0; i < numOfCompany; i++) {

            companyEmpWageArray[i]. setTotalEmpWage (this.computeWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);

        }
    }

    @Override
    public int getTotalEmpWage(String company) {
        return 0;
    }


    public int computeWage(CompanyEmpWage companyEmpWage) {
        int empHr;
        int totalEmpHr = 0;
        int totalWorkingDays = 0;

        while (totalEmpHr <= companyEmpWage.maxHrPerMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;

            int Check = (int) Math.floor( Math.random() * 10 ) % 3;
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
        return  totalEmpHr * CompanyEmpWage.empRatePerHr;



    }


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation....!!!");


        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("DMart", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Amazon", 25, 25, 200);
        empWageBuilder.addCompanyEmpWage("Flipkart", 50, 30, 150);

        empWageBuilder.computeWage();
    }



}
