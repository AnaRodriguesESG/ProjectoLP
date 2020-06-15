package TrabalhoLP;

public class ArvoreBinaria {
	// 1. ATRIBUTOS
	
		public No raiz;
		
		// 2. CONSTRUTORES
		
		public ArvoreBinaria() {
			raiz = null;
		}
		
		// 3. METODOS
		
		public void criarArvoreBinaria1() {
			No no1 = new No(new Pergunta("Dói-lhe a cabeça?"));
			No no2 = new No(new Pergunta("Dói-lhe o braço?"));
			No no3 = new No(new Pergunta("Dói-lhe a perna?"));
			No no4 = new No(new Pergunta("Dói-lhe o peito?"));
			No no5 = new No(new Pergunta("Dói-lhe as costas?"));
			No no6 = new No(new Pergunta("Dói-lhe a barriga?"));
			No no7 = new No(new Pergunta("A dor é dentro ou em volta do olho?"));
			No no8 = new No(new Pergunta("A dor é atrás das maças do rosto ou entre os olhos?"));
			No no9 = new No(new Pergunta("A dor é como uma faixa na cabeça?"));
			No no10 = new No(new Pergunta("Tem nauseas, dificuldades visuais ou dor forte?"));
			No no11= new No(new Pergunta("É provável que voce tenha Cefaleia, pode tomar ibuprofeno ou dipirona monoidratada mas convém contactar um médico\r\n" + 
					""));
			No no12= new No(new Pergunta("Coma refeições mornas,beba mais água,use soro fisiológico para limpar o nariz ou umidifique o ar"));
			No no13= new No(new Pergunta("Para um tratamento eficaz é necessário que  sejam determinadas as possíveis causas para as dores de cabeça. Assim que o médico excluir outras causas ou doenças, poderá dar-se início ao tratamento de dores de cabeça tensionais"));
			No no14= new No(new Pergunta("Não foi possivel determinar o seu problema, consulte um médico"));
			No no15= new No(new Pergunta("Vá para uma divisão com pouca luz e barulho e descanse, pode tomar uma aspirina.Em casos mais fortes consulte um medico"));
			No no16= new No(new Pergunta("Realizou Esforço repetitivo?"));
			No no17= new No(new Pergunta("Tem tendinite?"));
			No no18= new No(new Pergunta("Durante as primeiras 48 horas colocar uma compressa com gelo ou água fria no local da dor. A utilização de uma pomada anti-inflamatória também é recomendada para ajudar nesse processo de recuperação. "));
			No no19= new No(new Pergunta("Tem má circulaçao?"));
			No no20= new No(new Pergunta("Realize alguns exercícios próprios para o alivio das dores que as tendinites provocam"));
			No no21= new No(new Pergunta("A dor nos braços pode acompanhar outros sintomas, como dormência, cãibras, úlceras e, até mesmo, perda de força nas mãos. Nesses casos, é importante procurar imediatamente um médico se nao for o caso realize alongamentos"));
			No no22= new No(new Pergunta("Tem Cãibras?"));
			No no23= new No(new Pergunta("Tem algum tipo de lesão?"));
			No no24= new No(new Pergunta("É na coxa?"));
			No no25= new No(new Pergunta("Deve realizar alongamentos corporais para  não sobrecarregar um músculo. É igualmente válido consumir alimentos ricos em minerais, potássio, magnésio e cálcio.\r\n" + 
					""));
			No no26= new No(new Pergunta("Pode ter rompido as fibras com excesso de exercicio ou outro tipo de lesao como inflamaçoes nos tendoes entre outros se o desconforte for muito forte consulte um medico \r\n" + 
					""));
			No no27= new No(new Pergunta("Reduza as atividades nos casos de sobrecarga articular, aplicação de gelo no local, analgésico e  uso de anti-inflamatórios."));
			No no28= new No(new Pergunta("Tem Doenças do coração?"));
			No no29= new No(new Pergunta("Suspeita de um Infarto?"));
			No no30= new No(new Pergunta("Pode ser dor pulmonar?"));
			No no31= new No(new Pergunta("Anda com ansiedade e stress?"));
			No no32= new No(new Pergunta("Em caso de excesso de transpiração, batimentos cardíacos acelerados, náuseas deve tentar repousar em um local calmo, tomar um chá calmante ou fazer alguma atividade de lazer, como ver um filme, jogar"));
			No no33= new No(new Pergunta("Deve consultar um cardiologista para fazer exames ao coração e identificar se existe alguma alteração que possa estar a causar  a dor.\r\n" + 
					""));
			No no34= new No(new Pergunta("Deve procurar um pronto-socorro para fazer exames ao coração, como eletrocardiograma, enzimas cardíacas e raio X de tórax, para identificar se há infarto e iniciar o tratamento o mais rápido possível.\r\n" + 
					""));
			No no35= new No(new Pergunta("Se sentir  falta de ar, chiado ou tosse frequente consultar um pneumologista para identificar a causa específica da dor e iniciar o tratamento."));
			No no36= new No(new Pergunta("Poderá ser Lesão muscular?"));
			No no37= new No(new Pergunta("Tem Doenças respiratórias?"));
			No no38= new No(new Pergunta("Tem uma dor muito forte no fundo das costas que o impede  de caminhar?"));
			No no39= new No(new Pergunta(" Esta a sentir uma Contratura muscular?"));
			No no40= new No(new Pergunta("Para aliviar a dor nas costas devido à lesão muscular, pode-se colocar uma compressa morna na região durante 15 minutos. É importante evitar fazer muitos esforços para que os sintomas da lesão possam aliviar mais rapidamente."));
			No no41= new No(new Pergunta("Recomenda-se que procure um pneumologista ou clínico geral para que se possa tratar a doença respiratória, principalmente quando há sintomas como falta de ar, tosse, catarro ou febre.\r\n" + 
					""));
			No no42= new No(new Pergunta("Poderá ser pedras nos rins é importante ir à emergência para que sejam feitos exames para identificar a pedra e o seu tamanho deverá tomar  anti-inflamatórios para alívio dos sintomas, ou realização de um pequeno procedimento cirúrgico para remoção do cálculo."));
			No no43= new No(new Pergunta("Pode acontecer devido ao cansaço, excesso de atividade física, preocupação ou postura errada ao sentar realize Exercícios de alongamento  para esticar os músculos e se sentir mais relaxado. Ficar numa posição confortável e rodar a cabeça lentamente para todos os lados."));
			No no44= new No(new Pergunta("A dor é Acima do abdómen, atrás do externo?"));
			No no45= new No(new Pergunta("A dor é no centro do abdomen?"));
			No no46= new No(new Pergunta("A dor é no abdómen inferior, em redor do útero(mulheres)?"));
			No no47= new No(new Pergunta("Dor ao redor do umbigo?"));
			No no48= new No(new Pergunta("Pode ser causada por refluxo gástrico esta dor pode ser aliviada pela toma de um antiácido. Consulte o seu profissional de saúde em caso de ser frequente."));
			No no49= new No(new Pergunta("Pode ser uma reação aos alimentos, ao stress ou a outras influências externas. Buscopan proporciona alívio localizado e eficaz para este tipo de dor se a dor persistir consulte o medico."));
			No no50= new No(new Pergunta("As mulheres sofrem regularmente de dor antes ou durante a menstruação e/ou durante a ovulação se a dor piorar, deve contactar o seu profissional de saúde."));
			No no51= new No(new Pergunta("Poderá ter uma apendicite dever dirigir-se ao medico para realizar analises se a dor não desaparecer em pouco tempo"));
			no1.setEsq(no2);
			no1.setDir(no7);
			no7.setEsq(no8);
			no7.setDir(no11);
			no8.setEsq(no9);
			no8.setDir(no12);
			no9.setEsq(no10);
			no9.setDir(no13);
			no10.setEsq(no14);
			no10.setDir(no15);
			no2.setEsq(no3);
			no2.setDir(no16);
			no16.setEsq(no17);
			no16.setDir(no18);
			no17.setEsq(no19);
			no17.setDir(no20);
			no19.setEsq(no14);
			no19.setDir(no21);
			no3.setEsq(no4);
			no3.setDir(no22);
			no22.setEsq(no23);
			no22.setDir(no25);
			no23.setEsq(no24);
			no23.setDir(no26);
			no24.setEsq(no14);
			no24.setDir(no27);
			no4.setEsq(no5);
			no4.setDir(no28);
			no28.setEsq(no29);
			no28.setDir(no33);
			no29.setEsq(no30);
			no29.setDir(no34);
			no30.setEsq(no31);
			no30.setDir(no35);
			no31.setEsq(no14);
			no31.setDir(no32);
			no5.setEsq(no6);
			no5.setDir(no36);
			no36.setEsq(no37);
			no36.setDir(no40);
			no37.setEsq(no38);
			no37.setDir(no41);
			no38.setEsq(no39);
			no38.setDir(no42);
			no39.setEsq(no14);
			no39.setDir(no43);
			no6.setEsq(no14);
			no6.setDir(no44);
			no44.setEsq(no45);
			no44.setDir(no48);
			no45.setEsq(no46);
			no45.setDir(no49);
			no46.setEsq(no47);
			no46.setDir(no50);
			no47.setEsq(no14);
			no47.setDir(no51);
			this.raiz = no1; 
		}

		
		//contador
		public int contar() {
			return contar(raiz);
		}

		public int contar(No raiz) {
			if (raiz != null) {
				return 1 + contar(raiz.getEsq()) + contar(raiz.getDir());
			} else {
				return 0;
			}
		}
		
		//Altura da arvore
		public int altura() {
			return altura(raiz);
		}

		private int altura(No raiz) {
			if (raiz == null)
				return 0;
			else
				return Math.max(altura(raiz.getEsq()), altura(raiz.getDir())) + 1;
		}
	
		//Listagem por niveis
		public void listarPorNivel(int nivel) {
			int h = altura();
			for (int i = 0; i <= h; i++) {
				listarPorNivel(raiz, i);
				System.out.println();
			}
		}

		private void listarPorNivel(No raiz, int nivel) {
			if (raiz == null) {
				return;
			} else {
				if (nivel == 0) {
					System.out.print(raiz.getPergunta());
				} else if (nivel > 0) {
					listarPorNivel(raiz.getEsq(), nivel - 1);
					listarPorNivel(raiz.getDir(), nivel - 1);
				}

			}
		}
	

	}
