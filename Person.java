public class Person {
    String name;
    String dob; // format: DD-MM-YYYY or YYYY-MM-DD
    int birthYear;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;

        // Simple birth year extraction
        if (dob.charAt(2) == '-') { // DD-MM-YYYY
            birthYear = Integer.parseInt(dob.substring(6));
        } else { // YYYY-MM-DD
            birthYear = Integer.parseInt(dob.substring(0, 4));
        }
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        int currentYear = 2025; // or use java.time.Year.now().getValue()
        int age = currentYear - birthYear;
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String empId;
    double salary;

    public Employee(String name, String dob, String empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}