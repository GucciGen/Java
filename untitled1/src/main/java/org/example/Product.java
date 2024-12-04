package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private Category category;
}
