/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author 4florc81
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean option = true;
        Park add = new Park();
        Scanner input = new Scanner(System.in);
        while(option){
        System.out.println("Please select one of the following options: \nA - Add a car \nB - Remove a car \nC - View number of free Spaces/number of cars in the car park");
        String option2 = input.nextLine();
            if (option2.equals("A")) {
                System.out.println("Select the registration number: ");
                String rNumber = input.nextLine();
                Car id = new Car(rNumber);
                add.addCar(id);
            }
            else if (option2.equals("B")) {
                System.out.println("Select the registration number: ");
                String r2Number = input.nextLine();
                add.removeCar(r2Number);
            }
            else if (option2.equals("C")) {
                System.out.println("There are " +add.seeOccupiedSpaces()+ " occupied spaces");
            }
        }
    }
    
}
