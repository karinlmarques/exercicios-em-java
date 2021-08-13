
package vendapizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Processos {

    Cliente c = new Cliente();
    Pizzaria p = new Pizzaria();
    Scanner sc = new Scanner(System.in);
    private double preco = 0;
    private ArrayList al = new ArrayList();

    public Processos() {
        int pizza = 0;
        int s = 0;
        int cont = 0;
        System.out.println("Digite Nome:");
        c.setNome(sc.nextLine());
        System.out.println("Digite Endereço:");
        c.setEnd(sc.nextLine());
        while (pizza != -1) {
            p.getSabores().clear();
            System.out.println("Digite tamanho:"
                    + "\n 1-Pequeno"
                    + "\n 2-Medio"
                    + "\n 3-Grande");
            p.setOpTam(sc.nextInt());
            this.preco += this.calcPreco();
            while (s != -1 && cont < 3) {
                System.out.println("Digite Sabor:"
                        + "\n 1 - 4 queijos"
                        + "\n 2 - Calabresa"
                        + "\n 3 - Coração"
                        + "\n 4 - Filé"
                        + "\n 5 - Morango com chocolate"
                        + "\n 6 - Prestígio"
                        + "\n 7 - Brigadeiro"
                        + "\n 8 - Banana com canela");
                p.setOpSabor(sc.nextInt());
                this.escSabor();
                System.out.println("Digite -1 para sair de sabores:");
                s = sc.nextInt();
                cont++;

            }
            System.out.println("Digite -1 para encerrar pedido:");
            pizza = sc.nextInt();
            if (pizza != -1) {
                s = 0;
                cont = 0;
            }
            al.add(p.toString());

        }

    }

    private void escSabor() {

        switch (p.getOpSabor()) {
            case 1:
                p.getSabores().add("4 queijos");
                break;
            case 2:
                p.getSabores().add("Calabresa");
                break;
            case 3:
                p.getSabores().add("Coração");
                break;
            case 4:
                p.getSabores().add("Filé");
                break;
            case 5:
                p.getSabores().add("Morango com chocolate");
                break;
            case 6:
                p.getSabores().add("Prestígio");
                break;
            case 7:
                p.getSabores().add("Brigadeiro");
                break;
            case 8:
                p.getSabores().add("Banana com canela");
                break;
            default:
                System.out.println("Inválido!");
        }

    }

    private double calcPreco() {
        switch (p.getOpTam()) {
            case 1:
                p.setNomeTamanho("Pequeno");
                return 20;
            case 2:
                p.setNomeTamanho("Medio");
                return 25;
            case 3:
                p.setNomeTamanho("Grande");
                return 35;
            default:
                return 0;
        }

    }

    public String toString() {
        return "Cliente:" + c.toString()
                + "\n Pedidos:" + this.al
                + "\n Preço:" + this.preco;

    }
}
