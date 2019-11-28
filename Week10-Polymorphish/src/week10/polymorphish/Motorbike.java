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
public class Motorbike extends Vehicle{

    public Motorbike(String registration, double weightIn) {
        super(registration, weightIn);
    }

    @Override
    public double calculateFee() {
        return 3.00; 
    }
    
}
