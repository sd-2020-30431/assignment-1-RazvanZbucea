package a1.Assignment1ZbuceaRazvan30431.repository;

import a1.Assignment1ZbuceaRazvan30431.model.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryItemRepository extends JpaRepository<GroceryItem, Integer> {
}
