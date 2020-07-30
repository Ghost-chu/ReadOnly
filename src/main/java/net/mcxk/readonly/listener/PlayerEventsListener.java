package net.mcxk.readonly.listener;

import com.destroystokyo.paper.event.player.PlayerAdvancementCriterionGrantEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class PlayerEventsListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerAdvancementCriterionGrantEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerArmorStandManipulateEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerBedEnterEvent e) {
        e.setCancelled(true);
    }

    //    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
//    public void playerEvent(PlayerBucketEvent e) {
//        e.setCancelled(true);
//    }
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerBucketEmptyEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerBucketFillEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerDropItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerEditBookEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerEggThrowEvent e) {
        e.getEgg().remove();
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerExpChangeEvent e) {
        e.setAmount(0);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerFishEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerHarvestBlockEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerInteractAtEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerInteractEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerInteractEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerItemConsumeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerItemDamageEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerItemMendEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerPickupArrowEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerRecipeDiscoverEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerShearEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerStatisticIncrementEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerTakeLecternBookEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void playerEvent(PlayerUnleashEntityEvent e) {
        e.setCancelled(true);
    }

}
