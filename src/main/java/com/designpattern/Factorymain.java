/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern;

import com.designpattern.os.Android;
import com.designpattern.os.IOS;
import com.designpattern.os.OS;
import com.designpattern.os.OSFactory;

/**
 *
 * @author Ankit
 */
public class Factorymain {
    
    public static void main(String args[]){
        OSFactory osf = new OSFactory();
        osf.getInstance("Secured").getSpecs();
    }
}
