
package clinica;

import java.util.Scanner;

public class Processos {

    Scanner sc = new Scanner(System.in);
    Consulta c = new Consulta();
    private String plano;

    private void Dados() {
        System.out.println("Digite nome:");
        c.setNome(sc.nextLine());
        System.out.println("Digite Data Nascimento:");
        c.setDtNa(sc.nextLine());
        System.out.println("Digite Hora da Consulta:");
        c.setHora(sc.nextLine());
        System.out.println("Plano de Saúde:"
                + "\n 1- SIM "
                + "\n 2- NÃO");
        c.setPlano(sc.nextInt());
    }

    private double Valor() {
        if (c.getPlano() == 1) {
            this.plano = "SIM";
            return 0;
        } else {
            this.plano = "NÃO";
            return 150;
        }
    }

    public String toString() {
        this.Dados();
        this.Valor();
        return "Nome:" + c.getNome()
                + "\nData Nascimento:" + c.getDtNa()
                + "\nHora Consulta:" + c.getHora()
                + "\nPlano Médico:" + this.plano
                + "\nValor:" + this.Valor();
    }
}
