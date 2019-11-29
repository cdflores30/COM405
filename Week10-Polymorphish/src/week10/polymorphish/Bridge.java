/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10.polymorphish;

/**
 *
 * @author 4florc81
 */
public class Bridge {
    private Vehicle vehic[];
    private int maxWeight;

    public Bridge(int maxWeight, int carLimit) {
        this.maxWeight = maxWeight;
        vehic = new Vehicle[carLimit];
    }
    
    
    public double calcTotalWeight(){
        double totalWeight = 0;
        for (int i = 0; i < vehic.length; i++) {
            if (vehic[i] != null) {
                totalWeight += vehic[i].getWeight();
            }       
        }
    return totalWeight;
    }
    
    public boolean addVehicle(Vehicle vehicleIn){
        if (calcTotalWeight() + vehicleIn.getWeight() >= maxWeight) {
            return false;
        }   
        for (int i = 0; i < vehic.length; i++) {
            if (vehic[i] == null) {
                vehic[i] = vehicleIn;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeVehicle(String registrationIn){
        for (int i = 0; i < vehic.length; i++) {
            if (vehic[i] != null && vehic[i].getRegistration().equals(registrationIn)) {
                vehic[i] = null;
                return true;
            }
        }
    return false;
    }
}
