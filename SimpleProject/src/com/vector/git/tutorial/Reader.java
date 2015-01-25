package com.vector.git.tutorial;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class Reader {
	
	private String PATH = "data/";
	
	private Persona readPersona ( String persona ) {
		Gson g = new Gson();
		return g.fromJson( persona, Persona.class );
	}
	
	private Group readGroup ( String group ) {
		Gson g = new Gson();
		Group gr = g.fromJson( group, Group.class );
		gr.personas = new ArrayList<Persona>();
		for ( String id : gr.ids ) {
			gr.personas.add ( getPersona( id ) );
		}
		return gr;
	}
	
	public Group getGroup ( String groupID ) {
		try {
			Scanner s = new Scanner( new File ( PATH + "groups/" + groupID + ".json" ) );
			StringBuffer sb = new StringBuffer();
			while ( s.hasNextLine() ) {
				sb.append ( s.nextLine() );
			}
			s.close();
			return readGroup ( sb.toString() );
		} catch ( Exception e ) {
			return null;
		}
	}
	
	public Persona getPersona ( String personaID ) {
		try {
			Scanner s = new Scanner( new File ( PATH + "personas/" + personaID + ".json" ) );
			StringBuffer sb = new StringBuffer();
			while ( s.hasNextLine() ) {
				sb.append ( s.nextLine() );
			}
			s.close();
			return readPersona( sb.toString() );
		} catch ( Exception e ) {
			return null;
		}
	}
}
