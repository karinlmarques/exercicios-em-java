package vendaingressos;

import java.util.ArrayList;
import java.util.Scanner;

public class Processos {

    ArrayList<String> ingressos = new ArrayList<String>();
    Ingressos i = new Ingressos();
    private double valor = 0;
    private String nome, cpf;
    Scanner sc = new Scanner(System.in);

    public Processos() {
        int s = 0;
        System.out.println("Informe nome");
        this.nome = sc.nextLine();
        System.out.println("informe CPF");
        this.cpf = sc.nextLine();
        while (s != -1) {
            System.out.println("qual sua opção de ingresso?"
                    + "\n 1 para comum"
                    + "\n 2 para Vip"
                    + "\n 3 para Camarote");
            i.setOpIng(sc.nextInt());
            ingressos.add(this.escIng());
            System.out.println("digite -1 para sair");
            s = sc.nextInt();
        }
    }

    public String escIng() {

        switch (i.getOpIng()) {
            case 1:
                i = new Comum();
                valor += i.getPreco();
                return i.toString();
            case 2:
                i = new Vip();
                valor += i.getPreco();
                return i.toString();
            case 3:
                i = new Camarote();
                valor += i.getPreco();
                return i.toString();
            default:
                return "opção inválida";
        }
    }

    public String toString() {
        return "nome: " + this.nome
                + "\n CPF: " + this.cpf
                + "\n ingressos" + ingressos
                + "\n total a pagar: " + valor;
    }
}
