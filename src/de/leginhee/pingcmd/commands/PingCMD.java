package de.leginhee.pingcmd.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PingCMD implements CommandExecutor {

    //Permissions and Messages

    String pingperms = "bungeecord.ping";
    String pingmsg = "Your ping is:";

    //Creating ping command

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(s.equalsIgnoreCase("ping")){
            if (commandSender instanceof  Player) {
                if (commandSender.hasPermission(pingperms)){
                     Player player = (Player) commandSender;

                if (strings.length <= 0) {
                    if (player.hasPermission(pingperms)) {

                        player.sendMessage(ChatColor.GREEN + pingmsg + " " + ((CraftPlayer) player).getHandle().ping);

                        return true;
                    }
                  }
                }
            }
        }
        return false;
    }


}

