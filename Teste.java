/**
 * 
 */
package TreinarPOO;

/**
 * @author mnlta
 *
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GereAtividade gere = new GereAtividade();
		
		Atividade novaA = new Desporto("Futebol", 3, "Porto", "12:25");
		gere.registaAtividade(novaA);
		novaA = new Desporto("Andebol", 1, "Porto", "12:25");
		gere.registaAtividade(novaA);
		novaA = new Espetaculo("Laplace", 5, "Concerto", 2.25);
		gere.registaAtividade(novaA);
		
		//gere.imprimirAtividade(1);
		
		//gere.imprimeDetalhes("Laplace");
		
		gere.imprimeEspetaculo("Concerto");
		
		gere.imprimirPrioridade("Andebol");
	}

}
