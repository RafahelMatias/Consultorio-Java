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
import negocio.Psicologo;

/**
 *
 * @author rafah
 */
public class PsicologoDAO implements IPsicologoDAO {
    
    private Connection connection;

    public PsicologoDAO() {
        this.connection = new ConFactory().getConnection();
    }
    

    @Override
    public void adiciona(Psicologo psicologo) {
        // Criamos a cadeia SQL para inserção de dados na tabela psicologo
        String sql = "insert into psicologo " +
            "(nome, cpf, crp, telefone, foto, login, senha)" +
            " values (?, ?, ?, ?, ?, ?, ?)";

        try {
            // Preparar o comando para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // Setando os atributos do objeto na cadeia SQL
            stmt.setString(1, psicologo.getNome());
            stmt.setString(2, psicologo.getCpf());
            stmt.setString(3, psicologo.getCrp());
            stmt.setString(4, psicologo.getTelefone());
            stmt.setString(5, psicologo.getFoto());
            stmt.setString(6, psicologo.getLogin());
            stmt.setString(7, psicologo.getSenha());

            // Executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    

    @Override
    public void altera(Psicologo psicologo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Psicologo> listarTodos() {
        try {
            List<Psicologo> psicologos = new ArrayList<Psicologo>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from psicologo");
            ResultSet rs = stmt.executeQuery();
                
            while (rs.next()) {
                // Criando o objeto Psicologo
                Psicologo psicologo = new Psicologo();
                psicologo.setIdPsicologo(rs.getInt("idPsicologo"));
                psicologo.setNome(rs.getString("nome"));
                psicologo.setCpf(rs.getString("cpf"));
                psicologo.setCrp(rs.getString("crp"));
                psicologo.setTelefone(rs.getString("telefone"));
                psicologo.setLogin(rs.getString("login"));
                psicologo.setSenha(rs.getString("senha"));

                // Adicionando o objeto à lista
                psicologos.add(psicologo);
            }

            rs.close();
            stmt.close();
            return psicologos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Psicologo getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
