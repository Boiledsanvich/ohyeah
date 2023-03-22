
package net.mcreator.somerandomstuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class AmogusPlateItem extends Item {
	public AmogusPlateItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.EPIC));
	}
}
