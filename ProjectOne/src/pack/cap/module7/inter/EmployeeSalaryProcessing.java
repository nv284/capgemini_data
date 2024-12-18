package pack.cap.module7.inter;

/*Problem statement - You are tasked with processing employee salary data using Java 8 Stream operations. The data is provided as 
 * an array, and the following operations need to be performed:

Filter Employees: Find the employees whose salary is less than 40000.
Get Employees Earning More Than 75000: Identify the employees whose salary is greater than 75000.
Provide Increment for Employees: Give a 10% salary increment to those employees whose salary is around 35000
 (let's assume a range of 33000 to 37000).
Calculate Average Salary: Calculate the average salary of all employees.
Calculate Company Yearly Turnover: Multiply the average salary by the number of employees to estimate the company's yearly turnover.
Arrange Data in Descending Order: Sort the employees' salaries in descending order.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class EmployeeSalaryProcessing {
    public static void main(String[] args) {

      
        int[] employeeSalaries = {28000, 40000, 75000, 120000, 35000, 29000, 55000, 38000, 47000, 64000};

       
        System.out.println("Employees with salary less than 40000:");
        IntStream.of(employeeSalaries)
                .filter(salary -> salary < 40000)
                .forEach(salary -> System.out.println("Salary: " + salary));

       
        System.out.println("\nEmployees earning more than 75000:");
        IntStream.of(employeeSalaries)
                .filter(salary -> salary > 75000)
                .forEach(salary -> System.out.println("Salary: " + salary));

       
        System.out.println("\nEmployees with incremented salary (10% for those earning near 35000):");
        IntStream.of(employeeSalaries)
                .map(salary -> {
                    if (salary >= 33000 && salary <= 37000) {
                        return (int) (salary * 1.1);  // Giving a 10% increment
                    }
                    return salary;
                })
                .forEach(salary -> System.out.println("Updated Salary: " + salary));

       
        double averageSalary = IntStream.of(employeeSalaries)
                                        .average()
                                        .orElse(0.0);
        System.out.println("\nAverage Salary: " + averageSalary);

       
        double yearlyTurnover = averageSalary * employeeSalaries.length;
        System.out.println("Company Yearly Turnover: " + yearlyTurnover);

       
        System.out.println("\nSalaries in Descending Order:");
        Arrays.stream(employeeSalaries)
              .boxed()  // Convert to Integer to use Comparator
              .sorted(Comparator.reverseOrder())  // Sort in descending order
              .forEach(salary -> System.out.println("Salary: " + salary));
    }
}

