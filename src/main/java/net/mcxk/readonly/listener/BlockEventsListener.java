package net.mcxk.readonly.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;

public class BlockEventsListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockBreakEvent e) {
        if (e.getPlayer().isOp()) {
            return;
        }
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockPlaceEvent e) {
        if (e.getPlayer().isOp()) {
            return;
        }
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockBurnEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockCanBuildEvent e) {
        if (e.getPlayer() != null) {
            if (e.getPlayer().isOp()) {
                e.setBuildable(true);
                return;
            }
        }
        e.setBuildable(false);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockCookEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockDamageEvent e) {
        if (e.getPlayer().isOp()) {
            return;
        }
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockDispenseArmorEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockDispenseEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockDropItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockExpEvent e) {
        e.setExpToDrop(0);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockExplodeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockFadeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockFertilizeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockFormEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockFromToEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockGrowEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockRedstoneEvent e) {
        e.setNewCurrent(e.getOldCurrent());
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockIgniteEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockMultiPlaceEvent e) {
        if (e.getPlayer().isOp()) {
            return;
        }
        e.setBuild(false);
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockPhysicsEvent e) {
        e.setCancelled(true);
    }

    //    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
//    public void blockEvent(BlockPistonEvent e){
//        e.setCancelled(true);
//    }
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockPistonExtendEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockPistonRetractEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockShearEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(BlockSpreadEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(CauldronLevelChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(EntityBlockFormEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(FluidLevelChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(LeavesDecayEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(MoistureChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(NotePlayEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(SignChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void blockEvent(SpongeAbsorbEvent e) {
        e.setCancelled(true);
    }

}
