package dev.mrshawn.wdwgan.listeners;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SleepListener implements Listener {

	@EventHandler
	public void onSleep(PlayerBedEnterEvent e) {
		Player player = e.getPlayer();
		Block bed = e.getBed();
		if (player.getWorld().getTime() >= 25000) {

		}
	}

}
