package ru.gb.shopwarehouse.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.shopwarehouse.models.Product;
import ru.gb.shopwarehouse.models.ProductReserved;
import ru.gb.shopwarehouse.repo.ProductRepo;

@Service
@AllArgsConstructor
public class ProductService {
    ProductRepo productRepo;

    public Product getProductById(Long id){
        return productRepo.findById(id).get();
    }

    public Product updateProduct(ProductReserved productReserved){
        Product product=getProductById(productReserved.getId());
        product.setReserved(productReserved.getToReserved());
        product.setAmount(product.getAmount()-productReserved.getToReserved());
        return productRepo.save(product);
    }
}
