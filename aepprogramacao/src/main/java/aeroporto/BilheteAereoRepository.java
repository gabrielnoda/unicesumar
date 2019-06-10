package aeroporto;

import java.util.List;

public interface BilheteAereoRepository {
	
	void incluir(BilheteAereo B);
	
	void excluir(Integer idBilhete);
	
	void atualizar(BilheteAereo B);
	
	List<BilheteAereo> obterTodos();
}
