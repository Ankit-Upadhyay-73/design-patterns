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
public class PenAdapter implements Pen{
    PilotPen pp = new PilotPen();
    @Override
    public void write(String s) {
        pp.mark(s);
    }
}
