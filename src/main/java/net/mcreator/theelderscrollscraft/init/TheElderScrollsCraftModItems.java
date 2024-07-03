
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theelderscrollscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.theelderscrollscraft.item.SasaSwordItem;
import net.mcreator.theelderscrollscraft.item.SasaShovelItem;
import net.mcreator.theelderscrollscraft.item.SasaPickaxeItem;
import net.mcreator.theelderscrollscraft.item.SasaHoeItem;
import net.mcreator.theelderscrollscraft.item.SasaAxeItem;
import net.mcreator.theelderscrollscraft.item.SasaArmorItem;
import net.mcreator.theelderscrollscraft.TheElderScrollsCraftMod;

public class TheElderScrollsCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheElderScrollsCraftMod.MODID);
	public static final RegistryObject<Item> SASA_BLOCK = block(TheElderScrollsCraftModBlocks.SASA_BLOCK);
	public static final RegistryObject<Item> SASA_PICKAXE = REGISTRY.register("sasa_pickaxe", () -> new SasaPickaxeItem());
	public static final RegistryObject<Item> SASA_AXE = REGISTRY.register("sasa_axe", () -> new SasaAxeItem());
	public static final RegistryObject<Item> SASA_SWORD = REGISTRY.register("sasa_sword", () -> new SasaSwordItem());
	public static final RegistryObject<Item> SASA_SHOVEL = REGISTRY.register("sasa_shovel", () -> new SasaShovelItem());
	public static final RegistryObject<Item> SASA_HOE = REGISTRY.register("sasa_hoe", () -> new SasaHoeItem());
	public static final RegistryObject<Item> SASA_ARMOR_HELMET = REGISTRY.register("sasa_armor_helmet", () -> new SasaArmorItem.Helmet());
	public static final RegistryObject<Item> SASA_ARMOR_CHESTPLATE = REGISTRY.register("sasa_armor_chestplate", () -> new SasaArmorItem.Chestplate());
	public static final RegistryObject<Item> SASA_ARMOR_LEGGINGS = REGISTRY.register("sasa_armor_leggings", () -> new SasaArmorItem.Leggings());
	public static final RegistryObject<Item> SASA_ARMOR_BOOTS = REGISTRY.register("sasa_armor_boots", () -> new SasaArmorItem.Boots());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
