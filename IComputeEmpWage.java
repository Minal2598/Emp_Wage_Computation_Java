package com.employeeprogram;

public interface IComputeEmpWage {
    void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrPerMonth);

    default void computeWage() {

    }

    int getTotalEmpWage(String company);
}




