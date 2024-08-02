public class ReportGenerator {
    private Report report;

    public ReportGenerator(Report report) {
        this.report = report;
    }

    public void generatingReport() {
        System.out.println("Generating report");
        report.generateReport();
    }
}
