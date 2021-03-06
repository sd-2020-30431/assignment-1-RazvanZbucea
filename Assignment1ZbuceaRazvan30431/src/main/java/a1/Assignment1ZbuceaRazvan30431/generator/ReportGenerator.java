package a1.Assignment1ZbuceaRazvan30431.generator;

import a1.Assignment1ZbuceaRazvan30431.model.ConsumptionItem;
import a1.Assignment1ZbuceaRazvan30431.model.GroceryItem;
import a1.Assignment1ZbuceaRazvan30431.model.Report;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {

    public abstract Report generateReport(List<GroceryItem> groceryItems, LocalDate date);

    public Report createReport(List<GroceryItem> groceryItems, LocalDate date, int days) {
        List<GroceryItem> wastedGroceryItems = new ArrayList<>();

        for (GroceryItem groceryItem : groceryItems) {
            if ((groceryItem.getExpirationDate().isBefore(date.plusDays(days)) && groceryItem.getExpirationDate().isAfter(date))
                    || groceryItem.getExpirationDate().isEqual(date)
                    || groceryItem.getExpirationDate().isEqual(date.plusDays(days))) {
                GroceryItem wastedGroceryItem = groceryItem;
                int wastedQuantity = groceryItem.getQuantity();

                for (ConsumptionItem consumptionItem : groceryItem.getConsumptionItems()) {
                    wastedQuantity -= consumptionItem.getQuantity();
                }
                wastedGroceryItem.setQuantity(wastedQuantity);
                wastedGroceryItems.add(wastedGroceryItem);
            }
        }
        return new Report(wastedGroceryItems);
    }
}
