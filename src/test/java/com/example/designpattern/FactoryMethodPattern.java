package com.example.designpattern;

import com.example.designpattern.factory.framework.Factory;
import com.example.designpattern.factory.framework.Product;
import com.example.designpattern.factory.idcard.IDCardFactory;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

    @Test
    void testStaticFactoryMethods() throws NoSuchAlgorithmException {
        List list1 = List.of(1,2,3);
        SecureRandom random= SecureRandom.getInstance("NativePRNG");
        List<String> arrayList = Arrays.asList("1","2");
        // 관습적으로 Class Method 를 활용할 경우 s 가 붙고 객체를 직접 다루면 s 가 안붙고
    }
}
