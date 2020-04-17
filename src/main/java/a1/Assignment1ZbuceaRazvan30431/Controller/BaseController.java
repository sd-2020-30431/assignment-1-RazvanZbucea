package a1.Assignment1ZbuceaRazvan30431.Controller;

import a1.Assignment1ZbuceaRazvan30431.model.GroceryItem;
import a1.Assignment1ZbuceaRazvan30431.model.GroceryList;
import a1.Assignment1ZbuceaRazvan30431.model.User;
import a1.Assignment1ZbuceaRazvan30431.repository.GroceryItemRepository;
import a1.Assignment1ZbuceaRazvan30431.repository.GroceryListRepository;
import a1.Assignment1ZbuceaRazvan30431.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Transactional
@Component
public class BaseController implements CommandLineRunner {
    private final GroceryItemRepository groceryItemRepository;
    private final GroceryListRepository groceryListRepository;
    private final UserRepository userRepository;

    public BaseController(GroceryItemRepository groceryItemRepository, GroceryListRepository groceryListRepository, UserRepository userRepository) {
        this.groceryItemRepository = groceryItemRepository;
        this.groceryListRepository = groceryListRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        GroceryItem groceryItem1 = new GroceryItem("Apple", 25, 100, LocalDate.now(), LocalDate.now(), LocalDate.now());
        GroceryItem groceryItem2 = new GroceryItem("Apple", 25, 100, LocalDate.now(), LocalDate.now(), LocalDate.now());

        GroceryList groceryList1 = new GroceryList();
        groceryList1.getGroceryItems().add(groceryItem1);
        groceryList1.getGroceryItems().add(groceryItem2);

        groceryItem1.setGroceryList(groceryList1);
        groceryItem2.setGroceryList(groceryList1);

        User user1 = new User();
        user1.getGroceryLists().add(groceryList1);

        groceryList1.setUser(user1);

        groceryItemRepository.save(groceryItem1);
        groceryItemRepository.save(groceryItem2);

        groceryListRepository.save(groceryList1);

        userRepository.save(user1);
    }
}
