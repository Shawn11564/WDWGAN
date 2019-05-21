package dev.mrshawn.wdwgan.sleep;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class SleepingEffects extends BukkitRunnable {

	@Override
	public void run() {
		for (Player p : Bukkit.getOnlinePlayers()) {
			if (p.isSleeping() && p.getHealth() < p.getMaxHealth()) {
				p.setHealth(p.getHealth() + 0.5d);
			}
		}
	}
}
