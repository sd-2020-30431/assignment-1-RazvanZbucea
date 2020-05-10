package a1.Assignment1ZbuceaRazvan30431.generator;

import a1.Assignment1ZbuceaRazvan30431.model.GroceryItem;
import a1.Assignment1ZbuceaRazvan30431.model.Report;

import java.time.LocalDate;
import java.util.List;

public class WeeklyReportGenerator extends ReportGenerator {

    @Override
    public Report generateReport(List<GroceryItem> groceryItems, LocalDate date) {
        return createReport(groceryItems, date, 7);
    }
}
