/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.os;

/**
 *
 * @author Ankit
 */
public class OSFactory {
    
    public OS getInstance(String need){
        if(need.equals("Free")){
            return new Android();
        }else if(need.equals("Secured")){
            return new IOS();
        }else{
            return new Windows();
        }
    }
}
