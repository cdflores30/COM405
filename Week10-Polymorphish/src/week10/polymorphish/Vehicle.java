/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10.polymorphish;

/**
 *
 * @author Carlos Flores
 */
public abstract class Vehicle {
    protected String registrationNumber;
    public double weight;
    
    public Vehicle (String registration, double weightIn){
    registrationNumber= registration;
    weight=weightIn;
    }
    
    public abstract double calculateFee();
    
    public String getRegistration(){
    return registrationNumber;
    }
    
    public double getWeight(){
    return weight;
    }
}
