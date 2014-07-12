package com.tenjava.entries.messageofdeath.t3.Utils.RandomEventsManager.Events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;

import com.tenjava.entries.messageofdeath.t3.TenJava;
import com.tenjava.entries.messageofdeath.t3.Utils.RandomEventsManager.RandomEvent;

public class SinkHole1 extends RandomEvent {
	
	private TenJava instance;

	public SinkHole1(TenJava instance) {
		super(instance, 1);
		this.instance = instance;
	}

	@Override
	public void run(Player player) {
		/*//Getting block 4 blocks in front of player
		double yawRadians = Math.toRadians(player.getLocation().getYaw());
		double pitchRadians = Math.toRadians(player.getLocation().getPitch());*/
		int radius = 5;
		//int maxDrop = 30;
		Location loc = player.getLocation();
		for(int x = loc.getBlockX() - radius; x <= loc.getBlockX() + radius; x++) {
			for(int y = 0; y <= loc.getBlockY(); y--) {
				for(int z = loc.getBlockZ() - radius; z <= loc.getBlockZ() + radius; z++) {
					//int drop = (int)(double)Math.random() * maxDrop;
					Location newBlock = loc.getWorld().getBlockAt(x, y, z).getLocation();
					FallingBlock fBlock = (FallingBlock)newBlock.getBlock();
					Material type = newBlock.getBlock().getType();
					byte data = newBlock.getBlock().getData();
					fBlock.setDropItem(false);
					newBlock.getBlock().setType(Material.AIR);
					loc.getWorld().spawnFallingBlock(newBlock, type, data);
				}
			}
		}
	}
}
