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
public class Frontline extends Manager{
    
    public Frontline(String nameIn, double rateOfPayIn, int numofHoursIn, int daysIn) {
        super(nameIn, rateOfPayIn, numofHoursIn, daysIn);
    }
    
    //This time the payment is per hour 
    @Override
    public double getYearlySalary() {
    double weeklyPayment = rateOfPay /50 ;     
    double hourlyPayment = weeklyPayment / numOfHoursPerWeek ;
    return hourlyPayment;
    }
    
    
}
