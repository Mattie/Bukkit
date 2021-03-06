package org.bukkit.entity;

import org.bukkit.inventory.ItemStack;

/**
 * Represents a dropped item.
 * 
 * @author sk89q
 */
public interface ItemDrop extends Entity {
    /**
     * Gets the item stack.
     * 
     * @return
     */
    public ItemStack getItemStack();
}
