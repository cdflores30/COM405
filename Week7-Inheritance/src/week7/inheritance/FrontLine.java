package week7.inheritance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 4florc81
 */
public class FrontLine extends Employees {

    public FrontLine(String nameIn, double yearlyPay, int hoursIn, int holidays) {
        super(nameIn, yearlyPay, hoursIn, holidays);
    }

    @Override
    public double getHourlyRateOfPay() {
        double hourlyPay = yearlyPay / (365 * 8);
        return hourlyPay;
      
    }
}
