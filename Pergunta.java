package TrabalhoLP;

public class Pergunta {
	// 1. ATRIBUTOS
		private String pergunta;

		// 2. CONSTRUTORES

		public Pergunta() {
			pergunta = "";
		}

		public Pergunta(String pergunta) {
			super();
			this.pergunta = pergunta;
		}

		// 3. ACESSORES

		public String getPergunta() {
			return pergunta;
		}

		public void setPergunta(String pergunta) {
			this.pergunta = pergunta;
		}
		
		// 4. toString
		
		@Override
		public String toString() {
			return "[" + pergunta + "]";
		}

	}
