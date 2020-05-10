package a1.Assignment1ZbuceaRazvan30431.service;

import a1.Assignment1ZbuceaRazvan30431.model.GroceryItem;
import a1.Assignment1ZbuceaRazvan30431.repository.GroceryItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroceryItemService {
    private final GroceryItemRepository groceryItemRepository;

    public GroceryItem saveGroceryItem(GroceryItem groceryItem) {
        return groceryItemRepository.save(groceryItem);
    }

    public List<GroceryItem> findAllGroceryItems() {
        return groceryItemRepository.findAll();
    }
}
