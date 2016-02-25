/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p00.htorres.a03;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Hibeth Torres
 */
public class Telefono {
    //Atributos, instanciar objetos
    
    botonApagar EA = new botonApagar();
    Scanner Input = new Scanner(System.in);
    Tecla [] [] Teclado = new Tecla [5][3];
    public void setTeclado (){
        int dig = 0;
          for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                dig++;
                String d1 = String.valueOf(dig);
                Tecla temp = new Tecla();
                char d = d1.charAt(0);
                temp.setDigito(d);
           
        Teclado [i][j] = temp; 
        }
    }
        Tecla temp = new Tecla();
        Tecla temp1 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp2 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp3 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp4 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp5 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        Tecla temp6 = new Tecla();//Esto es critico, si no, el programa te va a tronar.
        
        temp1.setDigito('*');
        Teclado [3][0] = temp1;
        temp2.setDigito('0');
        Teclado [3][1] = temp2;
        temp3.setDigito('#');
        Teclado [3][2] = temp3;

    class EA {

        public EA() {
        }
    }}}
