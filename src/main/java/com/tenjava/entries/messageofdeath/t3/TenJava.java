package com.tenjava.entries.messageofdeath.t3;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.tenjava.entries.messageofdeath.t3.Utils.RandomEventsManager.RandomEventManager;
import com.tenjava.entries.messageofdeath.t3.Utils.RandomEventsManager.Events.SinkHole1;

public class TenJava extends JavaPlugin implements Listener {
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 *   I did not finish
	 *   I was very tired and got off and slept
	 *   There is no point in looking here
	 * 
	 * 
	 * 
	 * 
	 */
	
	//Managers
	private RandomEventManager randomEventManager;
	
	@Override
	public void onEnable() {
		/******************** Initation of Variables ********************/
		//********** Managers **********
		this.randomEventManager = new RandomEventManager();
		
		
		//TODO TEMPORARY
		super.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	//************************* Managers *************************
	
	public RandomEventManager getRandomEventManager() {
		return this.randomEventManager;
	}
	
	
	
	
	
	
	
	// TODO TEMPORARY
	@EventHandler
	public void onLeftClick(PlayerInteractEvent event) {
		if(event.getAction() == Action.RIGHT_CLICK_AIR) {
			SinkHole1 d = new SinkHole1(this);
			event.getPlayer().sendMessage("Initating Special Event");
			d.run(event.getPlayer());
		}
	}
}
