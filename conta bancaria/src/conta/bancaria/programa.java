/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.bancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class programa {

    conta c = new conta();
    private ArrayList minhaconta = new ArrayList();
    private double sacar = 0, depositar = 0;
    private int op;
    Scanner sc = new Scanner(System.in);

    public programa() {
        System.out.println("Nome do titular:");
        c.setTitular(sc.nextLine());
        System.out.println("Saldo bancário");
        c.setSaldo(sc.nextDouble());
        minhaconta.add(c.toString());
        System.out.println("deseja sacar ou depositar?"
                + "\n 1 p/ saque"
                + "\n 2 p/ deposito");
        op = sc.nextInt();
    }

    private double operacao() {
        if (op == 1) {
            System.out.println("Valor a sacar");
            this.sacar = sc.nextDouble();
            if (c.getSaldo() > this.sacar) {
                System.out.println("Saque efetuado");
                double novoSaldo = c.getSaldo() - this.sacar;
                c.setSaldo(novoSaldo);
            } else if(c.getSaldo() == this.sacar){
                double novoSaldo = c.getSaldo() - this.sacar;
                c.setSaldo(novoSaldo);
                System.out.println("Conta sem saldo");
            }else{
                double novoSaldo = c.getSaldo() - this.sacar;
                c.setSaldo(novoSaldo);
                System.out.println("Valor negativo");
            }
        } else {
            System.out.println("Valor a depositar");
            this.depositar = sc.nextDouble();
            System.out.println("Deposito efetuado");
            double novoSaldo = c.getSaldo() + this.depositar;
            c.setSaldo(novoSaldo);
        }
        return c.getSaldo();
    }

    public String toString() {
        this.operacao();
        return "Você depositou: R$ " + this.depositar
                + "\n Você sacou: R$ " + this.sacar
                + "\n Seu saldo agora é: R$ " + c.getSaldo();
    }
}
