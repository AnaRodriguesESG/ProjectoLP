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
			No no1 = new No(new Pergunta("D�i-lhe a cabe�a?"));
			No no2 = new No(new Pergunta("D�i-lhe o bra�o?"));
			No no3 = new No(new Pergunta("D�i-lhe a perna?"));
			No no4 = new No(new Pergunta("D�i-lhe o peito?"));
			No no5 = new No(new Pergunta("D�i-lhe as costas?"));
			No no6 = new No(new Pergunta("D�i-lhe a barriga?"));
			No no7 = new No(new Pergunta("A dor � dentro ou em volta do olho?"));
			No no8 = new No(new Pergunta("A dor � atr�s das ma�as do rosto ou entre os olhos?"));
			No no9 = new No(new Pergunta("A dor � como uma faixa na cabe�a?"));
			No no10 = new No(new Pergunta("Tem nauseas, dificuldades visuais ou dor forte?"));
			No no11= new No(new Pergunta("� prov�vel que voce tenha Cefaleia, pode tomar ibuprofeno ou dipirona monoidratada mas conv�m contactar um m�dico\r\n" + 
					""));
			No no12= new No(new Pergunta("Coma refei��es mornas,beba mais �gua,use soro fisiol�gico para limpar o nariz ou umidifique o ar"));
			No no13= new No(new Pergunta("Para um tratamento eficaz � necess�rio que  sejam determinadas as poss�veis causas para as dores de cabe�a. Assim que o m�dico excluir outras causas ou doen�as, poder� dar-se in�cio ao tratamento de dores de cabe�a tensionais"));
			No no14= new No(new Pergunta("N�o foi possivel determinar o seu problema, consulte um m�dico"));
			No no15= new No(new Pergunta("V� para uma divis�o com pouca luz e barulho e descanse, pode tomar uma aspirina.Em casos mais fortes consulte um medico"));
			No no16= new No(new Pergunta("Realizou Esfor�o repetitivo?"));
			No no17= new No(new Pergunta("Tem tendinite?"));
			No no18= new No(new Pergunta("Durante as primeiras 48 horas colocar uma compressa com gelo ou �gua fria no local da dor. A utiliza��o de uma pomada anti-inflamat�ria tamb�m � recomendada para ajudar nesse processo de recupera��o. "));
			No no19= new No(new Pergunta("Tem m� circula�ao?"));
			No no20= new No(new Pergunta("Realize alguns exerc�cios pr�prios para o alivio das dores que as tendinites provocam"));
			No no21= new No(new Pergunta("A dor nos bra�os pode acompanhar outros sintomas, como dorm�ncia, c�ibras, �lceras e, at� mesmo, perda de for�a nas m�os. Nesses casos, � importante procurar imediatamente um m�dico se nao for o caso realize alongamentos"));
			No no22= new No(new Pergunta("Tem C�ibras?"));
			No no23= new No(new Pergunta("Tem algum tipo de les�o?"));
			No no24= new No(new Pergunta("� na coxa?"));
			No no25= new No(new Pergunta("Deve realizar alongamentos corporais para  n�o sobrecarregar um m�sculo. � igualmente v�lido consumir alimentos ricos em minerais, pot�ssio, magn�sio e c�lcio.\r\n" + 
					""));
			No no26= new No(new Pergunta("Pode ter rompido as fibras com excesso de exercicio ou outro tipo de lesao como inflama�oes nos tendoes entre outros se o desconforte for muito forte consulte um medico \r\n" + 
					""));
			No no27= new No(new Pergunta("Reduza as atividades nos casos de sobrecarga articular, aplica��o de gelo no local, analg�sico e  uso de anti-inflamat�rios."));
			No no28= new No(new Pergunta("Tem Doen�as do cora��o?"));
			No no29= new No(new Pergunta("Suspeita de um Infarto?"));
			No no30= new No(new Pergunta("Pode ser dor pulmonar?"));
			No no31= new No(new Pergunta("Anda com ansiedade e stress?"));
			No no32= new No(new Pergunta("Em caso de excesso de transpira��o, batimentos card�acos acelerados, n�useas deve tentar repousar em um local calmo, tomar um ch� calmante ou fazer alguma atividade de lazer, como ver um filme, jogar"));
			No no33= new No(new Pergunta("Deve consultar um cardiologista para fazer exames ao cora��o e identificar se existe alguma altera��o que possa estar a causar  a dor.\r\n" + 
					""));
			No no34= new No(new Pergunta("Deve procurar um pronto-socorro para fazer exames ao cora��o, como eletrocardiograma, enzimas card�acas e raio X de t�rax, para identificar se h� infarto e iniciar o tratamento o mais r�pido poss�vel.\r\n" + 
					""));
			No no35= new No(new Pergunta("Se sentir  falta de ar, chiado ou tosse frequente consultar um pneumologista para identificar a causa espec�fica da dor e iniciar o tratamento."));
			No no36= new No(new Pergunta("Poder� ser Les�o muscular?"));
			No no37= new No(new Pergunta("Tem Doen�as respirat�rias?"));
			No no38= new No(new Pergunta("Tem uma dor muito forte no fundo das costas que o impede  de caminhar?"));
			No no39= new No(new Pergunta(" Esta a sentir uma Contratura muscular?"));
			No no40= new No(new Pergunta("Para aliviar a dor nas costas devido � les�o muscular, pode-se colocar uma compressa morna na regi�o durante 15 minutos. � importante evitar fazer muitos esfor�os para que os sintomas da les�o possam aliviar mais rapidamente."));
			No no41= new No(new Pergunta("Recomenda-se que procure um pneumologista ou cl�nico geral para que se possa tratar a doen�a respirat�ria, principalmente quando h� sintomas como falta de ar, tosse, catarro ou febre.\r\n" + 
					""));
			No no42= new No(new Pergunta("Poder� ser pedras nos rins � importante ir � emerg�ncia para que sejam feitos exames para identificar a pedra e o seu tamanho dever� tomar  anti-inflamat�rios para al�vio dos sintomas, ou realiza��o de um pequeno procedimento cir�rgico para remo��o do c�lculo."));
			No no43= new No(new Pergunta("Pode acontecer devido ao cansa�o, excesso de atividade f�sica, preocupa��o ou postura errada ao sentar realize Exerc�cios de alongamento  para esticar os m�sculos e se sentir mais relaxado. Ficar numa posi��o confort�vel e rodar a cabe�a lentamente para todos os lados."));
			No no44= new No(new Pergunta("A dor � Acima do abd�men, atr�s do externo?"));
			No no45= new No(new Pergunta("A dor � no centro do abdomen?"));
			No no46= new No(new Pergunta("A dor � no abd�men inferior, em redor do �tero(mulheres)?"));
			No no47= new No(new Pergunta("Dor ao redor do umbigo?"));
			No no48= new No(new Pergunta("Pode ser causada por refluxo g�strico esta dor pode ser aliviada pela toma de um anti�cido. Consulte o seu profissional de sa�de em caso de ser frequente."));
			No no49= new No(new Pergunta("Pode ser uma rea��o aos alimentos, ao stress ou a outras influ�ncias externas. Buscopan proporciona al�vio localizado e eficaz para este tipo de dor se a dor persistir consulte o medico."));
			No no50= new No(new Pergunta("As mulheres sofrem regularmente de dor antes ou durante a menstrua��o e/ou durante a ovula��o se a dor piorar, deve contactar o seu profissional de sa�de."));
			No no51= new No(new Pergunta("Poder� ter uma apendicite dever dirigir-se ao medico para realizar analises se a dor n�o desaparecer em pouco tempo"));
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
