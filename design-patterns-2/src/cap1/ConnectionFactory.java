package cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by felipe on 28/05/16.
 */
public class ConnectionFactory {

    public Connection getConnection(String banco) {

        String bank = System.getenv(banco);
        try {
            Connection conexao =
                    DriverManager.getConnection("jdbc:"+bank+"//localhost:3306/banco", "usuario", "senha");

            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
