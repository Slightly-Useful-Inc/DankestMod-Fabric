package com.slightlyuseful.DankestMod.Tools;

import com.slightlyuseful.DankestMod.RegisterItems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GraphiteTools implements ToolMaterial{
    

    public static final GraphiteTools INSTANCE = new GraphiteTools();

    @Override
    public int getDurability() {
        return 33;
    }

    @Override
    public float getAttackDamage() {
        return 7.0F;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.GRAPHITE);
    }
}
