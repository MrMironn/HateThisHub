
package net.mcreator.theelderscrollscraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.theelderscrollscraft.init.TheElderScrollsCraftModItems;

public class IhhoiHoeItem extends HoeItem {
	public IhhoiHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheElderScrollsCraftModItems.IHHOI.get()));
			}
		}, 0, -1f, new Item.Properties());
	}
}
