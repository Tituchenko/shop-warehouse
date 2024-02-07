package ru.gb.shopwarehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.shopwarehouse.models.Product;
import ru.gb.shopwarehouse.models.ProductReserved;
;
@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
