/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.de.beleza;

import java.util.ArrayList;

/**
 *
 * @author Juliano
 */
public class procedimentos {
    private ArrayList<String> procedimento = new ArrayList<>();
    private int opProc;
    private int opCurso;
    private String NomeProc;
    private String NomeOpCurso;
    private String brindeFid;

    public String getBrindeFid() {
        return brindeFid;
    }

    public void setBrindeFid(String brindeFid) {
        this.brindeFid = brindeFid;
    }

    public String getNomeOpCurso() {
        return NomeOpCurso;
    }

    public void setNomeOpCurso(String NomeOpCurso) {
        this.NomeOpCurso = NomeOpCurso;
    }

    public String getNomeProc() {
        return NomeProc;
    }

    public void setNomeProc(String NomeProc) {
        this.NomeProc = NomeProc;
    }

    public ArrayList<String> getProcedimento() {
        return procedimento;
    }

    public int getOpProc() {
        return opProc;
    }

    public void setProcedimento(ArrayList<String> procedimento) {
        this.procedimento = procedimento;
    }

    public void setOpProc(int opProc) {
        this.opProc = opProc;
    }

    public void setOpCurso(int opCurso) {
        this.opCurso = opCurso;
    }

    public int getOpCurso() {
        return opCurso;
    }

    @Override
    public String toString() {
        return "procedimento =" + this.procedimento;
    }
    
}
