package com.slightlyuseful.DankestMod.Armor;

import com.slightlyuseful.DankestMod.RegisterItems;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;


public class CumArmor implements ArmorMaterial{
    
    private static final int[] BASE_DURABILITY = new int[] {11,16,15,13};
    private static final int[] PROTECTION_VALUES = new int[] {6,16,12,6};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 40;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability(){
        return 50;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_BUCKET_EMPTY;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.CUM);
    }

    @Override
    public String getName() {
        return "cum";
    }

    @Override
    public float getToughness() {
        return 10F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0F;
    }

}
