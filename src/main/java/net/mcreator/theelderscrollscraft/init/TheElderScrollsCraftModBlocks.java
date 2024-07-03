
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theelderscrollscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theelderscrollscraft.block.SasaBlockBlock;
import net.mcreator.theelderscrollscraft.block.SADSAWoodBlock;
import net.mcreator.theelderscrollscraft.block.SADSAStairsBlock;
import net.mcreator.theelderscrollscraft.block.SADSASlabBlock;
import net.mcreator.theelderscrollscraft.block.SADSAPressurePlateBlock;
import net.mcreator.theelderscrollscraft.block.SADSAPlanksBlock;
import net.mcreator.theelderscrollscraft.block.SADSALogBlock;
import net.mcreator.theelderscrollscraft.block.SADSALeavesBlock;
import net.mcreator.theelderscrollscraft.block.SADSAFenceGateBlock;
import net.mcreator.theelderscrollscraft.block.SADSAFenceBlock;
import net.mcreator.theelderscrollscraft.block.SADSAButtonBlock;
import net.mcreator.theelderscrollscraft.TheElderScrollsCraftMod;

public class TheElderScrollsCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheElderScrollsCraftMod.MODID);
	public static final RegistryObject<Block> SASA_BLOCK = REGISTRY.register("sasa_block", () -> new SasaBlockBlock());
	public static final RegistryObject<Block> SADSA_WOOD = REGISTRY.register("sadsa_wood", () -> new SADSAWoodBlock());
	public static final RegistryObject<Block> SADSA_LOG = REGISTRY.register("sadsa_log", () -> new SADSALogBlock());
	public static final RegistryObject<Block> SADSA_PLANKS = REGISTRY.register("sadsa_planks", () -> new SADSAPlanksBlock());
	public static final RegistryObject<Block> SADSA_LEAVES = REGISTRY.register("sadsa_leaves", () -> new SADSALeavesBlock());
	public static final RegistryObject<Block> SADSA_STAIRS = REGISTRY.register("sadsa_stairs", () -> new SADSAStairsBlock());
	public static final RegistryObject<Block> SADSA_SLAB = REGISTRY.register("sadsa_slab", () -> new SADSASlabBlock());
	public static final RegistryObject<Block> SADSA_FENCE = REGISTRY.register("sadsa_fence", () -> new SADSAFenceBlock());
	public static final RegistryObject<Block> SADSA_FENCE_GATE = REGISTRY.register("sadsa_fence_gate", () -> new SADSAFenceGateBlock());
	public static final RegistryObject<Block> SADSA_PRESSURE_PLATE = REGISTRY.register("sadsa_pressure_plate", () -> new SADSAPressurePlateBlock());
	public static final RegistryObject<Block> SADSA_BUTTON = REGISTRY.register("sadsa_button", () -> new SADSAButtonBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
