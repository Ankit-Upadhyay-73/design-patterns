/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.builder;

/**
 *
 * @author Ankit
 */
public class BuilderMain {
    
    public static void main(String a[]){
        
        Phone p = new PhoneBuilder().setProcessor("Qualcomm").setScreenSize(5.5).getPhone();
        
        System.out.println(p);
        
    }
}
