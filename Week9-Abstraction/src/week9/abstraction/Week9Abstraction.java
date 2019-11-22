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
public class Week9Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee s = new Employee ("carlos", 20000, 15,15);
        Manager m1 = new Manager("Pipo", 20000, 15,15,12);
        AdminStaff sq = new AdminStaff("carlos", 20000, 15,15,m1);
        
        System.out.println(sq.getManager());
    }
    
}
