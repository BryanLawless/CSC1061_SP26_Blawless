import java.util.Scanner;

public class AccountsPayable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] payableEmployees = new Employee[6];

        for (int i = 0; i < payableEmployees.length; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");
            System.out.println("Select employee type:");
            System.out.println("1. Salaried Employee");
            System.out.println("2. Commission Employee");
            System.out.println("3. Hourly Employee");
            System.out.println("4. Base Plus Commission Employee");
            System.out.print("Enter choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter social security number: ");
            String ssn = scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter weekly salary: ");
                    double weeklySalary = scanner.nextDouble();
                    payableEmployees[i] = new SalariedEmployee(
                        firstName,
                        lastName,
                        ssn,
                        weeklySalary
                    );
                    break;
                case 2:
                    System.out.print("Enter gross sales: ");
                    double grossSales = scanner.nextDouble();
                    System.out.print(
                        "Enter commission rate (e.g., 0.15 for 15%): "
                    );
                    double commissionRate = scanner.nextDouble();
                    payableEmployees[i] = new CommissionEmployee(
                        firstName,
                        lastName,
                        ssn,
                        grossSales,
                        commissionRate
                    );
                    break;
                case 3:
                    System.out.print("Enter hourly wage: ");
                    double hourlyWage = scanner.nextDouble();
                    System.out.print("Enter hours worked: ");
                    double hours = scanner.nextDouble();
                    payableEmployees[i] = new HourlyEmployee(
                        firstName,
                        lastName,
                        ssn,
                        hourlyWage,
                        hours
                    );
                    break;
                case 4:
                    System.out.print("Enter gross sales: ");
                    double sales = scanner.nextDouble();
                    System.out.print(
                        "Enter commission rate (e.g., 0.15 for 15%): "
                    );
                    double rate = scanner.nextDouble();
                    System.out.print("Enter base pay: ");
                    double basePay = scanner.nextDouble();
                    payableEmployees[i] = new BasePlusCommissionEmployee(
                        firstName,
                        lastName,
                        ssn,
                        sales,
                        rate,
                        basePay
                    );
                    break;
                default:
                    System.out.println(
                        "Invalid choice. Creating default Employee."
                    );
                    payableEmployees[i] = new Employee(
                        firstName,
                        lastName,
                        ssn
                    );
            }
        }

        System.out.println("\n========================================");
        System.out.println("Employee Payment Information:");
        System.out.println("========================================");
        for (Employee employee : payableEmployees) {
            System.out.println(
                employee.getFirstName() +
                    " " +
                    employee.getLastName() +
                    " - Payment: $" +
                    String.format("%.2f", employee.getPaymentAmount())
            );
        }

        System.out.println("\n========================================");
        System.out.println(
            "Increasing base salary by 10% for Base Plus Commission Employees..."
        );
        System.out.println("========================================");
        for (Employee employee : payableEmployees) {
            if (employee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee bpce =
                    (BasePlusCommissionEmployee) employee;
                double oldBasePay = bpce.getBasePay();
                double newBasePay = oldBasePay * 1.10;
                bpce.setBasePay(newBasePay);
                System.out.println(
                    bpce.getFirstName() +
                        " " +
                        bpce.getLastName() +
                        " - Base pay increased from $" +
                        String.format("%.2f", oldBasePay) +
                        " to $" +
                        String.format("%.2f", newBasePay)
                );
            }
        }

        System.out.println("\n========================================");
        System.out.println("Updated Employee Payment Information:");
        System.out.println("========================================");
        for (Employee employee : payableEmployees) {
            System.out.println(
                employee.getFirstName() +
                    " " +
                    employee.getLastName() +
                    " - Payment: $" +
                    String.format("%.2f", employee.getPaymentAmount())
            );
        }

        scanner.close();
    }

    public static void printEmployeeDetailsWithToString(Employee employee) {
        System.out.println(employee.toString());
    }

    public static void printEmployeeDetailsWithoutToString(Employee employee) {
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println(
            "Social Security Number: " + employee.getSocialSecurityNumber()
        );
        System.out.println(
            "Payment Amount: $" +
                String.format("%.2f", employee.getPaymentAmount())
        );
    }
}
