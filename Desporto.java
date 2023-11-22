/**
 * 
 */
package TreinarPOO;

/**
 * @author mnlta
 *
 */
public class Desporto extends Atividade {

	private String local;
	private String horario;
	
	public Desporto(String nome, int prio, String local, String horario) {
		super(nome, prio);
		this.local = local;
		this.horario = horario;
	}

	/**
	 * @return the local
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	@Override
	public String toString() {
		return super.toString() +" / Local: " + local + " / Horário: " + horario;
	}

}
