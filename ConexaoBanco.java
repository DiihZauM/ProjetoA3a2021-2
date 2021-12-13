import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private String usuario = "root";
    private String senha = "Dizao@123";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_Cliente";
    public Connection getObtemConexao()throws SQLException{
        try{
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                        usuario,
                        senha
                        );
                 return c;
            }
        catch (Exception e){
          e.printStackTrace();
          return null;
        }
    }
}