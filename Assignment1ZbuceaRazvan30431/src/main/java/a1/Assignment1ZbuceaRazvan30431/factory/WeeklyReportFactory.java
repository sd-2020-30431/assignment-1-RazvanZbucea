package a1.Assignment1ZbuceaRazvan30431.factory;

import a1.Assignment1ZbuceaRazvan30431.generator.ReportGenerator;
import a1.Assignment1ZbuceaRazvan30431.generator.ReportType;
import a1.Assignment1ZbuceaRazvan30431.generator.WeeklyReportGenerator;
import org.springframework.stereotype.Component;

@Component
public class WeeklyReportFactory extends ReportFactory {

    @Override
    public ReportGenerator getReport(ReportType reportType) {
        return new WeeklyReportGenerator();
    }
}
