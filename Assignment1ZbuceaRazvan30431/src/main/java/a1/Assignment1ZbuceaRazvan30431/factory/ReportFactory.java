package a1.Assignment1ZbuceaRazvan30431.factory;

import a1.Assignment1ZbuceaRazvan30431.generator.ReportGenerator;
import a1.Assignment1ZbuceaRazvan30431.generator.ReportType;

public abstract class ReportFactory {
    public abstract ReportGenerator getReport(ReportType reportType);
}
