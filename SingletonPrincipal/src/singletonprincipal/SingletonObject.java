/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonprincipal;

/**
 *
 * @author profslpa
 */
public final class  SingletonObject {
    private static SingletonObject instance;
    
    private SingletonObject(){
        
    }
    
    public static SingletonObject getInstance(){
        if(instance == null){
            instance = new SingletonObject();
        }
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Single object "+ this);
    }
}
