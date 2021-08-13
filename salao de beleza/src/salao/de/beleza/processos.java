/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.de.beleza;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class processos {

    cliente c = new cliente();
    procedimentos p = new procedimentos();
    Scanner sc = new Scanner(System.in);
    private double preco = 0;
    private ArrayList al = new ArrayList();
    private int cont = 0, fid;

    public processos() {
        int s = 0;
        System.out.println("Digite Nome:");
        c.setNome(sc.nextLine());
        System.out.println("Digite CPF:");
        c.setCpf(sc.nextLine());
        while (s != -1) {
            System.out.println("Informe procedimento desejado:"
                    + "\n 1 p/ escova: R$ 80,00"
                    + "\n 2 p/ Unha pé e mão: R$ 45,00"
                    + "\n 3 p/ Unha pé: R$ 35,00"
                    + "\n 4 p/ Unha mão: R$ 20,00"
                    + "\n 5 p/ Corte Feminino: R$ 50,00"
                    + "\n 6 p/ Corte Masculino: R$ 35,00");
            p.setOpProc(sc.nextInt());
            this.escProcedimento();
            this.preco += this.calcPreco();
            System.out.println("Digite -1 para sair");
            s = sc.nextInt();
            cont++;
        }
        System.out.println("Deseja fazer curso de auto-maquiagem?"
                + "\n 1 p/ Curso em casa: R$ 150,00"
                + "\n 2 p/ Curso no salão: R$ 80,00"
                + "\n 3 p/ Não");
        p.setOpCurso(sc.nextInt());
        al.add(p.toString());
    }

    private void escProcedimento() {

        switch (p.getOpProc()) {
            case 1:
                p.getProcedimento().add("Escova");
                break;
            case 2:
                p.getProcedimento().add("Unha pé e mão");
                break;
            case 3:
                p.getProcedimento().add("Unha pé");
                break;
            case 4:
                p.getProcedimento().add("Unha mão");
                break;
            case 5:
                p.getProcedimento().add("Corte Feminino");
                break;
            case 6:
                p.getProcedimento().add("Corte Masculino");
                break;
            default:
                System.out.println("Inválido!");
        }
    }

    private void fidelidade() {
        if (cont == 10) {
            System.out.println("Você atingiu um total de 10 marcações no cartão fidelidade "
                    + "\n e ganhou um procedimento de cortesia."
                    + "\n escolha que procedimento deseja ganhar:"
                    + "\n 1 p/ escova: R$ 80,00"
                    + "\n 2 p/ Unha pé e mão: R$ 45,00"
                    + "\n 3 p/ Unha pé: R$ 35,00"
                    + "\n 4 p/ Unha mão: R$ 20,00"
                    + "\n 5 p/ Corte Feminino: R$ 50,00"
                    + "\n 6 p/ Corte Masculino: R$ 35,00");
            this.fid = sc.nextInt();
            switch (this.fid) {
                case 1:
                    p.setBrindeFid("escova");
                    break;
                case 2:
                    p.setBrindeFid("Unha pé e mão");
                    break;
                case 3:
                    p.setBrindeFid("Unha pé");
                    break;
                case 4:
                    p.setBrindeFid("Unha mão");
                    break;
                case 5:
                    p.setBrindeFid("Corte Feminino");
                    break;
                case 6:
                    p.setBrindeFid("Corte Masculino");
                    break;
                default:
                    System.out.println("Inválido");
            }
        } else if (cont > 10) {
            int total = cont-10;
            System.out.println("Você atingiu um total de"
                    + "\n "+cont+" marcações no cartão fidelidade "
                    + "\n você já tem mais "+total+" contando para a próxima cortesia"
                    + "\n escolha que procedimento deseja ganhar:"
                    + "\n 1 p/ escova: R$ 80,00"
                    + "\n 2 p/ Unha pé e mão: R$ 45,00"
                    + "\n 3 p/ Unha pé: R$ 35,00"
                    + "\n 4 p/ Unha mão: R$ 20,00"
                    + "\n 5 p/ Corte Feminino: R$ 50,00"
                    + "\n 6 p/ Corte Masculino: R$ 35,00");
            this.fid = sc.nextInt();
            switch (this.fid) {
                case 1:
                    p.setBrindeFid("escova");
                    break;
                case 2:
                    p.setBrindeFid("Unha pé e mão");
                    break;
                case 3:
                    p.setBrindeFid("Unha pé");
                    break;
                case 4:
                    p.setBrindeFid("Unha mão");
                    break;
                case 5:
                    p.setBrindeFid("Corte Feminino");
                    break;
                case 6:
                    p.setBrindeFid("Corte Masculino");
                    break;
                default:
                    System.out.println("Inválido");
            }
        }else{
            System.out.println("Você tem " + cont + " marcações no cartão fidelidade, "
                    + "\n ao atingir 10 marcações ganhará um procedimento de cortesia");
        }
    }

    private double calcPreco() {
        switch (p.getOpProc()) {
            case 1:
                p.setNomeProc("Escova");
                return 80;
            case 2:
                p.setNomeProc("Unha pé e mão");
                return 45;
            case 3:
                p.setNomeProc("Unha pé");
                return 35;
            case 4:
                p.setNomeProc("Unha mão");
                return 20;
            case 5:
                p.setNomeProc("Corte Feminino");
                return 50;
            case 6:
                p.setNomeProc("Corte Masculino");
                return 35;
            default:
                return 0;
        }
    }

    private double calcTotal() {
        double total;
        if (this.cont == 3) {
            total = this.preco * 0.9;
        } else if (cont == 4) {
            total = this.preco * 0.7;
        } else if (cont > 4) {
            total = this.preco * 0.65;
        } else {
            total = this.preco ;
        }
        switch (p.getOpCurso()) {
            case 1:
                p.setNomeOpCurso("Curso auto-maquiagem em casa");
                return total + 150;
            case 2:
                p.setNomeOpCurso("Curso auto-maquiagem no salão");
                return total + 80;
            default:
                p.setNomeOpCurso("Não deseja o curso de auto-maquiagem");
                return total;
        }
    }

    @Override
    public String toString() {
        this.calcTotal();
        this.fidelidade();
        return "Cliente:" + c.toString()
                + "\n Procedimentos:" + this.al
                + "\n Opção curso: " + p.getNomeOpCurso()
                + "\n Preço:" + this.calcTotal();
    }
}
