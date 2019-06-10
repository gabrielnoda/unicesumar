package aeroporto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BilheteRepositoryMemory implements BilheteAereoRepository {
	private Set<BilheteAereo> bilhetes = new HashSet<>();
	
	@Override
	public void incluir(BilheteAereo b) {
		this.bilhetes.add(b);

	}
	
	@Override
	public void excluir(Integer idBilhete) {
		BilheteAereo id = null;
		for(BilheteAereo b : this.bilhetes) {
			if(b.getIdBilhete() == idBilhete) {
				id = b;
			}
		}
		this.bilhetes.remove(id);

	}
	@Override
	public void atualizar(BilheteAereo b) {
		this.excluir(b.getIdBilhete());
		this.incluir(b);

	}
	@Override
	public List<BilheteAereo> obterTodos() {
		
		return new ArrayList<>(this.bilhetes);
	}

}
