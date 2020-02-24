//xyz 689 4  -810
package com.gihub.hexahedron.java_tutorial;

import io.netty.util.internal.SystemPropertyUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main_Hyperspace extends JavaPlugin implements Listener {


    //Plugin Activated
    @Override
    public void onEnable() {
        getLogger().info("HYPERSPACE Is Activated");
        getLogger().info("Developer: ITHAN");
        Bukkit.getPluginManager().registerEvents(new PlayerJoinAndQuit(), this);
        Bukkit.getPluginManager().registerEvents(new BlockEvent(), this);
        Bukkit.getPluginManager().registerEvents(new SpawnScoreBoard(), this);
    }


    //Plugin Disactivated
    @Override
    public void onDisable() {
        getLogger().info("HYPERSPACE PLUGIN DISACTIVATED");
    }


    //Plugin Info

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(cmd.getName().equalsIgnoreCase("t")) {

            if(args.length == 0)  {

                sender.sendMessage(ChatColor.RED + "Type the command to execute.");
            }
            else if(args[0].equalsIgnoreCase("info")) {
                sender.sendMessage(ChatColor.YELLOW + "==========================PLUGIN INFO==========================");
                sender.sendMessage(ChatColor.WHITE + "PLUGIN: HYPERSPACE PLUGIN");
                sender.sendMessage(ChatColor.WHITE + "DEVELOPER: ITHAN");
                sender.sendMessage(ChatColor.WHITE + "DEVELOPER BLOG: https://blog.naver.com/ithan0704");
                sender.sendMessage(ChatColor.WHITE + "DEVELOPER CAFE: https://cafe.naver.com/jwareprogrammingnote");
                sender.sendMessage(ChatColor.WHITE + "Please report any bugs to blog.naver.com/ithan0704.");
                sender.sendMessage(ChatColor.WHITE + "Copyright (C) JWare Soft Development ALL RIGHT RESERVED");
                sender.sendMessage(ChatColor.YELLOW + "===============================================================");
            }

        }
        else{
            sender.sendMessage(ChatColor.RED + "Command is not correct. Type /t help");
        }



        return true;

    }

    public static void main(String[] args) {
        System.out.println("Program is Working!");
    }

}






	
	
	