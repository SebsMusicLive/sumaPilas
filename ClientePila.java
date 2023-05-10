/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumaListas;

import pilasListasEnlazadas.*;

/**
 *
 * @author ASUS
 */
public class ClientePila {
    public static void main(String[] args) throws Exception {
        PilaLista<Integer> pila1 = new PilaLista<>();
        PilaLista<Integer> pila2 = new PilaLista<>();
        
        for (int i = 0; i <= 6; i++) {
            pila1.push((int)(Math.random()*100));
            
        }
        
        for (int i = 0; i <= 3; i++) {
            pila2.push((int)(Math.random()*100));
            
        }
        SumarPilas suma = new SumarPilas();
        
        System.out.println(pila1.print());
        System.out.println(pila2.print());
        System.out.println(suma.sumarPilas(pila1, pila2).print());
    }
}
