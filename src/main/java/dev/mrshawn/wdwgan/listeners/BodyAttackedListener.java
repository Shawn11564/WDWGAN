package dev.mrshawn.wdwgan.listeners;

import dev.mrshawn.wdwgan.bodies.Body;
import dev.mrshawn.wdwgan.bodies.BodyUtils;
import net.citizensnpcs.api.event.NPCDamageByEntityEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BodyAttackedListener implements Listener {

	@EventHandler
	public void onAttack(NPCDamageByEntityEvent e) {
		Body body = BodyUtils.getBodyFromNPC(e.getNPC());
		body.setHealth(body.getHealth() -= e.getDamage());
	}

}
