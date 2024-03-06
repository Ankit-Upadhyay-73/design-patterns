/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
}

class Leaf implements Component{

    String name;
    int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void showPrice() {
        System.out.println(name + " " +price);
    }
}

class Composite implements Component{
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    
    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c: components){
            c.showPrice();
        }
    }

    public void addComponent(Component component){
        components.add(component);
    }    
}
