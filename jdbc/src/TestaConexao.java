import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		
		System.out.println("Conexao aberta");
		connection.close();
		System.out.println("Conexao fechada");
	}

}
