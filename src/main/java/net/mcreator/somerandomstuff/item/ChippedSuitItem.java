
package net.mcreator.somerandomstuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ChippedSuitItem extends Item {
	public ChippedSuitItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
