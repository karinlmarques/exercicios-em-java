/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.n2;

/**
 *
 * @author Juliano
 */
public class salario {

    recebeValor rv = new recebeValor();

    private double salBruto() {
//ver comparação para definir valor salário bruto;
        if ("gerente"==rv.getFunc()) {
            rv.setSalBruto(rv.getSB() + (rv.getTV() * 0.15));
        } else {
            rv.setSalBruto(rv.getSB());
        }
        return rv.getSalBruto();
    }

    private double proventos() {

        if (rv.getOpAC() == 1) {
            rv.setOpcaoAC("SIM");
            rv.setAC(200.00);
            rv.setTotalProv(rv.getSB() * 0.2 + rv.getAC());
        } else {
            rv.setOpcaoAC("NÃO");
            rv.setAC(0);
            rv.setTotalProv(rv.getSB() * 0.2 + rv.getAC());
        }
        return rv.getTotalProv();
    }

    private double totalProventos() {
        rv.setAReceber(this.proventos()+this.salBruto());
        return rv.getAReceber();
    }

    private double descontoINSS() {
        rv.setDescINSS(rv.getSB() * 0.11);
        return rv.getDescINSS();
    }

    private double descontoVA() {
        if (rv.getOpVA() == 1) {
            rv.setOpcaoVA("SIM");
            rv.setDescVA(3.00);
        } else {
            rv.setOpcaoVA("NÃO");
            rv.setDescVA(0);
        }
        return rv.getDescVA();
    }

    private double descontoVT() {
        if (rv.getOpVT() == 1) {
            rv.setOpcaoVT("SIM");
            rv.setDescVT(rv.getSB() * 0.06);
        } else {
            rv.setOpcaoVT("NÃO");
            rv.setDescVT(0);
        }
        return rv.getDescVT();
    }

    private double totalDescontos() {
        rv.setTotalDesc(this.descontoINSS()+this.descontoVA()+this.descontoVT()); 
        return rv.getTotalDesc();
    }

    public String toString() {
        double total = this.totalProventos() - this.totalDescontos();
        return "Função: " + rv.getFunc() + ""
                + "\n Valor de Vendas: " + rv.getTV()
                + "\n Nome: " + rv.getNome()
                + "\n Salário Bruto: " + rv.getSB()
                + "\n Vale transporte: " + rv.getOpcaoVT()
                + "\n Vale Refeição: " + rv.getOpcaoVA()
                + "\n Total de Proventos: R$ " + this.totalProventos()
                + "\n Total de Descontos: R$ " + this.totalDescontos()
                + "\n Salário Liquido: R$ " + total;

    }
}
