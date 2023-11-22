/**
 * 
 */
package TreinarPOO;

import java.util.ArrayList;

/**
 * @author mnlta
 *
 */
public class GereAtividade {

	private ArrayList<Atividade> lista;
	
	public GereAtividade() {
		lista = new ArrayList<Atividade>();
	}
	
	public void registaAtividade(Atividade novaA) {
		Atividade no = pesquisarAtividade(novaA.getNome());
		if(no == null) {
			lista.add(novaA);
		} else {
			System.out.println("Atividade já existe");
		}
			
	}
	
	public void imprimirAtividade(int a) {
		if(a == 0) {
			for(Atividade ativ : lista){
				System.out.println(ativ);
			}
		} else if(a == 1) {
			for(Atividade ativ : lista) {
				if(ativ.getClass().getName().equals("TreinarPOO.Desporto")) {
					System.out.println(ativ);
				}
			}
		} else if(a == 2) {
			for(Atividade ativ : lista) {
				if(ativ.getClass().getName().equals("TreinarPOO.Espetaculo")) {
					System.out.println(ativ);
				}
			}
		}
	}
	
	public Atividade pesquisarAtividade(String nome) {
		for(Atividade ativ : lista) {
			if(ativ.getNome() == nome) {
				return ativ;
			}
		}
		
		return null;
	}
	
	public void imprimeDetalhes(String nome) {
		Atividade at = pesquisarAtividade(nome);
		
		if(at == null) {
			System.out.println("Atividade não existe");
		} else {
			System.out.println(at);
		}
	}
	
	public void imprimirPrioridade(String nome) {
		Atividade at = pesquisarAtividade(nome);
		
		if(at == null) {
			System.out.println("Atividade não existe");
		} else {
			System.out.println("Prioridade: "+ at.getPrio());
		}
	}
	
	public void imprimeEspetaculo(String tipo) {
		for(Atividade ativ : lista) {
			if(ativ instanceof Espetaculo) {
				if(((Espetaculo) ativ).getTipo().equals(tipo)) {
					System.out.println(ativ);
				}
			}
		}
		
	}
}
