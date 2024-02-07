package ru.gb.shopwarehouse.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class ProductReserved {
    Long id;
    int toReserved;
}
