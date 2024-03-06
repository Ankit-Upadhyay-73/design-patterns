/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ankit
 */
public class Subscriber implements NewInterface {
   
    String name;
    private Channel ch;
    
    @Override
    public void update(String message){
          System.out.println("Hey "+this.name +", "+message);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subscriber{" + "name=" + name + ", ch=" + ch + '}';
    }

    public void setChannel(Channel ch) {
        this.ch = ch;
    }
    
}
