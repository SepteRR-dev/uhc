package aqass.uhc.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class regenerationListener  implements Listener {

    public void onRegeneration(EntityRegainHealthEvent e){
        e.setCancelled(true);
    }

}
