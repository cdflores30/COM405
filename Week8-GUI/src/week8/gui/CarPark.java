/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.gui;

/**
 *
 * @author 4florc81
 */
public class CarPark {
    private Car[] carrito = new Car[15];
    
    public boolean addCar(Car carrote)
    {
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] == null) {
                carrito[i] = carrote;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeCar(String idNumber)
    {
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] != null) {
                if (idNumber.equals(carrito[i].getId())) {
                    carrito[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    public int seeOccupiedSpaces(){
        int occupiedSpace = 0;
        for (Car carrito1 : carrito) {
            if (carrito1 != null) {
                occupiedSpace+=1;
            }
        }
        return occupiedSpace;
    }
}
