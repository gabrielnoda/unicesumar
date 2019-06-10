package aeroporto;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;

public class App {
	public static void main(String[] args) {
			BilheteAereo B001 = new BilheteAereo(1, 1, "São Paulo", "Maringá", "23/09/2019");
			try {
				Connection conexão = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/NODA",
						"postgres",
						"unicesumar");
			} catch (Exception e) {
				// TODO: handle exception
			}
			BilheteAereoRepository repo = new BilheteRepositoryMemory();
			repo.incluir(B001);
			
			B001 = new BilheteAereo(1, 02, "São Paulo", "Londrina", "23/09/2019");
					repo.atualizar(B001);
					repo.excluir(1);
			List<BilheteAereo> bilhetes = repo.obterTodos();
	}
}
