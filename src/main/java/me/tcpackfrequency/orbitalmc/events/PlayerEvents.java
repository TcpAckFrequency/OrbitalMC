package me.tcpackfrequency.orbitalmc.events;

import me.tcpackfrequency.orbitalmc.OrbitalMC;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEvents implements Listener {

    private OrbitalMC pl;

    public PlayerEvents(OrbitalMC pl) {
        this.pl = pl;
    }

    @EventHandler
    public void Leave(PlayerQuitEvent e){
        this.pl.getDb().getCurrentDatabaseHandler().saveStats(e.getPlayer().getUniqueId());
        this.pl.getPm().RemoveProfile(e.getPlayer().getUniqueId());
    }

}