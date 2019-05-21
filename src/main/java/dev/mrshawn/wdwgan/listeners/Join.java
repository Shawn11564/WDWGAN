package dev.mrshawn.wdwgan.listeners;

import dev.mrshawn.wdwgan.bodies.BodyUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		BodyUtils.getBodyFromName(player.getName()).deleteBody();
	}

}
