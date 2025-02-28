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
import negocio.Paciente;
import negocio.Sessao;

/**
 *
 * @author rafah
 */
public class SessaoDAO implements ISessaoDAO {
    
    private Connection connection;

    public SessaoDAO() {
        this.connection = new ConFactory().getConnection();
    }
    

    @Override
    public void adiciona(Sessao sessao) {
        // Criamos a cadeia SQL para inserção de dados na tabela sessao
        String sql = "insert into sessao " +
            "(data, queixas_paciente, plano_tratamento, diagnostico_final, resumo_sessao, evolucao, pago, idAnamnese)" +
            " values (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            // Preparar o comando para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // Setando os atributos do objeto na cadeia SQL
            stmt.setTimestamp(1, new java.sql.Timestamp(sessao.getData().getTimeInMillis())); // Converte java.util.Date para java.sql.Timestamp
            stmt.setString(2, sessao.getQueixasPaciente());
            stmt.setString(3, sessao.getPlanoTratamento());
            stmt.setString(4, sessao.getDiagnosticoFinal());
            stmt.setString(5, sessao.getResumoSessao());
            stmt.setInt(6, sessao.getEvolucao());
            stmt.setBoolean(7, sessao.isPago()); // boolean é convertido automaticamente para bit(1) no SQL
            stmt.setInt(8, sessao.getIdAnamnese());

            // Executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void altera(Sessao sessao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Sessao> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Sessao getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
