package dev.mrshawn.wdwgan.listeners;

import dev.mrshawn.wdwgan.WDWGAN;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnListener implements Listener {

	private static WDWGAN instance = WDWGAN.getInstance();

	@EventHandler
	public void onRespawn(PlayerRespawnEvent e) {
		Player player = e.getPlayer();
		if (e.isBedSpawn() && !instance.getConfig().getBoolean("coordinates.enabled")) {
			e.setRespawnLocation(Bukkit.getServer().getWorld(instance.getConfig().getString("respawn-world")).getSpawnLocation());
		} else if (e.isBedSpawn() && instance.getConfig().getBoolean("coordinates.enabled")) {
			int x = instance.getConfig().getInt("coordinates.x");
			int y = instance.getConfig().getInt("coordinates.y");
			int z = instance.getConfig().getInt("coordinates.z");
			World world = Bukkit.getServer().getWorld(instance.getConfig().getString("respawn-world"));
			Location location = new Location(world, x, y, z);
			e.setRespawnLocation(location);
		}
	}

}
