package com.tenjava.entries.messageofdeath.t3.Utils.RandomEventsManager;

import org.bukkit.entity.Player;

import com.tenjava.entries.messageofdeath.t3.TenJava;

public abstract class RandomEvent {

	private TenJava instance;
	private int Id;
	
	public RandomEvent(TenJava instance, int Id) {
		this.instance = instance;
		this.Id = Id;
	}
	
	public int getId() {
		return this.Id;
	}
	
	public abstract void run(Player player);
}
