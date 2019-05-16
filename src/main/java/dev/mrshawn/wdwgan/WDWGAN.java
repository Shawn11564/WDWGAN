package dev.mrshawn.wdwgan;

import org.bukkit.plugin.java.JavaPlugin;

public final class WDWGAN extends JavaPlugin {

	private static WDWGAN instance;

	@Override
	public void onEnable() {
		instance = this;
		getConfig().options().copyDefaults(); saveDefaultConfig();
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}

	public static WDWGAN getInstance() {
		return instance;
	}

}
