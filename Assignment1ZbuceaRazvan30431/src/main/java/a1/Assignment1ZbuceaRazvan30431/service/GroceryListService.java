package a1.Assignment1ZbuceaRazvan30431.service;

import a1.Assignment1ZbuceaRazvan30431.model.GroceryList;
import a1.Assignment1ZbuceaRazvan30431.repository.GroceryListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroceryListService {
    private final GroceryListRepository groceryListRepository;

    public GroceryList saveGroceryList(GroceryList groceryList) {
        return groceryListRepository.save(groceryList);
    }

    public List<GroceryList> findAllGroceryLists() {
        return groceryListRepository.findAll();
    }
}
