package net.mcxk.readonly.listener;

import org.bukkit.Material;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class InventoryEventsListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(BrewEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(BrewingStandFuelEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(CraftItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(FurnaceBurnEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(FurnaceExtractEvent e) {
        e.setExpToDrop(0);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(FurnaceSmeltEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) {
            return;
        }
        if (e.getClickedInventory() instanceof PlayerInventory) {
            return;
        }
        if (e.getClickedInventory().getLocation() == null) {  //Plugin GUI
            return;
        }
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(InventoryCreativeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(InventoryDragEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(InventoryInteractEvent e) {
        if (e.getInventory() instanceof PlayerInventory) {
            return;
        }
        if (e.getInventory().getLocation() == null) {  //Plugin GUI
            return;
        }
        e.setCancelled(true);
        e.setResult(Event.Result.DENY);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(InventoryMoveItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(InventoryOpenEvent e) {
        if (e.getInventory() instanceof PlayerInventory) {
            return;
        }
        if (e.getInventory().getLocation() == null) {
            return;
        }
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(InventoryPickupItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(PrepareAnvilEvent e) {
        e.setResult(new ItemStack(Material.AIR));
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void inventoryEvent(TradeSelectEvent e) {
        e.setCancelled(true);
    }

}
