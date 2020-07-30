package net.mcxk.readonly.listener;

import com.destroystokyo.paper.event.entity.ProjectileCollideEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;

public class EntityEventsListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(AreaEffectCloudApplyEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(BatToggleSleepEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(CreatureSpawnEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(CreeperPowerEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EnderDragonChangePhaseEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityAirChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityBreakDoorEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityBreedEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityChangeBlockEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityCombustByBlockEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityCombustByEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityCombustEvent e) {
        e.setCancelled(true);
    }

    //    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
//    public void entityEvent(EntityCreatePortalEvent e){
//        e.setCancelled(true);
//    }
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityDamageEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityDamageByEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityDamageByBlockEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityDeathEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityDropItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityEnterBlockEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityEnterLoveModeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityExplodeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityInteractEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityPickupItemEvent e) {
        e.setCancelled(true);
    }

    //    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
//    public void entityEvent(EntityPlaceEvent e){
//        e.setCancelled(true);
//    }
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityPotionEffectEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityRegainHealthEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityResurrectEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityShootBowEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntitySpawnEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityTameEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityTargetEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityTargetLivingEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityTeleportEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityToggleGlideEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityToggleSwimEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(EntityTransformEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(ExpBottleEvent e) {
        e.setExperience(0);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(ExplosionPrimeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(FireworkExplodeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(HorseJumpEvent e) {
        e.setCancelled(true);
        e.setPower(0.0F);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(ItemDespawnEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(ItemMergeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(ItemSpawnEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(LingeringPotionSplashEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(PigZapEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(PigZombieAngerEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(PlayerDeathEvent e) {
        e.setCancelled(true);
        e.getEntity().setHealth(20);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(PlayerLeashEntityEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(PotionSplashEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(ProjectileCollideEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(ProjectileLaunchEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(SheepDyeWoolEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(SheepRegrowWoolEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(SlimeSplitEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(SpawnerSpawnEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(VillagerAcquireTradeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(VillagerCareerChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void entityEvent(VillagerReplenishTradeEvent e) {
        e.setCancelled(true);
    }
}

