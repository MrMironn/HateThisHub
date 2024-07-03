
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theelderscrollscraft.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.theelderscrollscraft.TheElderScrollsCraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheElderScrollsCraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheElderScrollsCraftMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TheElderScrollsCraftModBlocks.SASA_BLOCK.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_WOOD.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_LOG.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_PLANKS.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_STAIRS.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_SLAB.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_FENCE.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_FENCE_GATE.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_PRESSURE_PLATE.get().asItem());
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheElderScrollsCraftModItems.SASA_SWORD.get());
			tabData.accept(TheElderScrollsCraftModItems.SASA_ARMOR_HELMET.get());
			tabData.accept(TheElderScrollsCraftModItems.SASA_ARMOR_CHESTPLATE.get());
			tabData.accept(TheElderScrollsCraftModItems.SASA_ARMOR_LEGGINGS.get());
			tabData.accept(TheElderScrollsCraftModItems.SASA_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheElderScrollsCraftModItems.SASA_PICKAXE.get());
			tabData.accept(TheElderScrollsCraftModItems.SASA_AXE.get());
			tabData.accept(TheElderScrollsCraftModItems.SASA_SHOVEL.get());
			tabData.accept(TheElderScrollsCraftModItems.SASA_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TheElderScrollsCraftModBlocks.SADSA_LEAVES.get().asItem());
		}
	}
}
