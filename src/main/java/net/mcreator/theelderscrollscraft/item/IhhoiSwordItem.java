
package net.mcreator.theelderscrollscraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.theelderscrollscraft.init.TheElderScrollsCraftModItems;

public class IhhoiSwordItem extends SwordItem {
	public IhhoiSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
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
		}, 3, -1f, new Item.Properties());
	}
}
