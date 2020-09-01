package de.leginhee.pingcmd;

import de.leginhee.pingcmd.commands.PingCMD;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("ping").setExecutor(new PingCMD());
        this.reloadConfig();
    }


    @Override
    public void onDisable() {
    }
}
