interface ReportGenerator {
    void generateReport();
}

class PDFReportGenerator implements ReportGenerator {
    public void generateReport() {
        System.out.println("Generating PDF Report...");
    }
}

class Report {
    private ReportGenerator generator;

    public Report(ReportGenerator generator) {
        this.generator = generator;
    }

    public void generateReport() {
        generator.generateReport();
    }
}

public class DependencyInversionResolved {
    public static void main(String[] args) {
        new Report(new PDFReportGenerator()).generateReport();
    }
}
