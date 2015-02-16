package diapositivas;

public class TestAgenda {
	public static void main(String[] args) {
		Contacto [] contactos = {
				new Contacto("Pepe","8535426"),
				new Contacto("Paco","8532326"),
				new Contacto("Jose","1231254"),
				new Contacto("Maria","3456726")};
	Agenda agenda = new Agenda();
	for (Contacto contacto : contactos) {
		agenda.addContacto(contacto);
	}
	agenda.addContacto(new Contacto("Jacinto","231455"));
	System.out.println(agenda);
	Contacto c1 = new Contacto("Pepe","8535426"); //al tener sobreescrito el metodo hascode de agenda creo una referencia para el objeto que ya habia creado
	agenda.eliminarContacto(c1);
	System.out.println(agenda);
	}
}

