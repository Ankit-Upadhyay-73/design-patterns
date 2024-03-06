/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ankit
 */
public class BookShop implements Cloneable{
    String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void loadData(){
        
        for(int i=1; i<=10; i++){
            Book b = new Book();
            b.setbId(i);
            b.setbName("Book "+i);
            getBooks().add(b);
        }
        
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" + "shopName=" + shopName + ", books=" + books + '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        for(Book b: getBooks()){
            bs.getBooks().add(b);
        }
//        bs.setBooks(this.getBooks());
        return bs;
    }
    
}
