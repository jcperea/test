package com.vector.git.tutorial;

import java.util.List;

public class Group {
	
	private static transient String SEPARATOR = System.getProperty( "line.separator" ).intern();
	private static transient String LINE = "--------------".intern();

	List<String> ids;
	String name;
	String description;

	transient List<Persona> personas;
	
	public Group() {
	}
	
	@Override
	public String toString() {
		return "Nombre: " + name + SEPARATOR + 
			   "Descripción: " + description + SEPARATOR +
			   "Miembros del equipo: " + SEPARATOR + 
			   getPersonasString() +
			   SEPARATOR;
	}
	
	public String getPersonasString ( ) {
		String data = "";
		for ( Persona p : personas ) {
			data += data.length() > 0 ? SEPARATOR + LINE + SEPARATOR : "";
			data += p.toString(); 
		}
		return data;
	}
	
}
