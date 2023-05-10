/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumaListas;

/**
 *
 * @author ASUS
 */
public class SumarPilas {
        public PilaLista<Integer> sumarPilas(PilaLista<Integer> p1, PilaLista<Integer> p2) throws Exception{
            PilaLista<Integer> resultado = new PilaLista<>();
            while(p1!=null){
                if(p2!=null){
                    resultado.push(p1.pop()+p2.pop());
                }else{
                    resultado.push(p1.pop());
                }
                
            }
            return resultado;
        }
}
