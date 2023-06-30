package inversao_dependencias;


// The Dependency Inversion Principle (DIP) is a principle in object-oriented design that states that high-level 
// modules should not depend on low-level modules. Both should depend on abstractions. Additionally, it suggests 
// that abstractions should not depend on details, but details should depend on abstractions.

// To explain the Dependency Inversion Principle in Java, let's consider an example where we have a NotificationService 
// class responsible for sending notifications. Initially, it depends directly on a EmailSender class to send email notifications.

class EmailSender {
    public void sendEmail(String recipient, String message) {
        // Logic for sending email
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}

class NotificationService {
    private EmailSender emailSender;

    public NotificationService() {
        this.emailSender = new EmailSender();
    }

    public void sendNotification(String recipient, String message) {
        emailSender.sendEmail(recipient, message);
    }
}

// In this example, the NotificationService directly depends on the EmailSender class, creating an instance of it within 
// its constructor. This tight coupling makes it difficult to change the notification mechanism or introduce new types of notifications.

// To adhere to the Dependency Inversion Principle, we can introduce an abstraction and invert the dependency. We'll create an 
// NotificationSender interface that defines the contract for sending notifications:

interface NotificationSender {
    void sendNotification(String recipient, String message);
}

class EmailSender2 implements NotificationSender {
    public void sendNotification(String recipient, String message) {
        // Logic for sending email
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}

class NotificationService2 {
    private NotificationSender notificationSender;

    public void NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String recipient, String message) {
        notificationSender.sendNotification(recipient, message);
    }
}

// In this updated code, we introduced the NotificationSender interface, which defines the sendNotification() method. 
// The EmailSender class implements this interface.

// The NotificationService now takes a dependency on the NotificationSender interface instead of the concrete EmailSender 
// class. This allows the NotificationService to work with any implementation of NotificationSender, making it more flexible and extensible.

// By following the Dependency Inversion Principle, we have inverted the dependency so that higher-level modules (such as NotificationService) 
// depend on abstractions (NotificationSender interface) rather than concrete implementations (EmailSender). This promotes loose coupling, 
// flexibility, and easier maintenance of the codebase. It also enables us to introduce new notification mechanisms by implementing the 
// NotificationSender interface without modifying the existing code that relies on NotificationService.

