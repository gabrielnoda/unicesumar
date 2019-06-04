package aeroporto;

import java.util.Date;

public class BilheteAereo {
	private Integer voo;
	private String origem;
	private String destino;
	private String data;
	

	public BilheteAereo(Integer voo, String origem, String destino, String data) {
		this.voo = voo;
		this.origem = origem;
		this.destino = destino;
		this.data = data;
	}

	public Integer getVoo() {
		return voo;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public String getData() {
		return data;
	}

}
