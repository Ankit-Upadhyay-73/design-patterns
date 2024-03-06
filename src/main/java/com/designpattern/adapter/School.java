/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.adapter;

import com.designpattern.adapter.old.PilotPen;

/**
 *
 * @author Ankit
 */
public class School {
    public static void main(String arg[]){   
        AssignmentWork aw = new AssignmentWork();
        Pen p = new PenAdapter();
        aw.setP(p);
        aw.write("I am doing it now");   
    }
}
