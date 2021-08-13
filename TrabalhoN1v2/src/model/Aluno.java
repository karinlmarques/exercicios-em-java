package model;

import java.util.Random;

public class Aluno {

    private String matricula;
    Random gerador = new Random();
    private int senha;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;

    }

    public String geraMatricula() {
        int cod = gerador.nextInt(1000) + 100;
        return "2018" + cod;
    }

    public void geraSenha() {
        this.senha = gerador.nextInt(8999) + 1000;

    }

    @Override
    public String toString() {
        return " Nro de matricula: " + getMatricula()
                + "\n Senha: " + this.senha;
    }
}
