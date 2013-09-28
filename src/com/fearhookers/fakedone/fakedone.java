/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fearhookers.fakedone;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
/**
 *
 * @author Nick
 */
public final class fakedone 
extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("Fake Done 1.0 - McMyAdmin Version Enabled");
        Bukkit.getConsoleSender().sendMessage("Done (5.000s)! For help, type \"help\" or \"?\"");
    }

    @Override
    public void onDisable() {
        getLogger().info("Fake Done 1.0 - MvcvMyAdmin Version Disabled");
    }
}
