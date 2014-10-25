package shybella.license;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class PlayerListener implements Listener {
	public PlayerListener(EventHandle plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		
	}
	
	@EventHandler
	public void OnBlockPlace(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		Action eAction = e.getAction();
		
		
	}				
}



