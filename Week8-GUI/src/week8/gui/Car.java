/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.gui;

/**
 *
 * @author 4florc81
 */
public class Car {

    private String id;
    private String colour;
    private String make;
    private String model;

    public Car(String id, String colour, String make, String model) {
        this.id = id;
        this.colour = colour;
        this.make = make;
        this.model = model;
    }

    public String getId() {
        return id;
    }
}
