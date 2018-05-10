package me.Nomad.SVCore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Broadcast implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		Player p = (Player) sender;
		String message = ("");
		
        for ( String string : args ) {
            message = message + string + " ";
        }
        
        if(p.hasPermission("svcore.broadcast") && args.length == 0) {     
            p.sendMessage(ChatAPI.linegame);
            p.sendMessage(ChatAPI.blank);
            p.sendMessage(ChatColor.GREEN + " /svb <msg>" + ChatColor.YELLOW + " ใช้คำสั่ง /svb ตามด้วยข้อความที่ต้องการประกาศ");
            p.sendMessage(ChatAPI.blank);
            p.sendMessage(ChatAPI.linegame);          
        } else if (p.hasPermission("svcore.broadcast") && args.length >= 1) { 
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage(ChatColor.GREEN + "    Announcement By: " + ChatColor.WHITE + p.getPlayer().getName());
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage(" " + ChatColor.YELLOW + message);
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage("");
        } else if (!p.hasPermission("svcore.broadcast")) {
            p.sendMessage(ChatAPI.notperm);
        }
        return false;
    }
}
