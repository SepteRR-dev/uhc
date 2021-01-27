package aqass.uhc;

import aqass.uhc.listener.regenerationListener;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class Uhc extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new regenerationListener(), this);

        System.out.println("UHC plugin loaded");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Plugin is dead lmao"); //Oh yyes bull


    }


//sas

    @EventHandler
    public void OnDeath(PlayerDeathEvent event){

        Player player = event.getEntity().getPlayer();
        if (player.isDead()){

            player.setGameMode(GameMode.SPECTATOR);

        }

    }

}
