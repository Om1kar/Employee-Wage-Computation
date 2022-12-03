package EmployeeWage;

/*
UC8->Employee Wage for Multiple Companies.
 */
public class EmployeeWage {
    static final int PART_TIME = 2;
    static final int FULL_TIME = 1;

    /*
    Static method to calculate monthly wage of employees
     */
    public static int toCalculateMonthlyWage(String company, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int TOTAL_WORKING_HOURS_IN_MONTH) {
       /*
       Variables=>
        */
        int monthlyWage = 0;
        int dailyEmployeeWage;
        int workingDays = 0;
        int workingHours = 0;
        int empHours;

        while (workingHours <= TOTAL_WORKING_HOURS_IN_MONTH && workingDays < WORKING_DAYS_PER_MONTH) {
            workingDays++;
            /*
            Random method to check employee is present or absent
             */
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            /*
            Switch case is used to check 3 cases->
            1)Employee is present full day
            2)Employee is present part-time or
            3)Employee is absent.
            */
            switch (empCheck) {
                case FULL_TIME -> {
                    System.out.println("Employee is Present");
                    empHours = 8;
                    dailyEmployeeWage = WAGE_PER_HOUR * empHours;
                    monthlyWage = WAGE_PER_HOUR * empHours * WORKING_DAYS_PER_MONTH;
                    System.out.println("Daily Wage of Employee= " + dailyEmployeeWage);
                    System.out.println("------------------------------------------------------------");
                }
                case PART_TIME -> {
                    System.out.println("Employee is Present Part Time");
                    empHours = 4;
                    dailyEmployeeWage = WAGE_PER_HOUR * empHours;
                    monthlyWage = WAGE_PER_HOUR * empHours * WORKING_DAYS_PER_MONTH;
                    System.out.println("Daily Wage of employee in Part Time = " + dailyEmployeeWage);
                    System.out.println("------------------------------------------------------------");
                }
                default -> {
                    empHours = 0;
                    System.out.println("Employee is Absent");
                    System.out.println("------------------------------------------------------------");
                }
            }
            System.out.println("Day-- " + workingDays + " Total Working Hours " + empHours);
            workingHours = workingHours + empHours;
        }
        System.out.println("============================================================================");
        System.out.println("total working hours = " + workingHours);
        System.out.println("Total Emp Wage = " + monthlyWage);
        /*
        Return Type
         */
        return monthlyWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        /*
        static Method Calling
         */
        toCalculateMonthlyWage("TCS", 30, 24, 180);
        toCalculateMonthlyWage("COGNIZANT", 22, 20, 150);
    }
}