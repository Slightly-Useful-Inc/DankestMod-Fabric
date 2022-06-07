package com.slightlyuseful.DankestMod.Tools;


import com.slightlyuseful.DankestMod.RegisterItems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CumTools implements ToolMaterial{
    

    public static final CumTools INSTANCE = new CumTools();

    @Override
    public int getDurability() {
        return 1700;
    }

    @Override
    public float getAttackDamage() {
        return 14.0F;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public int getMiningLevel() {
        return 8;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 20.0F;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.CUM);
    }
}
