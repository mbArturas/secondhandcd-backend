package lt.secondhandcd.shoppinglist.repositories;

import lt.secondhandcd.shoppinglist.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
