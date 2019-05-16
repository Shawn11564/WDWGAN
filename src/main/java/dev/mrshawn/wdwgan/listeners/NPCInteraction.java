package dev.mrshawn.wdwgan.listeners;

import dev.mrshawn.wdwgan.bodies.Body;
import dev.mrshawn.wdwgan.bodies.BodyUtils;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class NPCInteraction implements Listener {

	@EventHandler
	public void npcInteract(NPCRightClickEvent e) {
		Player player = e.getClicker();
		Body body = BodyUtils.getBodyFromNPC(e.getNPC());
		if (body != null) {
			Inventory inventory = body.getInventory();
			player.openInventory(inventory);
		}
	}

}
