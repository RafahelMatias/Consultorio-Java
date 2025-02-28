/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Calendar;

/**
 *
 * @author rafah
 */
public class Sessao {
    private int idSessao;
    private Calendar data;
    private String queixasPaciente;
    private String planoTratamento;
    private String diagnosticoFinal;
    private String resumoSessao;
    private int evolucao;
    private boolean pago;
    private int idAnamnese;

    public Sessao(int idSessao, Calendar data, String queixasPaciente, String planoTratamento, String diagnosticoFinal, String resumoSessao, int evolucao, boolean pago, int idAnamnese) {
        this.idSessao = idSessao;
        this.data = data;
        this.queixasPaciente = queixasPaciente;
        this.planoTratamento = planoTratamento;
        this.diagnosticoFinal = diagnosticoFinal;
        this.resumoSessao = resumoSessao;
        this.evolucao = evolucao;
        this.pago = pago;
        this.idAnamnese = idAnamnese;
    }
    
    public Sessao(){
    
    }

    public int getIdSessao() {
        return idSessao;
    }

    public Calendar getData() {
        return data;
    }

    public String getQueixasPaciente() {
        return queixasPaciente;
    }

    public String getPlanoTratamento() {
        return planoTratamento;
    }

    public String getDiagnosticoFinal() {
        return diagnosticoFinal;
    }

    public String getResumoSessao() {
        return resumoSessao;
    }

    public int getEvolucao() {
        return evolucao;
    }

    public boolean isPago() {
        return pago;
    }

    public int getIdAnamnese() {
        return idAnamnese;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setQueixasPaciente(String queixasPaciente) {
        this.queixasPaciente = queixasPaciente;
    }

    public void setPlanoTratamento(String planoTratamento) {
        this.planoTratamento = planoTratamento;
    }

    public void setDiagnosticoFinal(String diagnosticoFinal) {
        this.diagnosticoFinal = diagnosticoFinal;
    }

    public void setResumoSessao(String resumoSessao) {
        this.resumoSessao = resumoSessao;
    }

    public void setEvolucao(int evolucao) {
        this.evolucao = evolucao;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setIdAnamnese(int idAnamnese) {
        this.idAnamnese = idAnamnese;
    }
    
    
    
}
