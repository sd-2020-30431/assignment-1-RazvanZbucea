package a1.Assignment1ZbuceaRazvan30431.factory;

import a1.Assignment1ZbuceaRazvan30431.generator.ReportType;

public class ReportTypeFactory {
    public  ReportFactory getFactory(ReportType report){
        if(report == ReportType.WEEKLY)
            return new WeeklyReportFactory();
        else if(report == ReportType.MONTHLY){
            return new MonthlyReportFactory();
        }
        return null;
    }
}
