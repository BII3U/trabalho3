package persistencia;
import java.sql.*;

public class Conexao {
    private String host;
    private String usuario;
    private String senha;
    private String banco;

    // construtor
    public Conexao() {
        this.host = "186.202.152.99";
        this.banco = "da_java";
        this.usuario = "da_java";
        this.senha = "DB_test22!";
    }

    public Connection getConexao() {
        String url="jdbc:mysql://" + this.host + "/" + this.banco+"?verifyServerCertificate=false&useSSL=false";

        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Conexão com MYSQL não realizada");
            ex.printStackTrace();
        }
        return null;
    }

}

