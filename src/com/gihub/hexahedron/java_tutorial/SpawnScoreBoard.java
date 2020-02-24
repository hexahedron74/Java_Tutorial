package com.gihub.hexahedron.java_tutorial;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.*;

import java.util.ArrayList;

public class SpawnScoreBoard implements Listener {

    static ArrayList<String> A = new ArrayList<String>();

    public void add(final Player player) {
        final ScoreboardManager manager = Bukkit.getScoreboardManager();
        final Scoreboard board = manager.getNewScoreboard();

        Objective objective = board.registerNewObjective("Scoreboard","dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score spacer = objective.getScore("player:");
        spacer.setScore(2);

        A.clear();
        A.add("1");

        BukkitScheduler Scheduler = Bukkit.getServer() .getScheduler();
        Scheduler.scheduleSyncRepeatingTask((Plugin) this, new Runnable() {
            @Override
            public void run() {
                Integer i = A.size();

                if(i == 1) {
                    objective.setDisplayName(ChatColor.RED + "HYPER SPACE");
                    A.add("A");
                }
                if(i == 2) {
                    objective.setDisplayName(ChatColor.YELLOW + "HYPER SPACE");
                    A.add("B");
                }
                if(i == 3) {
                    objective.setDisplayName(ChatColor.GREEN + "HYPER SPACE");
                    A.add("C");
                }
                if(i == 4) {
                    objective.setDisplayName(ChatColor.AQUA + "HYPER SPACE");
                    A.add("D");
                }
                if(i == 5) {
                    objective.setDisplayName(ChatColor.BLUE + "HYPER SPACE");
                    A.add("E");
                }
                if(i == 6) {
                    objective.setDisplayName(ChatColor.LIGHT_PURPLE + "HYPER SPACE");
                    A.add("F");
                }
                if(i == 6) {
                    objective.setDisplayName(ChatColor.WHITE + "HYPER SPACE");
                    A.add("G");
                    A.add("1");
                }
            }
        }, 0, 5);
    }
    public static String Format(String text) {
        return text.replaceAll("&", "$");
    }
    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        this.add(p);
    }
}

