package com.vector.git.tutorial;

public class Run {

	private static void err ( ) {
		System.out.println( "Run group|persona <ID>" );
	}
	
	public static void main ( String[] args ) {
		if ( args.length == 0 ) {
			err ( );
			return;
		}
		
		if ( "persona".equals(args[0]) ) {
			System.out.println( new Reader().getPersona( args[1] ) );
		} else if ( "group".equals(args[0]) ) {
			System.out.println( new Reader().getGroup( args[1] ) );
		} else {
			err ( );
		}
	}

}
