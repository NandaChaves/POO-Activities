/**
 * 
 */
package TreinarPOO;

/**
 * @author mnlta
 *
 */
public abstract class Atividade {

	private String nome;
	private int prio;
	
	/**
	 * @param nome
	 * @param prio
	 */
	public Atividade(String nome, int prio) {
		this.nome = nome;
		this.prio = prio;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @return the prio
	 */
	public int getPrio() {
		return prio;
	}
	
	public String toString() {
		return "Nome: " + nome +" / Prioridade: "+ prio;
	}
}
