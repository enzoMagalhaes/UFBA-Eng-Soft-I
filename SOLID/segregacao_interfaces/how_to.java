package segregacao_interfaces;

// The Interface Segregation Principle (ISP) states that clients should not be forced to depend on interfaces they do not use. 
// In other words, it suggests that interfaces should be specific to the needs of the clients that use them, and they should not 
// contain unnecessary or unrelated methods.

// To explain the Interface Segregation Principle in Java, let's consider an example where we have an Employee interface that is 
// implemented by different types of employees, such as Developer and Manager. Initially, we have a single interface that contains 
// multiple methods.

interface Employee {
    void doWork();
    void attendMeeting();
    void writeCode();
    void manageTeam();
}

class Developer implements Employee {
    public void doWork() {
        System.out.println("Developer is working.");
    }

    public void attendMeeting() {
        System.out.println("Developer is attending a meeting.");
    }

    public void writeCode() {
        System.out.println("Developer is writing code.");
    }

    public void manageTeam() {
        // Developers should not have the responsibility to manage teams.
        throw new UnsupportedOperationException("Developers cannot manage teams.");
    }
}

class Manager implements Employee {
    public void doWork() {
        System.out.println("Manager is working.");
    }

    public void attendMeeting() {
        System.out.println("Manager is attending a meeting.");
    }

    public void writeCode() {
        // Managers should not have the responsibility to write code.
        throw new UnsupportedOperationException("Managers cannot write code.");
    }

    public void manageTeam() {
        System.out.println("Manager is managing the team.");
    }
}


// In this example, the Employee interface contains methods like doWork(), attendMeeting(), writeCode(), 
// and manageTeam(). Both Developer and Manager implement this interface.

// However, there is a problem with this design. Developers should not have the responsibility to manage teams, 
// and managers should not have the responsibility to write code. The interface forces both types of employees 
// to implement methods that are not relevant to their roles, violating the Interface Segregation Principle.

// To adhere to the Interface Segregation Principle, we can create specific interfaces for each role or set of 
// related responsibilities. Let's refactor the code accordingly:

interface Developer2 {
    void doWork();
    void writeCode();
}

interface Manager2 {
    void doWork();
    void attendMeeting();
    void manageTeam();
}

class DeveloperImpl implements Developer2 {
    public void doWork() {
        System.out.println("Developer is working.");
    }

    public void writeCode() {
        System.out.println("Developer is writing code.");
    }
}

class ManagerImpl implements Manager2 {
    public void doWork() {
        System.out.println("Manager is working.");
    }

    public void attendMeeting() {
        System.out.println("Manager is attending a meeting.");
    }

    public void manageTeam() {
        System.out.println("Manager is managing the team.");
    }
}

// In the refactored code, we have created separate interfaces (Developer and Manager) that represent the specific 
// responsibilities for each role. The DeveloperImpl and ManagerImpl classes implement the respective interfaces, 
// providing the necessary implementation for each role-specific method.

// By adhering to the Interface Segregation Principle, we ensure that each interface is tailored to the needs of the 
// clients that use them. Clients can depend only on the interfaces that are relevant to their requirements, and they 
// are not burdened with unnecessary or unrelated methods. This promotes better separation of concerns, modularity, 
// and flexibility in the codebase.