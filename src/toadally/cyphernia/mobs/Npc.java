package toadally.cyphernia.mobs;

import org.bukkit.entity.EntityType;

import toadally.cyphernia.Cyphernia;
import toadally.cyphernia.quest.Quest;

public class Npc {
	
	
	String name;
	EntityType entity;
	Cyphernia pl;
	
	
	public Npc(Cyphernia pl, String name, EntityType entity) {
		
		
		
		this.name = name;
		this.pl = pl;
		this.entity = entity;
		
		
	}
	
	public boolean spawn() {
		
		if(entity.equals(EntityType.PLAYER)) {
			this.setPlayerSkin();
		}
		
		
		return true;
	}
	
	private boolean setPlayerSkin() {
		
		
		
		return true;
		
	}

}
