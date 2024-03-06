/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.builder;

/**
 *
 * @author Ankit
 */
public class PhoneBuilder {
    
    String processor;
    int battery;
    double screenSize;
    int ram;
    String OS;

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }
    
    public Phone getPhone(){
        return new Phone(processor, battery, screenSize, ram, OS);
    }
}
