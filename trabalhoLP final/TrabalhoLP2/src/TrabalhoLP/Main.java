package TrabalhoLP;

import java.io.IOException;
import java.util.Scanner;

public class Main {

private static Scanner ler = new Scanner(System.in); 
public static void main(String[] args) {
	
	mostraMenuPrincipal();
	//Criação das arvores
	
}
private static void pause(String msg) {
        System.out.println(msg);
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	public static void mostraMenuPrincipal() {
	int opcao=0;
	System.out.println("*******************************************************");
	System.out.println("**               ________________                    **");
	System.out.println("**               |              |                    **");
	System.out.println("**               | SAÚDE ONLINE |                    **");
	System.out.println("**               |______________|                    **");
	System.out.println("**                                                   **");
	System.out.println("**                                                   **");
	System.out.println("**   1- Veja qual é o seu problema!                  **");
	System.out.println("**   2- Administração                                **");
	System.out.println("**   3- Sair                                         **");
	System.out.println("**                                                   **");
	System.out.println("**                                                   **");
	System.out.println("*******************************************************");
	
	System.out.println("                                     ");
	System.out.println("                                     ");
	
	System.out.println("Opção: ");
	opcao = ler.nextInt();
	
		ArvoreBinaria a = new ArvoreBinaria();
	a.criarArvoreBinaria1();
	if(opcao==1) {
	No no = a.raiz;
	String simounao = "";
	simounao = ler.nextLine();
	while(no.getEsq() != null) {
		if (simounao.equals("s")) {
			no = no.getDir();
		} else if(simounao.equals("n")){
			no = no.getEsq();
		}
		
		System.out.println(no);
		if(no.getEsq() != null) simounao = ler.nextLine();
	}
	System.out.println("**************************************");
	pause("\nPrima enter para voltar ao menu");
	mostraMenuPrincipal();
}
	else if(opcao==2) {
		mostraMenuAdmin ();
	}else if(opcao==3) {
		System.out.println("Sistema encerrado :(");
	
	}
	}
		private static void mostraMenuAdmin () {
			int opcao2=0;
			System.out.println("*******************************************************");
			System.out.println("**               _________________                   **");
			System.out.println("**               |               |                   **");
			System.out.println("**               | Administração |                   **");
			System.out.println("**               |_______________|                   **");
			System.out.println("**                                                   **");
			System.out.println("**                                                   **");
			System.out.println("**   1- Lista de questões                            **");
			System.out.println("**   2- Nº de nós da arvore                          **");
			System.out.println("**   3- Altura da arvore                             **");
			System.out.println("**   4- Sair                                         **");
			System.out.println("**                                                   **");
			System.out.println("*******************************************************");
			
			System.out.println("                                     ");
			System.out.println("                                     ");
			
			System.out.println("Opção: ");
			opcao2 = ler.nextInt();
			ArvoreBinaria a = new ArvoreBinaria();
			a.criarArvoreBinaria1();	
			if(opcao2==1) {
					System.out.println("LISTA POR NIVEIS: ");
					a.listarPorNivel(5);
					
					System.out.println("**************************************");
					pause("\nPrima enter para voltar ao menu");
					mostraMenuAdmin ();
				}else if(opcao2==2) {
					System.out.println("Nº de nós da árvore:" +a.contar());
					
					System.out.println("**************************************");
					pause("\nPrima enter para voltar ao menu");
					mostraMenuAdmin ();
				}else if(opcao2==3) {
					System.out.println("Altura da arvore de perguntas:" +a.altura());
					
					System.out.println("**************************************");
					pause("\nPrima enter para voltar ao menu");
					mostraMenuAdmin ();
				}else if(opcao2==4) {
					mostraMenuPrincipal();
				}
		}


}

	
