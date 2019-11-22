/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.abstraction;

/**
 *
 * @author 4florc81
 */
public class Manager extends Employee{
    protected int bonus;
    
    
    public Manager(String nameIn, double rateOfPayIn, int numofHoursIn, int daysIn, int bonusIn) {
        super(nameIn, rateOfPayIn, numofHoursIn, daysIn);
        bonus = bonusIn;
    }

    @Override
    public void setYearlySalary(double rateOfPayIn) {
        if (bonus > 0 && bonus<=100) {
            
            
        }
        yearlyPayment = rateOfPayIn;
    }
    
    public String getName ()
    {
    return name;
    }
}
