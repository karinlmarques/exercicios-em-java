/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class Controle {
    Operadores op = new Operadores();
    private int simbolo;
   public void pedeValor(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite N1:");
       op.setN1(sc.nextInt());
       System.out.println("Digite N2:");
       op.setN2(sc.nextInt()); 
       System.out.println("Operador:"+"\n "+
                "1 - Soma"+"\n "
               + "2 - Sub"+"\n "
               + "3 - Div"+"\n "
               + "4 - Fatorial"+"\n "
               + "5 - Pot"+"\n "
               + "6 - Mult");
       this.simbolo=sc.nextInt(); 
   }
   
   public int escolheValor(){
       switch(this.simbolo){
           case 1:
               return op.Soma();  
           case 2:
               return op.Sub();
           case 3:
               return op.Div();
           case 6:
               return op.Multi();
           default:
               return 0;
               
       }
   }
}
