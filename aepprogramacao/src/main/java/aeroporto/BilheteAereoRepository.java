package aeroporto;

import java.util.List;

public interface BilheteAereoRepository {
	void incluir();
	void excluir();
	void atualizar();
	List<BilheteAereo> obterTodos();
}
