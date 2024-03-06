/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.designpattern.observer;

/**
 *
 * @author Ankit
 */
public interface Subject {

    void notifySubscribers();

    void subscribe(Subscriber s);

    void unsubscribe(Subscriber ss);

    void upload();
    
}
