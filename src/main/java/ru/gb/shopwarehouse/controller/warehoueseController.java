package ru.gb.shopwarehouse.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.shopwarehouse.models.Product;
import ru.gb.shopwarehouse.models.ProductReserved;
import ru.gb.shopwarehouse.services.ProductService;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class warehoueseController {
    ProductService productService;
    @PostMapping("/reserved")
    public Product reservedProduct(@RequestBody ProductReserved productReserved){
        return productService.updateProduct(productReserved);
    }
}
