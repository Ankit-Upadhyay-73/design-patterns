/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.composite;

/**
 *
 * @author Ankit
 */
public class CompositePattern {
    public static void main(String[] args) {
        
        Component monitor = new Leaf("Monitor", 3000);
        Component keyboard = new Leaf("Keyboard", 500);
        Component hdd = new Leaf("HDD", 1000);
        
        Composite cab = new Composite("Cabinate");
        Composite peri = new Composite("Peripherals");
        
        Composite comp = new Composite("Computer");
        cab.addComponent(hdd);
        peri.addComponent(monitor);
        peri.addComponent(keyboard);
        
        comp.addComponent(cab);
        comp.addComponent(peri);

        comp.showPrice();
        
    }    
}
