/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Informatica extends Aluno {

    private final ArrayList valor = new ArrayList();
    private ArrayList<String> disciplina = new ArrayList();
    private final double logica;
    private final double mat;
    private final double ingles;
    private final double php;
    private final double java;
    private final double bd;
    private double soma;
    private String tipoPag;
    private int nroVzs;
    double totalParc;

    public Informatica() {
        this.logica = 230;
        this.mat = 80;
        this.ingles = 80;
        this.java = 160;
        this.php = 160;
        this.bd = 200;
    }

    public ArrayList<String> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<String> disciplina) {
        this.disciplina = disciplina;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public String getTipoPag() {
        return tipoPag;
    }

    public void setTipoPag(String tipoPag) {
        this.tipoPag = tipoPag;
    }

    public int getNroVzs() {
        return nroVzs;
    }

    public void setNroVzs(int nroVzs) {
        this.nroVzs = nroVzs;
    }

    private ArrayList verificaDiscInfo() {
        this.valor.clear();
        for (int i = 0; i < this.disciplina.size(); i++) {
            if (this.disciplina.get(i).contains("Inglês")) {
                this.valor.add(this.ingles);
            } else if (this.disciplina.get(i).contains("JAVA")) {
                this.valor.add(this.java);
            } else if (this.disciplina.get(i).contains("Lógica")) {
                this.valor.add(this.logica);
            } else if (this.disciplina.get(i).contains("Matemática")) {
                this.valor.add(this.mat);
            } else if (this.disciplina.get(i).contains("PHP")) {
                this.valor.add(this.php);
            } else if (this.disciplina.get(i).contains("Banco de Dados")) {
                this.valor.add(this.bd);
            }
        }
        return this.valor;

    }

    private double total() {
        this.verificaDiscInfo();
        this.soma = 0;
        for (int i = 0; i < this.valor.size(); i++) {
            this.soma = (double) this.valor.get(i) + this.soma;
        }
        return this.soma;

    }

    private double Pagamento() {
        this.totalParc = this.total();
        double parc = 0;
        if (getTipoPag().equals("A vista")) {
            if (this.disciplina.size() >= 5) {
                parc = this.totalParc * 0.6;
            } else if (this.disciplina.size() < 5) {
                parc = this.totalParc * 0.85;
            }
        } else if (getTipoPag().equals("Parcelado")) {
            parc = this.totalParc / this.nroVzs;
        }
        return parc;
    }

    @Override
    public String toString() {
        return "" + super.toString()
                + "\n Disciplinas escolhidas: " + this.disciplina
                + "\n Tipo de pagamento: " + this.tipoPag
                + "\n Nro de vezes: " + this.nroVzs
                + "\n Valor da Parcela: R$ " + this.Pagamento()
                + "\n Total: R$ " + this.totalParc;
    }

}
