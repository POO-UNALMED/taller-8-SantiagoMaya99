package futbol;

public class Portero extends Futbolista {

	public short golesRecibidos;
	public byte dorsal;

	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	public boolean jugarConLasManos() {
		return true;
	}

	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion()
				+ " con el dorsal " + this.getDorsal() + ". Le han marcado " + this.getGolesRecibidos();
	}

	@Override
	public int compareTo(Object portero) {
		return (((Portero) portero).getGolesRecibidos() - this.getGolesRecibidos());
	}

	public short getGolesRecibidos() {
		return this.golesRecibidos;
	}

	public byte getDorsal() {
		return this.dorsal;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

}