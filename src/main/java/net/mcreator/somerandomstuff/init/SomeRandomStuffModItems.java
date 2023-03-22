
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.somerandomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.somerandomstuff.item.MeltedSuitItem;
import net.mcreator.somerandomstuff.item.ChippedSuitItem;
import net.mcreator.somerandomstuff.item.Amogus_ArmorArmorItem;
import net.mcreator.somerandomstuff.item.AmogusPlateItem;
import net.mcreator.somerandomstuff.SomeRandomStuffMod;

public class SomeRandomStuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SomeRandomStuffMod.MODID);
	public static final RegistryObject<Item> AMOGUS = REGISTRY.register("amogus_spawn_egg",
			() -> new ForgeSpawnEggItem(SomeRandomStuffModEntities.AMOGUS, -65536, -3407872, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHIPPED_SUIT = REGISTRY.register("chipped_suit", () -> new ChippedSuitItem());
	public static final RegistryObject<Item> BLANKBLOCK = block(SomeRandomStuffModBlocks.BLANKBLOCK, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> MELTED_SUIT = REGISTRY.register("melted_suit", () -> new MeltedSuitItem());
	public static final RegistryObject<Item> AMOGUS_PLATE = REGISTRY.register("amogus_plate", () -> new AmogusPlateItem());
	public static final RegistryObject<Item> AMOGUS_ARMOR_ARMOR_HELMET = REGISTRY.register("amogus_armor_armor_helmet",
			() -> new Amogus_ArmorArmorItem.Helmet());
	public static final RegistryObject<Item> AMOGUS_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("amogus_armor_armor_chestplate",
			() -> new Amogus_ArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> AMOGUS_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("amogus_armor_armor_leggings",
			() -> new Amogus_ArmorArmorItem.Leggings());
	public static final RegistryObject<Item> AMOGUS_ARMOR_ARMOR_BOOTS = REGISTRY.register("amogus_armor_armor_boots",
			() -> new Amogus_ArmorArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
