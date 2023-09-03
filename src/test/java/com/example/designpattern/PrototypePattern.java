package com.example.designpattern;

import com.example.designpattern.prototype.Manager;
import com.example.designpattern.prototype.MessageBox;
import com.example.designpattern.prototype.Product;
import com.example.designpattern.prototype.UnderlinePen;
import org.junit.jupiter.api.Test;

public class PrototypePattern {
    @Test
    public void main(){
        Manager manager = new Manager();
        manager.register("slash", new MessageBox('/'));
        manager.register("star", new MessageBox('*'));
        manager.register("underline", new UnderlinePen('_'));
        Product p1 = manager.create("slash");
        Product p2 = manager.create("star");
        Product p3 = manager.create("underline");
        p1.use("Hello How are you?");
        p2.use("Hello How are you?");
        p3.use("Hello How are you?");
    }
}
