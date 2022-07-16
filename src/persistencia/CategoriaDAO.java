package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import negocio.Categorias;

public class CategoriaDAO {
	
	public static void inserir(Categorias categoria) {
		try {
			Conexao c = new Conexao();
			Connection connection = c.getConexao();
			String comando = "insert into categorias (pessoa, carro, cidadeEstadoPais, fruta, objeto, animal, participante, letra_sorteada) values (?,?,?,?,?,?,?,?)";
			
			PreparedStatement result = connection.prepareStatement(comando);
			result.setString(1, categoria.getPessoa());
			result.setString(2, categoria.getCarro());
			result.setString(3, categoria.getCidadeEstadoPais());
			result.setString(4, categoria.getFruta());
			result.setString(5, categoria.getObjeto());
			result.setString(6, categoria.getAnimal());
			result.setInt(7, categoria.getParticipante().getId());
			result.setInt(8, categoria.getLetra().getId());
			
			result.executeUpdate();
	}catch (SQLException e) {
		throw new RuntimeException(e);
	}

}
}
