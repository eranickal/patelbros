/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usps.shoppingcart.patelbros;

/**
 *
 * @author Owner
 */
public class WebAutomation {
    private String name;
    private float price;
    private int id;
    private int loc;

    @Override
    public String toString() {
        return "WebAutomation{" + "name=" + name + ", price=" + price + ", id=" + id + ", loc=" + loc + '}';
    }

    
    public WebAutomation(String name, float price, int id, int loc) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.loc = loc;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }
    
    public String getFullprice(){
        float tax = this.price * 0.13f;
        float fullprice = this.price + tax;
      return "" + fullprice;
        }
}
