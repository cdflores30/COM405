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
public class AdminStaff extends Employee{
    public Manager mana;

    public AdminStaff(String nameIn, double rateOfPayIn, int numofHoursIn, int daysIn, Manager manaIn) {
        super(nameIn, rateOfPayIn, numofHoursIn, daysIn);
        mana = manaIn;
    }
    
    public String getManager()
    {
    return mana.getName();
    }
    
    public void setManager(Manager manaIn)
    {
    mana = manaIn;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\n rate of pay per year: " + getSalary() + "\n Number of Hours they are contracted per week: " + numOfHoursPerWeek
                + "Holidays entitlement: " + holidayDays + "Manager assigned: " + getManager();
    }
    
}
