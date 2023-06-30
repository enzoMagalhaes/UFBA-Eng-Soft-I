package responsabilidade_unica;

// The Single Responsibility Principle (SRP) states that a class should have only one reason to change, 
// meaning it should have only one responsibility or concern. In other words, a class should have a single, 
// well-defined responsibility and should not take on multiple responsibilities.

// To explain the Single Responsibility Principle in Java, let's consider an example where we have a Customer 
// class that is responsible for managing customer information and also responsible for generating customer reports.

class Customer {
    private String name;
    private String address;

    // Methods for managing customer information
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void saveCustomer() {
        // Logic for saving customer information to a database
        System.out.println("Customer saved: " + name + ", " + address);
    }

    // Methods for generating customer reports
    public void generateSalesReport() {
        // Logic for generating a sales report for the customer
        System.out.println("Sales report generated for customer: " + name);
    }

    public void generateInvoice() {
        // Logic for generating an invoice for the customer
        System.out.println("Invoice generated for customer: " + name);
    }
}


// In this example, the Customer class has two responsibilities. It manages customer information (setting name and address, 
// and saving customer data) and also generates reports (sales report and invoice). This violates the Single Responsibility
// Principle as a class should have only one reason to change.

// To adhere to the Single Responsibility Principle, we should separate the responsibilities into distinct classes. Let's 
// refactor the code accordingly:

class Customer2 {
    private String name;
    private String address;

    // Methods for managing customer information
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void saveCustomer() {
        // Logic for saving customer information to a database
        System.out.println("Customer saved: " + name + ", " + address);
    }
}

class ReportGenerator {
    public void generateSalesReport(Customer2 customer) {
        // Logic for generating a sales report for the customer
        System.out.println("Sales report generated for customer: " + customer.getName());
    }

    public void generateInvoice(Customer2 customer) {
        // Logic for generating an invoice for the customer
        System.out.println("Invoice generated for customer: " + customer.getName());
    }
}


// In the refactored code, the responsibilities of managing customer information and generating reports are separated into two classes: 
// Customer and ReportGenerator.

// The Customer class now focuses solely on managing customer information, while the ReportGenerator class is responsible for generating 
// reports based on a given customer.

// By adhering to the Single Responsibility Principle, each class now has a single responsibility and a clear focus on its specific task. 
// This promotes modularity, maintainability, and code reusability. If any of the responsibilities change in the future, it will only require 
// modifications in the relevant class, reducing the risk of unintended side effects and making the code easier to understand and maintain.