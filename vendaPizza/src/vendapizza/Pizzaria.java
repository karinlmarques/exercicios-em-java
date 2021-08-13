package vendapizza;

import java.util.ArrayList;

public class Pizzaria {

    private ArrayList<String> sabores = new ArrayList<String>();
    private int opTam;
    private int opSabor;
    private String nomeTamanho;

    public ArrayList<String> getSabores() {
        return sabores;
    }

    public int getOpTam() {
        return opTam;
    }

    public void setOpTam(int opTam) {
        this.opTam = opTam;
    }

    public int getOpSabor() {
        return opSabor;
    }

    public void setOpSabor(int opSabor) {
        this.opSabor = opSabor;
    }

    public String getNomeTamanho() {
        return nomeTamanho;
    }

    public void setNomeTamanho(String nomeTamanho) {
        this.nomeTamanho = nomeTamanho;
    }

    @Override
    public String toString() {
        return " \n Tamanho=" + nomeTamanho
                + "\n sabores=" + sabores;
    }
}
