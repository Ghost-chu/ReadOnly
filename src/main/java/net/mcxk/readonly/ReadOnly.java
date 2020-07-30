package net.mcxk.readonly;

import net.mcxk.readonly.listener.*;
import net.mcxk.readonly.watcher.AIRemover;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ReadOnly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new BlockEventsListener(), this);
        Bukkit.getPluginManager().registerEvents(new ChunkEventsListener(), this);
        Bukkit.getPluginManager().registerEvents(new EnchantmentEventsListener(), this);
        Bukkit.getPluginManager().registerEvents(new EntityEventsListener(), this);
        Bukkit.getPluginManager().registerEvents(new HangingEventsListener(), this);
        Bukkit.getPluginManager().registerEvents(new InventoryEventsListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerEventsListener(), this);
        Bukkit.getPluginManager().registerEvents(new RaidEventsListener(), this);
        new AIRemover().runTaskTimer(this, 0, 5);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
