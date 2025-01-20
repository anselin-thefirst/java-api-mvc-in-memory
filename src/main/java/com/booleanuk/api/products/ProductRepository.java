package com.booleanuk.api.products;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();

        this.products.add(new Product("Bagel", "Food", 10));
        this.products.add(new Product("Tea", "Food", 12));
        this.products.add(new Product("Harry Potter", "Book", 100));
    }

    public List<Product> getAll() {
        return this.products;
    }

    public Product create(Product product) {
        this.products.add(product);
        return product;
    }

    public Product getOne(int id) {
        for (Product product : this.products) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    public Product update(int id, Product product) {
        for (Product pToUpdate : products) {
            if (id == pToUpdate.getId()) {
                this.products.get(id).setName(product.getName());
                this.products.get(id).setCategory(product.getCategory());
                this.products.get(id).setPrice(product.getPrice());
                return this.products.get(id);
            }
        }
        return null;
    }

    public Product delete(int id) {
        return this.products.remove(id);
    }
}
