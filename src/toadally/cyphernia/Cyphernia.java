package toadally.cyphernia;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import toadally.cyphernia.util.Utilities;

public class Cyphernia extends JavaPlugin {

	Logger logger;
	Utilities util = new Utilities(this);
	
	public void onEnable() {
		
		logger = Bukkit.getLogger();
	}
	
	public void onDisable() {
		
		
	}
	
	public Utilities util() {
		return this.util;
	}
	public Logger logger() {
		return this.logger;
	}
	
	
}
