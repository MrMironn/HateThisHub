
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theelderscrollscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theelderscrollscraft.block.SasaBlockBlock;
import net.mcreator.theelderscrollscraft.TheElderScrollsCraftMod;

public class TheElderScrollsCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheElderScrollsCraftMod.MODID);
	public static final RegistryObject<Block> SASA_BLOCK = REGISTRY.register("sasa_block", () -> new SasaBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
