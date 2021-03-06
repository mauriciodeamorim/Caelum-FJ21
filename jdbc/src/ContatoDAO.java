import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;


public class ContatoDAO {
	private Connection connection;
	
	/*Forma de conexa incial, pegando uma conexa atraves de 
	 * Factory no construtor
	public ContatoDAO(){
		this.connection = new ConnectionFactory().getConnection();
		}
	*/
	
	//Iniciando a inversao de controle/injecao de dependencia
	public ContatoDAO(Connection connection){
		this.connection = connection;
		}
	
	public void Adiciona(Contato contato){
		String sql = "insert into contatos (nome, email, dataNascimento) values (?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setDate(3, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Connection getConnection() {
		return connection;
	}
}
