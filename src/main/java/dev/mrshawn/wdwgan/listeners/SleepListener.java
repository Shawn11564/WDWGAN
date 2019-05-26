package dev.mrshawn.wdwgan.listeners;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SleepListener implements Listener {

	private static WDWGAN instance = WDWGAN.getInstance();
	
	@EventHandler
	public void onSleep(PlayerBedEnterEvent e) {
		Player player = e.getPlayer();
		Block bed = e.getBed();
		Location bedLoc = bed.getLocation();
		World original = player.getWorld();
		World dreamworld = new World(instance.getConfig.getString("dream-world"));
		if (!player.getWorld.equals(dreamworld)) {
			e.setCanceled(true);
			player.setLocation(new Location(dreamworld, 0, 100, 0);
		} else if (player.getWorld.equals(dreamworld)) {
			player.setLocation(new Location(original, bedLoc.getX(), bedLoc.getY(), getLoc.getZ()));
		}
	}

}
