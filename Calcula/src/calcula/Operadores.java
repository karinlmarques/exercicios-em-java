/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

/**
 *
 * @author Professor
 */
public class Operadores {
    private int n2;
    private int n1;

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    protected int Soma(){
        return this.n1+this.n2;
    }
    protected int Sub(){
        return this.n1-this.n2;
    }
    
    protected int Multi(){
        return this.n1*this.n2;
    }
    protected int Div(){
        return this.n1/this.n2;
    }
}
