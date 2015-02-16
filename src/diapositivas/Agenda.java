package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contacto> contactos;
	public Agenda(){
		this.contactos = new ArrayList<Contacto>();
	}
	public Agenda(List<Contacto> l){
		this.contactos = l;	
	}
	public void addContacto(Contacto c){
		contactos.add(c);
	}
	public boolean existe(Contacto c){
		return this.contactos.contains(c);
	}
	public void eliminarContacto(Contacto c){
		if(this.existe(c)){
			this.contactos.remove(c);
		} else System.out.println("Ese contacto no existe");
	}
	public void actualizarTelefono(Contacto c, String tel){
		if(existe(c)) c.setTelefono(tel);
		else System.out.println("Ese contacto no existe");
	}
	public void actualizarNombre(Contacto c, String nom){
		if(existe(c)) c.setNombre(nom);
		else System.out.println("Ese contacto no existe");
	}
	@Override
	public String toString() {
		return "Agenda :\n " + contactos + " ";
	}
}
