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
public class Employees {
    //ATTRIBUTES
    protected String name;
    protected double yearlyPay;
    protected int hours,holidaysDays;
    
    public Employees(String nameIn, double yearlyPayIn, int hoursIn, int holidays){
    name=nameIn;
    yearlyPay=yearlyPayIn;
    hours=hoursIn;
    holidaysDays=holidays;
    }

    public void setRateOfPay(double rateOfPay) {
        this.yearlyPay = rateOfPay;
    }

    public boolean setHours(int hoursIn) {
        if (hoursIn>0 && hoursIn <=40) {
            hours = hoursIn;
            return true;
        }
        return false;
    }

    public void setHolidaysDays(int holidaysDays) {
        this.holidaysDays = holidaysDays;
    }


    public double getHourlyRateOfPay() {
        double hourlyPay = yearlyPay / (365 * 8);
        return hourlyPay;
    }
    
    public double getYearlySalary(){
    return yearlyPay;
    }
    
    public boolean bookHoliday(int numOfDays){
        if (holidaysDays - numOfDays >=0 && numOfDays >0) {
            holidaysDays-=numOfDays;
            return true;
        }
        return false;
    }
    
    
}
