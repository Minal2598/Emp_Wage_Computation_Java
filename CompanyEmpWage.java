package com.employeeprogram;

public class CompanyEmpWage {

    public static int empRatePerHr;
        public String company;
        public int numOfWorkingDays;
        public int maxHrPerMonth;
        public int totalEmpWage;

        public CompanyEmpWage(final String company,  final int empRatePerHr, final int numOfWorkingDays, final int maxHrPerMonth) {
            this.company = company;
            CompanyEmpWage.empRatePerHr = empRatePerHr;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHrPerMonth = maxHrPerMonth;
        }

        public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }

        @Override
        public String toString() {
            return "Total Emp Wage for Company:: " +company+ " is:: " + totalEmpWage;

        }
    }


