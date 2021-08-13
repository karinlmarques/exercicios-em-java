
package abstrata;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoas {

    Scanner sc = new Scanner(System.in);
    private int escolhe;
    ArrayList al = new ArrayList();
    Funcionario f = new Funcionario();
    Cliente c = new Cliente();
    Gerente g = new Gerente();

    private String escCargo() {
        System.out.println("Escolhe Pessoa:"
                + "\n1 - Cliente "
                + "\n2 - Gerente"
                + "\n3 - Funcionário");
        this.escolhe = sc.nextInt();
        switch (this.escolhe) {
            case 1:
                return this.cadastraCliente();
            case 2:
                return this.cadastraGerente();
            case 3:
                return this.cadastraFuncionario();
            default:
                return "Erro ao cadastrar";
        }
    }

    private void armazenaArray() {
        int s = 0;
        while (s != -1) {
            this.al.add(this.escCargo());

            System.out.println("Digite -1 para sair:");
            s = sc.nextInt();
        }
    }

    private String cadastraFuncionario() {
        this.cadastraPessoa(f);
        System.out.println("Digite o salário");
        f.setSalario(sc.nextFloat());
        return f.imprimeDados();
    }

    private String cadastraCliente() {
        this.cadastraPessoa(c);
        System.out.println("Digite o código do cliente");
        c.setCodigo(sc.nextInt());
        return c.imprimeDados();
    }

    private String cadastraGerente() {
        this.cadastraPessoa(g);
        System.out.println("Digite o salário");
        g.setSalario(sc.nextFloat());
        System.out.println("Digite a Área");
        sc.nextLine();
        g.setArea(sc.nextLine());
        return g.imprimeDados();
    }

    public void cadastraPessoa(Pessoa p) {
        System.out.println("Digite o nome");
        sc.nextLine();
        p.setNome(sc.nextLine());
        System.out.println("Digite a data de nascimento");
        System.out.println("Dia:");
        p.getNascimento().setDia(sc.nextInt());
        System.out.println("Mês:");
        p.getNascimento().setMes(sc.nextInt());
        System.out.println("Ano:");
        p.getNascimento().setAno(sc.nextInt());
    }

    @Override
    public String toString() {
        this.armazenaArray();
        return "------Dados------\n" + this.al;
    }
}
