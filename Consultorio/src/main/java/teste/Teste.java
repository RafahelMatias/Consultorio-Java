package teste;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Teste {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/dbconsultorio","root","Rafa2002");
        System.out.println("Conectado!");
        conexao.close();
    }
    
}
