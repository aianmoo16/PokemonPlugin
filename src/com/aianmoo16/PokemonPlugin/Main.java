package com.aianmoo16.PokemonPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		getLogger().info("Pokemon Plugin Enabled");
		
	}
	
	@Override
	public void onDisable() {
		
		getLogger().info("Pokemon Plugin 0.0.1 Disabled");
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("pokemon")) {
			sender.sendMessage(ChatColor.GOLD + "Pokemon Plugin" + ChatColor.PURPLE + "Version" + ChatColor.RED + "Pre-Alpha 0.0.1");
			return true;
			}
		return false;
	
	
	
	}}
