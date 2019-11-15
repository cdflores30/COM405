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
public class AdminStaff extends Employees{
    protected Managers manager;
    
    public AdminStaff(String nameIn, double rateOfPayIn, int hoursIn, int holidays , Managers managerIn) {
        super(nameIn, rateOfPayIn, hoursIn, holidays);
        manager = managerIn;
    }

    public Managers getManager() {
        return manager;
    }
    
    public void setManager(Managers managerIn){
    manager = managerIn;
    }
}
