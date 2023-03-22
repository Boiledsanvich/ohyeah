
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.somerandomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.somerandomstuff.block.BlankblockBlock;
import net.mcreator.somerandomstuff.SomeRandomStuffMod;

public class SomeRandomStuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SomeRandomStuffMod.MODID);
	public static final RegistryObject<Block> BLANKBLOCK = REGISTRY.register("blankblock", () -> new BlankblockBlock());
}
