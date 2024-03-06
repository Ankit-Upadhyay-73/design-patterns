/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.prototype;

/**
 *
 * @author Ankit
 */
public class Prototype {

    public static void main(String[] as) throws CloneNotSupportedException{
        
        BookShop bs = new BookShop();
        bs.setShopName("Ankur");
        bs.loadData();
        
        BookShop b2 = bs.clone();
        b2.setShopName("Prajwani");
        
        bs.getBooks().remove(2);
        System.out.println(bs);
        System.out.println(b2);
    }
}
