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
public class Administracao extends Aluno {

    private final ArrayList valor = new ArrayList();
    private ArrayList<String> disciplina = new ArrayList();
    private String tipoPag;
    private int nroVzs;
    private double tga;
    private double contabilidade;
    private double matFin;
    private double intAdm;
    private double soma = 0;
    double totalParc;

    public Administracao() {
        this.tga = 230;
        this.contabilidade = 230;
        this.matFin = 180;
        this.intAdm = 60;
    }

    public ArrayList<String> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<String> disciplina) {
        this.disciplina = disciplina;
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

    public double getTga() {
        return tga;
    }

    public void setTga(double tga) {
        this.tga = tga;
    }

    public double getContabilidade() {
        return contabilidade;
    }

    public void setContabilidade(double contabilidade) {
        this.contabilidade = contabilidade;
    }

    public double getMatFin() {
        return matFin;
    }

    public void setMatFin(double matFin) {
        this.matFin = matFin;
    }

    public double getIntAdm() {
        return intAdm;
    }

    public void setIntAdm(double intAdm) {
        this.intAdm = intAdm;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    private ArrayList verificaDiscAdm() {
        this.valor.clear();
        for (int i = 0; i < this.disciplina.size(); i++) {
            if (this.disciplina.get(i).equals("TGA")) {
                this.valor.add(this.tga);
            }
            if (this.disciplina.get(i).equals("Contabilidade")) {
                this.valor.add(this.contabilidade);
            }
            if (this.disciplina.get(i).equals("Mat. Financeira")) {
                this.valor.add(this.matFin);
            }
            if (this.disciplina.get(i).equals("Introdução ADM")) {
                this.valor.add(this.intAdm);
            }
        }
        return this.valor;
    }

    private double total() {
        this.verificaDiscAdm();
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
            if (this.disciplina.size() >= 3) {
                parc = this.totalParc * 0.6;
            } else if (this.disciplina.size() < 3) {
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
