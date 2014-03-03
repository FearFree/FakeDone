package com.fearhookers.fakedone;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
/**
 *
 * @author Nick Amsbaugh aka FearFree
 */
public final class fakedone 
extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("Fake Done 1.2 - McMyAdmin Version Enabled");
        getLogger().info("This plugin collects minimal statistic data and sends it to http://mcstats.org/plugin/FakeDone");
        getLogger().info("You can opt out, disabling metrics for all plugins, by changing the opt-out value in /plugins/PluginMetrics/config.yml");
        Bukkit.getConsoleSender().sendMessage("[00:00:00] [Server thread/INFO]: Done (0.000s)! For help, type \"help\" or \"?\"");
        try {
            MetricsLite metrics = new MetricsLite(this);
            metrics.start();
        } catch (IOException e) {
        // Failed to submit the stats :-(
        }
    } 
    
    @Override
    public void onDisable() {
        getLogger().info("Fake Done 1.2 - McMyAdmin Version Disabled");
    }
}
