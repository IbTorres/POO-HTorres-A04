/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p00.htorres.a03;

/**
 *
 * @author Hibeth Torres
 */
public class P00HTorresA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Telefono starTac = new Telefono();
        starTac.EA.presionar ();
        System.out.println("el starTac esta: " + starTac.EA.Io);
        
        starTac.setTeclado();
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 3; j++){
                    System.out.print(starTac.Teclado [i][j].getDigito());
                    if (j==starTac.Teclado[0].length-1) {
                        System.out.println("");
                }              
            }
        }
    }   
}
    

