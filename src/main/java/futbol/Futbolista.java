package futbol;


public class Futbolista implements Comparable<Object>{
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre,int edad,String posicion){
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	
	public Futbolista() {
		this.nombre = "Maradona";
		this.posicion = "delantero";
		this.edad = 30;		
	}
	
	public String toString() {
		return "El futbolista "+nombre+" tiene "+edad+", y juega de "+posicion;
	}
	
	@Override
	public int compareTo(Object futbolista){
	if(this.equals(futbolista)) {
		return 1;
	}else {
		return 0;
		}
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}	
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}	

}