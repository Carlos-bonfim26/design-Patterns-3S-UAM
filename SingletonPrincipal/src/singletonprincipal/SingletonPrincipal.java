/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonprincipal;

/**
 *
 * @author profslpa
 */
public class SingletonPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SingletonObject object1 = SingletonObject.getInstance();
        object1.showMessage();
        
        System.out.println("");
         SingletonObject object2 = SingletonObject.getInstance();
        object2.showMessage();
    }
    
}
