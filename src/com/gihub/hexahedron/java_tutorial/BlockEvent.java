package com.gihub.hexahedron.java_tutorial;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class BlockEvent implements Listener {

    //Player Block Place Event(OP, Deop)
    @EventHandler
    public void BlockBreakEvent(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        if (player.isOp()) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
            player.sendMessage(ChatColor.RED + "You Don't Have Permissions to Place Block!");
        }
    }


    //Player Block Break Event(OP, Deop)
    @EventHandler
    public void BlockBreakEvent(BlockBreakEvent e) {
        Player player = e.getPlayer();
        if (player.isOp()) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
            player.sendMessage(ChatColor.RED + "You Don't Have Permissions to Break Block!");
        }
    }


    //Server Protect Event(Block Burn Event)
    @EventHandler
    public void BlockBurnEvent(BlockBurnEvent e) {
        e.setCancelled(true);
    }


    //Player Protection in Lobby(onEntityDamageEvent Fall Event)
    @EventHandler
    public void onEntityDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player player = (Player) e.getEntity();
            if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                e.setCancelled(true);
            }
        }
    }

    //Player Protection in Lobby(onEntityDamageEvent Suicide Event)
    @EventHandler
    public void onEntitySuicideDamage(EntityDamageEvent e1) {
        if (e1.getEntity() instanceof Player) {
            Player player = (Player) e1.getEntity();
            if (e1.getCause() == EntityDamageEvent.DamageCause.SUICIDE) {
                e1.setCancelled(true);
            }
        }
    }

    //Player Protection in Lobby(onEntityDamageEvent Entity_Attack Event)
    @EventHandler
    public void onEntityAttackDamage(EntityDamageEvent e2) {
        if (e2.getEntity() instanceof Player) {
            Player player = (Player) e2.getEntity();
            if (e2.getCause() == EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
                e2.setCancelled(true);
            }
        }
    }
}
