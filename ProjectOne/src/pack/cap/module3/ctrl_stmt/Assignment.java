package pack.cap.module3.ctrl_stmt;

class Employee {

 
    String name;
    String department;
    double basicSalary;
    
   
    static double perkRate = 1000;  // Company-wide perks for each employee
    static double taxRate = 0.10;   // Company-wide tax rate (10%)

    // Constructor to initialize instance variables
    public Employee(String name, String department, double basicSalary) {
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    // Instance method to calculate HRA (House Rent Allowance)
    public double calculateHRA() {
        return basicSalary * 0.20; // 20% of basic salary
    }

    // Instance method to calculate TA (Travel Allowance)
    public double calculateTA() {
        return basicSalary * 0.15; // 15% of basic salary
    }

    
    public double calculateDA() {
        return basicSalary * 0.10; // 10% of basic salary
    }

   
    public double calculatePerks() {
        return perkRate; // This is a company-wide perk, same for every employee
    }

   
    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateTA() + calculateDA() + calculatePerks();
    }

 
    public static double calculateTax(double grossSalary) {
        return grossSalary * taxRate; 
    }

  
    public static double calculateCompanyPerks() {
        return perkRate; // Static method can access static variables
    }

    // Method to display the salary breakdown
    public void displaySalaryDetails() {
        double hra = calculateHRA();
        double ta = calculateTA();
        double da = calculateDA();
        double perks = calculatePerks();
        double grossSalary = calculateGrossSalary();
        double tax = calculateTax(grossSalary);

        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA (20%): $" + hra);
        System.out.println("TA (15%): $" + ta);
        System.out.println("DA (10%): $" + da);
        System.out.println("Perks: $" + perks);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Tax Deduction (10%): $" + tax);
        System.out.println("Net Salary (after Tax): $" + (grossSalary - tax));
        System.out.println("-----------------------------------------------------");
    }
}

public class Assignment {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("John ", "IT", 5000);
        Employee emp2 = new Employee("Jane ", "HR", 6000);

       
        emp1.displaySalaryDetails();
        emp2.displaySalaryDetails();

     
        System.out.println("Company-wide Perks for each employee: $" + Employee.calculateCompanyPerks());
    }
}
