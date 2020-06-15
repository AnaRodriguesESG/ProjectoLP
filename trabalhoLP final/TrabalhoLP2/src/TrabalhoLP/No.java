package TrabalhoLP;


public class No {

	// 1. ATRIBUTOS
	
	private Pergunta pergunta;
	@Override
	public String toString() {
		return pergunta.getPergunta();
	}

	private No esq;
	private No dir;
	
	// 2. CONSTRUTORES
	
	public No() {
		pergunta = null;
		esq = null;
		dir = null;
	}
	
	public No(Pergunta pergunta) {
		super();
		this.pergunta = pergunta;
		esq = null;
		dir = null;
	}

	// 3. ACESSORES
	
	public Pergunta getPergunta() {
		return pergunta;
	}
	
	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}
	
}
