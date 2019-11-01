/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 4florc81
 */
public class Car {

    private String brand;
    private int colour;
    private String id;

    public void Car(String brandIn,int colourIn, String idIn) {
        brand = brandIn;
        colour=colourIn;
        id=idIn;
    }

    public String getCar() {
        return brand;
    }

    public int getColour() {
        return colour;
    }

    public String getId() {
        return id;
    }
}
