package com.gihub.hexahedron.java_tutorial;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;


public class PlayerJoinAndQuit implements Listener {



    //Player Join Event(op, deop, grennie)
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if(player.isOp()) {
            e.setJoinMessage(ChatColor.AQUA + player.getName() + ChatColor.AQUA  +"! Welcome To The HyperSpace");
            player.sendMessage(ChatColor.GREEN + "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            player.sendMessage("                                                        ");
            player.sendMessage(ChatColor.GRAY + player.getName() + "(Administrator)" + ChatColor.WHITE + " Logged in");
            player.sendMessage("                                                        ");
            player.sendMessage(ChatColor.GREEN + "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        }
        else {
            e.setJoinMessage(ChatColor.AQUA + player.getName() + ChatColor.AQUA  +"! Welcome To The HyperSapce");
            player.sendMessage(ChatColor.GREEN + "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            player.sendMessage("                                                        ");
            player.sendMessage( "Hey " + ChatColor.GRAY + player.getName() + ChatColor.WHITE +  ",\n" + "Read the Sever User Guide!\n"
                    + "This Plugin Is Made By ITHAN!");
            player.sendMessage("                                                        ");
            player.sendMessage(ChatColor.GREEN + "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
            BookMeta bm = (BookMeta) book.getItemMeta();
            bm.addPage(ChatColor.BOLD + "Hello!\n" +  ChatColor.BOLD  + "Welcome to the HyperSpace.\n"
                    + ChatColor.RED + ChatColor.BOLD + "*Server user Guide*\n" + "1. Don't do Inapropriate word\n" + "2. Don't Promote chat\n" + "3. No Personal Information(PN, Adress)\n"
                    + ChatColor.BLUE + ChatColor.BOLD + ChatColor.UNDERLINE +  "More rules are going to be added, users who do not follow the above rules will be a no-notice ban!\n"
                    + ChatColor.BOLD + "Please enjoy our server!");
            bm.setAuthor("ITHAN");
            bm.setTitle("Server Guide");
            book.setItemMeta(bm);
            player.getInventory().addItem(book);
            if(player.hasPlayedBefore() == false) {
                e.setJoinMessage(ChatColor.AQUA + player.getName() + ChatColor.AQUA  +"! Welcome To The HyperSapce");
                player.sendMessage(ChatColor.GREEN + "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
                player.sendMessage("                                                        ");
                player.sendMessage( "Hey " + ChatColor.GRAY + player.getName() + ChatColor.WHITE +  ",\n" + "Read the Sever User Guide!\n"
                        + "This Plugin Is Made By ITHAN!");
                player.sendMessage(ChatColor.GREEN + "We are giving one Diamond someone who is on server first Time!");
                player.sendMessage("                                                        ");
                player.sendMessage(ChatColor.GREEN + "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
                ItemStack book1 = new ItemStack(Material.WRITTEN_BOOK);
                BookMeta bm1 = (BookMeta) book1.getItemMeta();
                bm.addPage(ChatColor.BOLD + "Hello!\n" +  ChatColor.BOLD  + "Welcome to the HyperSpace.\n"
                        + ChatColor.RED + ChatColor.BOLD + "*Server user Guide*\n" + "1. Don't do Inapropriate word\n" + "2. Don't Promote chat\n" + "3. No Personal Information(PN, Adress)\n"
                        + ChatColor.BLUE + ChatColor.BOLD + ChatColor.UNDERLINE +  "More rules are going to be added, users who do not follow the above rules will be a no-notice ban!\n"
                        + ChatColor.BOLD + "Please enjoy our server!");
                bm.setAuthor("ITHAN");
                bm.setTitle("Server Guide");
                book.setItemMeta(bm1);
                player.getInventory().addItem(book1);


                player.getInventory().addItem(new ItemStack(Material.DIAMOND, 1));
            }
        }
    }

    //Player Quit Event
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.GREEN + player.getName() + ChatColor.GREEN + " Left The HyperSpace");
    }


}

