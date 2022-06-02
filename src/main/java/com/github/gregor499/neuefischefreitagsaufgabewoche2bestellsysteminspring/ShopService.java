package com.github.gregor499.neuefischefreitagsaufgabewoche2bestellsysteminspring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final ProductRepo myProducts;
    private final OrderRepo myOrders;

    public Product getProduct(String id){
        return myProducts.get(id).orElseThrow();
    }

    public List<Product> listProducts(){
        return myProducts.list();
    }

    public void addOrder(List<String> productsToOrder){
        boolean unknownIDPresent = productsToOrder.stream()
                .anyMatch(p -> myProducts.get(p).isEmpty());
        if (unknownIDPresent){
            throw new NoSuchElementException();
        }
        List<Product> orderedProducts = productsToOrder.stream()
                .map(p -> getProduct(p))
                .toList();
        myOrders.add(new Order(orderedProducts));
    }

    public Order getOrder(String id){
        return myOrders.get(id).orElseThrow();
    }

    public List<Order> listOrders(){
        return myOrders.list();
    }

}