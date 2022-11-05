package com.kenik.invisibledeathmessage;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

public final class InvisibleDeathMessage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onKill(PlayerDeathEvent e)
    {
        Player killed = e.getEntity();
        Player killer = e.getEntity().getKiller();
        if(killer.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
            e.setDeathMessage(killed.getName() + " has been slain by UNKNOWN");
        }
    }
}
