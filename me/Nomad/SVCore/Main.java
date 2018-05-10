package me.Nomad.SVCore;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatAPI.line);
		getServer().getConsoleSender().sendMessage("");
		getServer().getConsoleSender().sendMessage("[Survival Core] Develop By Nomad");
		getServer().getConsoleSender().sendMessage("");
		getServer().getConsoleSender().sendMessage(ChatAPI.line);
		getCommand("clearchat").setExecutor(new ClearChat());
		getCommand("cc").setExecutor(new ClearChat());
		getCommand("svb").setExecutor(new Broadcast());
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("[Survival Core] Develop By Nomad // DISABLED");
	}

}
