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
public class Channel implements Subject {
    
    private String title;
    private List<Subscriber> subs = new ArrayList<>();
    @Override
    public void subscribe(Subscriber s){
        subs.add(s);
    }
    
    @Override
    public void unsubscribe(Subscriber ss){
        System.out.println(subs);
        subs.remove(ss);
    }
    
    @Override
    public void notifySubscribers(){
        for(Subscriber s: subs){
            s.update("New video: "+ title);
        }
    }
    
    @Override
    public void upload(){
        title = "Dance on Kamariya..";
        notifySubscribers();
    }
    
}
