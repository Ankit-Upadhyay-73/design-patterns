/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.adapter;

/**
 *
 * @author Ankit
 */
public class AssignmentWork {
    private Pen p;
    public void setP(Pen p) {
        this.p = p;
    }
    public void write(String assgn){
        p.write(assgn);
    }
}
