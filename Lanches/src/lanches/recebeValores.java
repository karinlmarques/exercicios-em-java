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
public class recebeValores {
    private int qntL;
    private int qntB;
    private String nomeL;
    private String nomeB;
    private int opL;
    private int opB; 
    
    
    public void setNomeL(String nomeL){
        this.nomeL=nomeL;
    }
    public void setNomeB(String nomeB){
        this.nomeB=nomeB;
    }
    public String getNomeL(){
        return this.nomeL;
    }
    public String getNomeB(){
        return this.nomeB;
    }
    public int getOpL(){
        return this.opL;
    }
    public int getOpB(){
        return this.opB;
    }
    public int getQntL(){
        return this.qntL;
    }
    public int getQntB(){
        return this.qntB;
    }
    
    
    
    
    Scanner sc= new Scanner(System.in);
    
    public recebeValores(){
        System.out.println("Digite:"
                +"\n 1- Torrada R$ 10,00"
                +"\n 2- Cachorro Quente r$ 15,00"
                +"\n 3- Xis r$ 20,00");
        this.opL= sc.nextInt();
        System.out.println(" Quantidade de Lanche:");
        this.qntL=sc.nextInt();
        System.out.println("Digite:"
                + "\n 1- Água R$ 2,50"
                + "\n 2- Refri R$ 4,50"
                + "\n 3- Nenhum");
        this.opB= sc.nextInt();
        if(this.opB>0&&this.opB<3){
            System.out.println("Quantidade Bebida");
            this.qntB=sc.nextInt();
        }else{
            System.out.println("Você não escolheu Bebida");
        }
    }
}
