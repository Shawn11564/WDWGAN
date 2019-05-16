package dev.mrshawn.wdwgan.bodies;

import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Body {

	private NPC body;
	private double health;
	private Player owner;
	private Location location;

	public Body(Player owner, Location location) {
		this.owner = owner;
		this.location = location;
	}

}
