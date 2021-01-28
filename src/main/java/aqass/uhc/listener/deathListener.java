package aqass.uhc.listener;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class deathListener implements Listener {

    public void OnDeath(PlayerDeathEvent event) {
        Player player = event.getEntity().getPlayer();
        if (player != null && player.isDead()) {
            player.setGameMode(GameMode.SPECTATOR);
            event.setDeathMessage(ChatColor.GRAY + "Gracz"+ player.getDisplayName() + "Odpadl z rozgrywki");


        }

    }
}