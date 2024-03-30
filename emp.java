public class emp {
    protected String name; // Changed access level to protected
    protected int empId;   // Changed access level to protected
    protected double salary; // Changed access level to protected

    public emp(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an instance of emp (Employee)
        emp employee = new emp("John Doe", 1, 60000);
        employee.displayEmployeeDetails();
    }
}
