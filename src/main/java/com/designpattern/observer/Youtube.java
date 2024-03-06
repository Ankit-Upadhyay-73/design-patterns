/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.observer;

/**
 *
 * @author Ankit
 */
public class Youtube {

    public static void main(String[] args) {

        Channel telusko = new Channel();

        Subscriber s1 = new Subscriber();
        s1.setName("Ankit");
        Subscriber s2 = new Subscriber();
        s2.setName("Amit");
        Subscriber s3 = new Subscriber();
        s3.setName("Dhiraj");
        Subscriber s4 = new Subscriber();
        s4.setName("Anurag");

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);

        telusko.unsubscribe(s3);

        telusko.upload();

    }
}
