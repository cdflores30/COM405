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
public class Lorry extends Vehicle{

    public Lorry(String registration, double weightIn) {
        super(registration, weightIn);
    }

    @Override
    public double calculateFee() {
        if (weight > 8000) {
            return 15.00;
        }
        return 10.00;
    }
    
}
