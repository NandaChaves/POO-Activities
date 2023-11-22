/**
 * 
 */
package TreinarPOO;

/**
 * @author mnlta
 *
 */
public class Espetaculo extends Atividade {
	
	private String tipo;
	private double custo;

	public Espetaculo(String nome, int prio, String tipo, double custo) {
		super(nome, prio);
		this.custo = custo;
		this.tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return the custo
	 */
	public double getCusto() {
		return custo;
	}

	public String toString() {
		return super.toString() +" / Tipo: "+ tipo +" / Custo: "+ custo +" €";
	}
}
