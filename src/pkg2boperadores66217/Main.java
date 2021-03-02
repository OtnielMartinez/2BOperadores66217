/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2boperadores66217;

import java.util.Scanner;

/**
 *
 * @author lampi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1=0;
        int valor2=0;
        int valor3=0;
        int valor4=0;
        int multi1 =0;
        int multi2=0;
        int determinante =0;
        Scanner miConsola = new Scanner( System.in);
        System. out. println("Ingrese un valor en la pocision [0][0] ");
        valor1= miConsola.nextInt();
         System. out. println("Ingrese un valor en la pocision [0][1] ");
        valor2= miConsola.nextInt();
         System. out. println("Ingrese un valor en la pocision [1][0] ");
        valor3= miConsola.nextInt();
         System. out. println("Ingrese un valor en la pocision [1][1] ");
        valor4= miConsola.nextInt();
        int matriz [][] =  new int [2][2];
        matriz[0][0]= valor1;
        matriz[0][1]= valor2;
        matriz[1][0]= valor3;
        matriz[1][1]= valor4;
        for (int i=0; i < 2; i++){
            for (int j=0; j < 2; j++){
                System. out. println("La matriz es [" + i + "] [ " + j + "] = "  + matriz[i][j]); 
            }
        }      
        multi1= valor1*valor4;
        multi2= valor2*valor3;
        determinante=multi1-multi2;
        System. out. println("El determiante de la matriz es =" + determinante);
    }
    
}
