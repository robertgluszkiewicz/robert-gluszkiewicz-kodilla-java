package com.kodilla.good.patterns.food2door.suppliers;

import java.util.Set;

public interface Supplier {

    String getSupplierName();
    Set<Product> getProducts();
    boolean process();
}
