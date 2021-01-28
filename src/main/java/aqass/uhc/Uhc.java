package aqass.uhc;

import aqass.uhc.listener.deathListener;
import aqass.uhc.listener.regenerationListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class Uhc extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new regenerationListener(), this);
        getServer().getPluginManager().registerEvents(new deathListener(),this);
        System.out.println("UHC plugin loaded");

    }

    @Override
    public void onDisable() {
            // Plugin shutdown logicnh

        System.out.println("Plugin is dead lmao");


    }





}
