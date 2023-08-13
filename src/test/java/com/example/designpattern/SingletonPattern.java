package com.example.designpattern;

import com.example.designpattern.singleton.Triple;
import org.junit.jupiter.api.Test;

public class SingletonPattern {
    @Test
    void main(){
        Triple alpha= Triple.getInstance("ALPHA");
        Triple beta = Triple.getInstance("BETA");
        Triple gamma = Triple.getInstance("GAMMA");
        System.out.println(alpha.getName());
        System.out.println(beta.getName());
        System.out.println(gamma.getName());
    }
}
