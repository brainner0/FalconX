class Authenticator {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}

class DashboardLoader {
    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }
}

class PaymentProcessor {
    public void processPayments() {
        System.out.println("Processing payments...");
    }
}

class ReportGenerator {
    public void generateReports() {
        System.out.println("Generating reports...");
    }
}

class Application {
    private Authenticator authenticator;
    private DashboardLoader dashboardLoader;
    private PaymentProcessor paymentProcessor;
    private ReportGenerator reportGenerator;

    public Application() {
        this.authenticator = new Authenticator();
        this.dashboardLoader = new DashboardLoader();
        this.paymentProcessor = new PaymentProcessor();
        this.reportGenerator = new ReportGenerator();
    }

    public void run() {
        System.out.println("Running application...");
        authenticator.authenticateUser();
        dashboardLoader.loadDashboard();
        paymentProcessor.processPayments();
        reportGenerator.generateReports();
    }
}

public class GodClassResolved {
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}
