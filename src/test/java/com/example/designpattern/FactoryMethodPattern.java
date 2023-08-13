package com.example.designpattern;

import com.example.designpattern.factory.framework.Factory;
import com.example.designpattern.factory.framework.Product;
import com.example.designpattern.factory.idcard.IDCardFactory;
import org.junit.jupiter.api.Test;

public class FactoryMethodPattern {
    @Test
    void main(){
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("hs.jang");
        Product product2 = factory.create("hs.jang2");
        Product product3 = factory.create("hs.jang3");
        product1.use();
        product2.use();
        product3.use();
       ((IDCardFactory) factory).printCards();
    }
}
