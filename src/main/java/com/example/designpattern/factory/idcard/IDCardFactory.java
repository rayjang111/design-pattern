package com.example.designpattern.factory.idcard;

import com.example.designpattern.factory.framework.Factory;
import com.example.designpattern.factory.framework.Product;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    Map<Long,String> cards = new HashMap<>();
    Long id = 100L;

    @Override
    protected Product createProduct(String owner){
        id += 1L;
        cards.put(id,owner);
        return new IDCard(owner, id);
    }
    @Override
    protected void registerProduct(Product product){
        System.out.println(product+"을 등록했습니다.") ;
    }

    public void printCards(){
        for (Map.Entry<Long,String> entry : cards.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
