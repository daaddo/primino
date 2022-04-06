/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.primino;

/**
 *
 * @author Anna
 */
public class Main {
    public static void main(String[] args) {
        
        Integer i = null;
        try{
            System.out.println("i = "+i.byteValue());
        }catch(NullPointerException ex){
            System.out.println("messaggio: "+ex.getMessage());
        }
        System.out.println("BUONO 1");
        System.out.println("Ciao e no non dico a te");
        System.out.println("modifica ok");
        System.out.println("Sono sul MASTER!");
        
        System.out.println("ora facciamo i branch!");
        
        System.out.println("prova prova 2");
        
        //modifica 1
        
        System.out.println("geppetto spaccia ciccine");
        //modifica durante lo stage
        
        //modifica 2
    }
}
