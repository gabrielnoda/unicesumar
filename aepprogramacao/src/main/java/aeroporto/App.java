package aeroporto;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
	public static void main(String[] args) {
			BilheteAereo bilhete = new BilheteAereo(1, "São Paulo", "Maringá", "23/09/1997");
			BilheteAereoRepository repo = null;
			try {
				Connection conexão = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/NODA",
						"postgres",
						"unicesumar");
			} catch (Exception e) {
				// TODO: handle exception
			}
			repo.incluir();
	}
}
