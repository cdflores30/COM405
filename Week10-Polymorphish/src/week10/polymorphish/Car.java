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
public class Car extends Vehicle {

    public Car(String registration, double weightIn) {
        super(registration, weightIn);
    }

    @Override
    public double calculateFee() {
        if (weight > 1590) {
            
        }
        return 5.00;
    }
    
}
