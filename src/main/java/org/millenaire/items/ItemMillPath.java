package org.millenaire.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import org.millenaire.blocks.BlockMillPath;

public class ItemMillPath extends ItemBlock {

    public ItemMillPath(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack stack) {
        return ((BlockMillPath) this.block).getUnlocalizedName(stack.getMetadata());
    }

    public int getMetadata(int damage) {
        return damage;
    }
}
