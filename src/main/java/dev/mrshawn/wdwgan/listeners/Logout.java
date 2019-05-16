package dev.mrshawn.wdwgan.listeners;

import dev.mrshawn.wdwgan.bodies.Body;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Logout implements Listener {

	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		Player player = e.getPlayer();
		Location location = player.getLocation();
		Body body = new Body(player, location);
	}

}
