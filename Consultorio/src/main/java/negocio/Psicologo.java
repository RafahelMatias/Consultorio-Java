/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author rafah
 */
public class Psicologo {
    private int idPsicologo;
    private String nome;
    private String cpf;
    private String crp;
    private String telefone;
    private String foto;
    private String login;
    private String senha;

    public Psicologo(int idPsicologo, String nome, String cpf, String crp, String telefone, String foto, String login, String senha) {
        this.idPsicologo = idPsicologo;
        this.nome = nome;
        this.cpf = cpf;
        this.crp = crp;
        this.telefone = telefone;
        this.foto = foto;
        this.login = login;
        this.senha = senha;
    }

    public Psicologo() {
        
    }

    public int getIdPsicologo() {
        return idPsicologo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCrp() {
        return crp;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getFoto() {
        return foto;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setIdPsicologo(int idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
