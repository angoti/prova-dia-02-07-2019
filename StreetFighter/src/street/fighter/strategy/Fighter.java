package street.fighter.strategy;

public class Fighter {
	private Pulo pular;
	
	public Fighter(Pulo pular) {
		super();
		this.pular = pular;
	}

	void chutar() {
	}

	void socar() {
	}

	void rolar() {
	}
	
	void pular() {
		pular.pular();
	}

}
