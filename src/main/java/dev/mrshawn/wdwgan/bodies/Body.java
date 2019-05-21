package dev.mrshawn.wdwgan.bodies;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Body {

	private NPC body;
	private double health;
	private Player owner;
	private Location location;
	private Inventory inventory;

	public Body(Player owner, Location location) {
		this.owner = owner;
		this.location = location;
		body = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, this.owner.getName());
		BodyUtils.getBodies().add(this);
	}

	public void configureNPC() {

	}

	public void setInventory() {

	}

	public String getName() {
		return body.getName();
	}

	public Inventory getInventory() {
		return inventory;
	}

	public NPC getNpc() {
		return body;
	}

	public double getHealth() {
		return body.getEntity().getHealth();
	}

	public void setHealth(d) {
		return body.getEntity().setHealth(d);
	}

	public void deleteBody() {
		body.destroy();
		CitizensAPI.getNPCRegistry().deregister(body);
	}

}
