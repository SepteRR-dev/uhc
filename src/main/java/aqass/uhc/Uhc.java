package aqass.uhc;

import aqass.uhc.listener.regenerationListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Uhc extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new regenerationListener(), this);

        System.out.println("UHC plugin loaded");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Plugin is dead lmao");

    }

}
