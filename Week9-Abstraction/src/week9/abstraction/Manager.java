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
public abstract class Manager {
protected String name;
protected double rateOfPay;
protected int numOfHoursPerWeek;
protected int holidayDays;

public Manager(String nameIn, double rateOfPayIn , int numofHoursIn , int daysIn){
name = nameIn;
rateOfPay = rateOfPayIn;
numOfHoursPerWeek =  numofHoursIn;
holidayDays = daysIn;
}

public void setRateOfPay (double rateOfPayIn)
{
rateOfPay = rateOfPayIn;
}

public boolean setContactHours(int hoursIn){
    if (hoursIn >=0 && hoursIn <= 40) {
        numOfHoursPerWeek = hoursIn;
        return true;
    }
return false;
}

public double getYearlySalary(){
return rateOfPay;
}

public boolean bookHoliday (int bookedDays)
{
    if (bookedDays >0 && bookedDays <= 20) {
        holidayDays=holidayDays - bookedDays;
        return true;
    }
    return false;
}

@Override
public String toString ()
{
return "Name: " + name + "\n rate of pay per year: " + getYearlySalary()+ "\n Number of Hours they are contracted per week: " + numOfHoursPerWeek
        + "Holidays entitlement: " + holidayDays ;
}
}
