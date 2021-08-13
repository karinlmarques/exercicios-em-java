/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanches;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Lancheria {
    
    recebeValores rv = new recebeValores();
    
    
    private double Lanche(){
        if(rv.getOpL()==1){
            rv.setNomeL("Torrada");
            return rv.getQntL()*10;
        }else if(rv.getOpL()==2){
             rv.setNomeL("Cachorro Quente");
            return rv.getQntL()*15;
        }else if(rv.getOpL()==3){
             rv.setNomeL("Xis");
            return rv.getQntL()*20;
        }else{
            System.out.println("Opção Inválida!");
            return 0;
        }
    
    }
    
    private double Bebida(){
        if(rv.getOpB()==1){
             rv.setNomeB("Água");
            return rv.getQntB()*2.5;
        }else if(rv.getOpB()==2){
             rv.setNomeB("Refri");
            return rv.getQntB()*4.5;
        }else{
            return 0;
        }
    }
        public String toString(){
            double total= this.Lanche()+this.Bebida();
            return "Seu Lanche já está sendo preparado...\n"
                    + "O pedido foi:"
                    + "\n"+rv.getQntL()+"-"+rv.getNomeL()
                    + "\n"+rv.getQntB()+"-"+rv.getNomeB()
                    +"\n Total da sua compra é R$"
                    +total;
                    
        
        }
    }

