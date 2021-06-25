package com.employeeprogram;

public class CompanyEmpWage {
    public static int wagePerHr;
    public final int numOfWorkingDays;
    public final String company;
    public final int maxHrPerMonth;
    public int dailyEmpWage;

    public CompanyEmpWage (int wagePerHr, int numOfWorkingDays, String company, int maxHrPerMonth) {
        this.wagePerHr = wagePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.company = company;
        this.maxHrPerMonth = maxHrPerMonth;

    }

    public void setDailyEmpWage(int dailyEmpWage){
        this.dailyEmpWage = dailyEmpWage;
    }

    @Override
    public String toString() {
        String company = null;
        return "Total REmp Wage for company::" + company + "is:" + dailyEmpWage;
    }
}
