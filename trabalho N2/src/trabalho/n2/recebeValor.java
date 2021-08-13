/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.n2;

import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class recebeValor {

    private double SB, TV, descINSS, descVT, descVA, aReceber, totalProv,AC,salBruto, totalDesc, SL, TP, TD;
    private String func, nome, opcaoVT, opcaoVA, opcaoAC;
    private int opVT, opVA, opAC;

    Scanner sc = new Scanner(System.in);

    public String getFunc() {
        return this.func;
    }

    public double getTV() {
        return this.TV;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSB() {
        return this.SB;
    }

    public int getOpVT() {
        return this.opVT;
    }

    public int getOpVA() {
        return this.opVA;
    }

    public int getOpAC() {
        return this.opAC;
    }

    public void setOpcaoVT(String opcaoVT) {
        this.opcaoVT = opcaoVT;
    }

    public String getOpcaoVT() {
        return this.opcaoVT;
    }

    public void setOpcaoVA(String opcaoVA) {
        this.opcaoVA = opcaoVA;
    }

    public String getOpcaoVA() {
        return this.opcaoVA;
    }

    public void setOpcaoAC(String opcaoAC) {
        this.opcaoAC = opcaoAC;
    }

    public String getOpcaoAC() {
        return this.opcaoAC;
    }

    public void setDescINSS(double descINSS) {
        this.descINSS = descINSS;
    }

    public double getDescINSS() {
        return this.descINSS;
    }

    public void setSL(double SL) {
        this.SL = SL;
    }

    public double getSL() {
        return this.SL;
    }

    public void setTP(double TP) {
        this.TP = TP;
    }

    public double getTP() {
        return this.TP;
    }

    public void setTD(double TD) {
        this.TD = TD;
    }

    public double getTD() {
        return this.TD;
    }
    public void setSalBruto(double salBruto) {
        this.salBruto = salBruto;
    }

    public double getSalBruto() {
        return this.salBruto;
    }
   public void setAC(double AC) {
        this.AC= AC;
    }

    public double getAC() {
        return this.AC;
    }  
     public void setTotalProv(double totalProv) {
        this.totalProv = totalProv;
    }

    public double getTotalProv() {
        return this.totalProv;
    }
     public void setAReceber(double aReceber) {
        this.aReceber = aReceber;
    }

    public double getAReceber() {
        return this.aReceber;
    }
     public void setDescVA(double descVA) {
        this.descVA = descVA;
    }

    public double getDescVA() {
        return this.descVA;
    }
     public void setDescVT(double descVT) {
        this.descVT = descVT;
    }

    public double getDescVT() {
        return this.descVT;
    }
     public void setTotalDesc(double totalDesc) {
        this.totalDesc = totalDesc;
    }

    public double getTotalDesc() {
        return this.totalDesc;
    }

    public recebeValor() {
        System.out.println("tipo de função:");
        sc.nextLine();
        this.func = sc.nextLine();
        System.out.println("valor total de vendas do mês");
        this.TV = sc.nextDouble();
        System.out.println("Nome");
        sc.nextLine();
        this.nome = sc.nextLine();
        System.out.println("Salário Bruto");
        this.SB = sc.nextDouble();
        System.out.println("utiliza VT? "
                + "digite 1 para sim e 2 para não");
        this.opVT = sc.nextInt();
        System.out.println("utiliza VA? "
                + "digite 1 para sim e 2 para não");
        this.opVA = sc.nextInt();
        System.out.println("Tem direito a auxilio creche? "
                + "digite 1 para sim e 2 para não");
        this.opAC = sc.nextInt();
    }
}
