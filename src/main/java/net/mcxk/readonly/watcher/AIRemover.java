package net.mcxk.readonly.watcher;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class AIRemover extends BukkitRunnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        Bukkit.getWorlds().forEach(world -> world.getEntities().forEach(entity -> {
            if (!(entity instanceof LivingEntity)) {
                return;
            }
            if (entity instanceof Player) {
                ((Player) entity).sendActionBar(ChatColor.YELLOW + "You are in the archive server!");
                return;
            }
            LivingEntity livingEntity = (LivingEntity) entity;
            if (livingEntity.hasAI()) {
                livingEntity.setAI(false);
            }
            if (livingEntity.hasGravity()) {
                livingEntity.setGravity(false);
            }
            if (livingEntity.isDead()) {
                livingEntity.remove();
            }
            if (!livingEntity.isSilent()) {
                livingEntity.setSilent(true);
            }
            if (livingEntity.getArrowsStuck() != 0) {
                livingEntity.setArrowsStuck(0);
            }
            if (livingEntity.getCanPickupItems()) {
                livingEntity.setCanPickupItems(false);
            }
        }));
    }
}
