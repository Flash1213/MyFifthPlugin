package me.flash1213;

import java.util.Random;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Teleporter extends JavaPlugin {

	@Override
	public void onEnable() {
			
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("teleportme") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			Location originalLocation = player.getLocation();
			
			Random random = new Random();
			
			int x = random.nextInt(1000) + 1;
			int y = 150;
			int z = random.nextInt(1000) + 1;
			
			Location teleportLocation = new Location(player.getWorld(), x, y, z);
			
			player.teleport(teleportLocation);
			
			player.sendMessage(ChatColor.GREEN + "You have been teleported " + (int)teleportLocation.distance(originalLocation) + " blocks away!");
			
			return true;
			
		}
		
		return false;	
		
	}
	
}