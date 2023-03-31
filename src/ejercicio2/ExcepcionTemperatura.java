package ejercicio2;

public class ExcepcionTemperatura extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String infoAficional;

	public ExcepcionTemperatura(String infoAficional) {
		super();
		this.infoAficional = infoAficional;
	}
	
}
