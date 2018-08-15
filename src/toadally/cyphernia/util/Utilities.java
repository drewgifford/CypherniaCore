package toadally.cyphernia.util;

import toadally.cyphernia.Cyphernia;

public class Utilities {
	
	Cyphernia pl;
	
	public Utilities(Cyphernia pl) {
	
		this.pl = pl;
		
	}
	
	public void logMessage(String s) {
		
		pl.logger().info(s);
		
	}
	
	

}
