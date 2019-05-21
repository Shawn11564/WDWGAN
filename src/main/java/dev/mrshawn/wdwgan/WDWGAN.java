package dev.mrshawn.wdwgan;

import dev.mrshawn.wdwgan.bodies.Body;
import dev.mrshawn.wdwgan.bodies.BodyUtils;
import dev.mrshawn.wdwgan.listeners.Logout;
import dev.mrshawn.wdwgan.listeners.NPCInteraction;
import dev.mrshawn.wdwgan.listeners.RespawnListener;
import dev.mrshawn.wdwgan.listeners.SleepListener;
import dev.mrshawn.wdwgan.sleep.SleepingEffects;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class WDWGAN extends JavaPlugin {

	private static WDWGAN instance;

	@Override
	public void onEnable() {
		instance = this;
		getConfig().options().copyDefaults(); saveDefaultConfig();
		if (getServer().getPluginManager().getPlugin("Citizens") == null || !getServer().getPluginManager().getPlugin("Citizens").isEnabled()) {
			Bukkit.getServer().getLogger().log(Level.SEVERE, "Citizens Plugin not detected! Please install and restart the server.");
			getServer().getPluginManager().disablePlugin(this);
		}
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this,
				new SleepingEffects(),
				20,
				20 * getConfig().getInt("regen-rate"));
		registerEvents();
	}

	@Override
	public void onDisable() {
		for (Body body : BodyUtils.getBodies()) {
			body.getNpc().destroy();
			BodyUtils.getBodies().remove(body);
		}
	}

	public static WDWGAN getInstance() {
		return instance;
	}

	public void registerEvents() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new SleepListener(), this);
		pm.registerEvents(new RespawnListener(), this);
		pm.registerEvents(new Logout(), this);
		pm.registerEvents(new NPCInteraction(), this);
	}

}
