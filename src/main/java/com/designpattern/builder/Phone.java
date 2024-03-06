/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.builder;

/**
 *
 * @author Ankit
 */
public class Phone {
 
    String processor;
    int battery;
    double screenSize;
    int ram;
    String OS;

    public Phone(String processor, int battery, double screenSize, int ram, String OS) {
        this.processor = processor;
        this.battery = battery;
        this.screenSize = screenSize;
        this.ram = ram;
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Phone{" + "processor=" + processor + ", battery=" + battery + ", screenSize=" + screenSize + ", ram=" + ram + ", OS=" + OS + '}';
    }
        
}
