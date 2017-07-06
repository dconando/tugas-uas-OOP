/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olahraga;

/**
 *
 * @author user
 */
public abstract class LBasket implements Lapangan{   
/**
     *
     */
    @Override
    public void tlatihan(){
        System.out.println("ini tempat kita berlatih");
    }
    
    @Override
    public void tberlari(){
        System.out.println("Mari Berlari Mengejar mimpi ");
    }
    
    @Override
    public void tberteduh (){
        System.out.println("Berteduh dari serangan hujan badai");
    }
}   

