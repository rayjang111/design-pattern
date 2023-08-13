package com.example.designpattern.factory.idcard;

import com.example.designpattern.factory.framework.Product;

public class IDCard extends Product {
    private String owner;
    private long id;

    IDCard(String owner, Long id) {
        System.out.println(owner +"의 카드를 만듭니다.");
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println(this+ "을 사용합니다");
    }

    @Override
    public String toString(){
        return "[IDCARD:" + owner + ", ID:"+ id +"]";
    }
    public String getOwner(){
        return owner;
    }
    public Long getId(){
        return id;
    }
}
