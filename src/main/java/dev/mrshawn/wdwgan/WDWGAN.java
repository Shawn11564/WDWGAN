package dev.mrshawn.wdwgan;

import dev.mrshawn.wdwgan.bodies.Body;
import dev.mrshawn.wdwgan.bodies.BodyUtils;
import org.bukkit.Bukkit;
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

}
