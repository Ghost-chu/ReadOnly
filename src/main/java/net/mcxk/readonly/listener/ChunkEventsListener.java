package net.mcxk.readonly.listener;

import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.*;
import org.bukkit.inventory.InventoryHolder;

public class ChunkEventsListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void chunkEvent(ChunkLoadEvent e) {
        for (BlockState state : e.getChunk().getTileEntities()) {
            if (state instanceof InventoryHolder) {
                ((InventoryHolder) state).getInventory().clear(); //Cleanup the inventory to prevent lag hoppers and crash shulkerbox or etc.
            }
        }
        for (Entity entity : e.getChunk().getEntities()) {
            if (entity instanceof InventoryHolder) {
                ((InventoryHolder) entity).getInventory().clear(); //Cleanup the entities contains.
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void chunkEvent(ChunkUnloadEvent e) {
        e.setSaveChunk(false);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void chunkEvent(LootGenerateEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void chunkEvent(PortalCreateEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void chunkEvent(StructureGrowEvent e) {
        e.setCancelled(true);
    }

}
