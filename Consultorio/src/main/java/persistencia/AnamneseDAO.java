/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import negocio.Anamnese;
import negocio.Paciente;

/**
 *
 * @author rafah
 */
public class AnamneseDAO implements IAnamneseDAO {
    
    private Connection connection;

    public AnamneseDAO() {
        this.connection = new ConFactory().getConnection();
    }

    

    @Override
    public void adiciona(Anamnese anamnese) {
        // Criamos a cadeia SQL para inserção de dados na tabela anamnese
        String sql = "insert into anamnese " +
            "(queixas, sintomas, tratamentos_anteriores, medicamentos, infancia, rotina, vicios, hobbies, trabalho, " +
            "historico_familiar, comportamento, linguagem, humor, hipotese_diagnostica, observacoes, numero_sessoes, " +
            "valor_sessao, periodicidade, idPaciente, idPsicologo)" +
            " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            // Preparar o comando para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // Setando os atributos do objeto na cadeia SQL
            stmt.setString(1, anamnese.getQueixas());
            stmt.setString(2, anamnese.getSintomas());
            stmt.setString(3, anamnese.getTratamentosAnteriores());
            stmt.setString(4, anamnese.getMedicamentos());
            stmt.setString(5, anamnese.getInfancia());
            stmt.setString(6, anamnese.getRotina());
            stmt.setString(7, anamnese.getVicios());
            stmt.setString(8, anamnese.getHobbies());
            stmt.setString(9, anamnese.getTrabalho());
            stmt.setString(10, anamnese.getHistoricoFamiliar());
            stmt.setString(11, anamnese.getComportamento());
            stmt.setString(12, anamnese.getLinguagem());
            stmt.setString(13, anamnese.getHumor());
            stmt.setString(14, anamnese.getHipoteseDiagnostica());
            stmt.setString(15, anamnese.getObservacoes());
            stmt.setInt(16, anamnese.getNumeroSessoes());
            stmt.setFloat(17, anamnese.getValorSessao());
            stmt.setString(18, anamnese.getPeriodicidade());
            stmt.setInt(19, anamnese.getIdPaciente());
            stmt.setInt(20, anamnese.getIdPsicologo());

            // Executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void altera(Anamnese anamnese) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Anamnese> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Anamnese getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
