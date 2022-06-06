package com.slightlyuseful.DankestMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.slightlyuseful.DankestMod.Armor.Graphite;

public class RegisterItems {
    public static final ArmorMaterial GRAPHITE_ARMOR = new Graphite();
    public static final Item GRAPHITE_HELMET = new ArmorItem(GRAPHITE_ARMOR, EquipmentSlot.HEAD, new FabricItemSettings().group(Main.DANKEST_GROUP));
    public static final Item GRAPHITE_CHESTPLATE = new ArmorItem(GRAPHITE_ARMOR, EquipmentSlot.CHEST, new FabricItemSettings().group(Main.DANKEST_GROUP));
    public static final Item GRAPHITE_LEGGINGS = new ArmorItem(GRAPHITE_ARMOR, EquipmentSlot.LEGS, new FabricItemSettings().group(Main.DANKEST_GROUP));
    public static final Item GRAPHITE_BOOTS = new ArmorItem(GRAPHITE_ARMOR, EquipmentSlot.FEET, new FabricItemSettings().group(Main.DANKEST_GROUP));



    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite_helmet"), GRAPHITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite_chestplate"), GRAPHITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite_leggings"), GRAPHITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite_boots"), GRAPHITE_BOOTS);
    }
}
