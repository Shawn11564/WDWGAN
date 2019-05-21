package dev.mrshawn.wdwgan.listeners;

import dev.mrshawn.wdwgan.WDWGAN;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnListener implements Listener {

	private static WDWGAN instance = WDWGAN.getInstance();

	@EventHandler
	public void onRespawn(PlayerRespawnEvent e) {
		Player player = e.getPlayer();
		if (e.isBedSpawn()) {
			e.setRespawnLocation(Bukkit.getServer().getWorld(instance.getConfig().getString("respawn-world")).getSpawnLocation());
		}
	}

}
