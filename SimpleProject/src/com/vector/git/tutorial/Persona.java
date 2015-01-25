package com.vector.git.tutorial;

import java.util.List;

public class Persona {
	private static transient String SEPARATOR = System.getProperty( "line.separator" ).intern();
	
	String name;
	String xisname;
	String lotusname;
	String description;
	List<String> skills;
	
	public Persona() {
	}
	
	@Override
	public String toString() {
		return "Nombre: " + name + SEPARATOR + 
			   "Nombre ISBAN: " + xisname + SEPARATOR +
			   "Nombre notes: " + lotusname + SEPARATOR +
			   "Descripción: " + description + SEPARATOR +
			   "Habilidades: " + getSkills();
	}
	
	private String getSkills ( ) {
		String data = "";
		for ( String s : skills ) {
			data += ( data.length() > 0 ) ? ", " : "";
			data += s;
		}
		return data;
	}
}
