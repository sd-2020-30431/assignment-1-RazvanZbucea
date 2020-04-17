package a1.Assignment1ZbuceaRazvan30431.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "GroceryItem")
public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int quantity;
    private int calorieValue;
    private LocalDate purchaseDate;
    private LocalDate expirationDate;
    private LocalDate consumptionDate;

    public GroceryItem(String name, int quantity, int calorieValue, LocalDate purchaseDate, LocalDate expirationDate, LocalDate consumptionDate) {
        this.name = name;
        this.quantity = quantity;
        this.calorieValue = calorieValue;
        this.purchaseDate = purchaseDate;
        this.expirationDate = expirationDate;
        this.consumptionDate = consumptionDate;
    }

    @ManyToOne
    @JoinColumn(name = "groceryList")
    private GroceryList groceryList;
}
