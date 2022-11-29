package EmployeeWage;

public class EmployeeWageComputation {
    static int WAGE_PER_HOUR = 20;
    static int FULL_DAY_HOUR = 8;
    static int PART_TIME_HOUR = 4;
    static final int PART_TIME = 2;
    static final int FULL_TIME = 1;
    static int WORKING_DAYS_PER_MONTH = 20;
    static int TOTAL_WORKING_HOURS = 100;

    public static void toCalculateMonthlyWage() {
        int monthlyWage = 0;
        int dailyEmployeeWage;
        int workingDays = 0;
        int workingHours = 0;
        int empHours;

        while (workingHours != TOTAL_WORKING_HOURS && workingDays < WORKING_DAYS_PER_MONTH) {
            workingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case FULL_TIME:
                    System.out.println("Employee is Present");
                    empHours = 8;
                    dailyEmployeeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    monthlyWage = WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAYS_PER_MONTH;
                    System.out.println("Daily Wage of Employee= " + dailyEmployeeWage);
                    System.out.println("------------------------------------------------------------");
                    break;

                case PART_TIME:
                    System.out.println("Employee is Present Part Time");
                    empHours = 4;
                    dailyEmployeeWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    monthlyWage = WAGE_PER_HOUR * PART_TIME_HOUR * WORKING_DAYS_PER_MONTH;
                    System.out.println("Daily Wage of employee in Part Time = " + dailyEmployeeWage);
                    System.out.println("------------------------------------------------------------");
                    break;

                default:
                    empHours = 0;
                    System.out.println("Employee is Absent");
                    System.out.println("Daily wage of employee is 0");
                    System.out.println("------------------------------------------------------------");
                    break;
            }
            System.out.println("Day-> " + workingDays + " Total Working Hours in " + empHours);
            workingHours = workingHours + empHours;
        }
        System.out.println("total working hours in a Month = " + workingHours);
        System.out.println("==================================================================================");
        System.out.println("TOTAL MONTHLY WAGE OF EMPLOYEE = " + monthlyWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        toCalculateMonthlyWage();
    }
}