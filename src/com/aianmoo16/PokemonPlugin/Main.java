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
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("pokemon")) {
			sender.sendMessage(ChatColor.GOLD + "/pokemon help");
			return true;
			}
		return false;
	
	
	
	}}
