package me.Nomad.SVCore;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearChat implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] arg) {
		
		Player p = (Player) sender;
		
		if(p.hasPermission("svcore.clearchat")) {
			for(int x = 0; x < 150; x++) {
				Bukkit.broadcastMessage("");
			}
			
		} else if (!p.hasPermission("svcore.clearchat")) {
			p.sendMessage(ChatAPI.notperm);
			
		}
		return false;
	}

}
