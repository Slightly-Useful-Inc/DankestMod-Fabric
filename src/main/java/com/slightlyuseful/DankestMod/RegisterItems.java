package com.slightlyuseful.DankestMod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import com.slightlyuseful.DankestMod.Armor.Cum;
import com.slightlyuseful.DankestMod.Armor.Graphite;

public class RegisterItems {
    
    
	public static final Item CUM_ICON = new Item(new FabricItemSettings());
	
	
	public static final ItemGroup DANKEST_GROUP = FabricItemGroupBuilder.create(new Identifier("dankestmod", "items")).icon(() -> new ItemStack(CUM_ICON)).build();
    



	public static final Item CUM = new Item(new FabricItemSettings()
		.maxCount(16)
		.food(new FoodComponent.Builder()
			.hunger(3)
			.saturationModifier(8.0f)
			.alwaysEdible()
			.statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000,98), .5f)
			.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 3000,98), 1)
			.build())
		.fireproof()
		.rarity(Rarity.EPIC)
		.group(DANKEST_GROUP)
	);


	public static final ArmorMaterial CUM_ARMOR = new Cum();
    public static final Item CUM_HELMET = new ArmorItem(CUM_ARMOR, EquipmentSlot.HEAD, new FabricItemSettings().group(DANKEST_GROUP));
    public static final Item CUM_CHESTPLATE = new ArmorItem(CUM_ARMOR, EquipmentSlot.CHEST, new FabricItemSettings().group(DANKEST_GROUP));
    public static final Item CUM_LEGGINGS = new ArmorItem(CUM_ARMOR, EquipmentSlot.LEGS, new FabricItemSettings().group(DANKEST_GROUP));
    public static final Item CUM_BOOTS = new ArmorItem(CUM_ARMOR, EquipmentSlot.FEET, new FabricItemSettings().group(DANKEST_GROUP));
	
	public static final Item SUNNY_SIDE_UP_EGG = new Item(new FabricItemSettings()
		.maxCount(16)
		.food(new FoodComponent.Builder()
			.hunger(8)
			.saturationModifier(12.8f)
			.statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,2),1)
			.alwaysEdible()
			.build()
		)
		.rarity(Rarity.UNCOMMON)
		.group(DANKEST_GROUP)
	);

	public static final Item EMERALD_EGG = new Item(new FabricItemSettings()
		.maxCount(16)
		.food(new FoodComponent.Builder()
			.hunger(8)
			.saturationModifier(12.8f)
			.statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,12000,2),1)
			.alwaysEdible()
			.build()
		)
		.rarity(Rarity.RARE)
		.group(DANKEST_GROUP)
	);
	

	public static final Item BLACK_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item WHITE_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item ORANGE_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item MAGENTA_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item LIGHT_BLUE_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item YELLOW_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item LIME_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item PINK_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item GRAY_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item LIGHT_GRAY_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item CYAN_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item PURPLE_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item BLUE_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item BROWN_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item GREEN_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));
	public static final Item RED_SOCK = new Item(new FabricItemSettings().maxCount(2).group(DANKEST_GROUP));


	public static final Item GRAPHITE = new Item(new FabricItemSettings().group(DANKEST_GROUP));
    public static final ArmorMaterial GRAPHITE_ARMOR = new Graphite();
    public static final Item GRAPHITE_HELMET = new ArmorItem(GRAPHITE_ARMOR, EquipmentSlot.HEAD, new FabricItemSettings().group(DANKEST_GROUP));
    public static final Item GRAPHITE_CHESTPLATE = new ArmorItem(GRAPHITE_ARMOR, EquipmentSlot.CHEST, new FabricItemSettings().group(DANKEST_GROUP));
    public static final Item GRAPHITE_LEGGINGS = new ArmorItem(GRAPHITE_ARMOR, EquipmentSlot.LEGS, new FabricItemSettings().group(DANKEST_GROUP));
    public static final Item GRAPHITE_BOOTS = new ArmorItem(GRAPHITE_ARMOR, EquipmentSlot.FEET, new FabricItemSettings().group(DANKEST_GROUP));
    



    public static void register() {
        
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "cum_icon"), CUM_ICON);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "cum"), CUM);
        CompostingChanceRegistry.INSTANCE.add(CUM, (float) 300);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "cum_helmet"), CUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "cum_chestplate"), CUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "cum_leggings"), CUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "cum_boots"), CUM_BOOTS);


		Registry.register(Registry.ITEM, new Identifier("dankestmod", "black_sock"), BLACK_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "white_sock"), WHITE_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "orange_sock"), ORANGE_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "magenta_sock"), MAGENTA_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "light_blue_sock"), LIGHT_BLUE_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "yellow_sock"), YELLOW_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "lime_sock"), LIME_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "pink_sock"), PINK_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "gray_sock"), GRAY_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "light_gray_sock"), LIGHT_GRAY_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "cyan_sock"), CYAN_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "purple_sock"), PURPLE_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "blue_sock"), BLUE_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "brown_sock"), BROWN_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "green_sock"), GREEN_SOCK);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "red_sock"), RED_SOCK);

		Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite"), GRAPHITE);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite_helmet"), GRAPHITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite_chestplate"), GRAPHITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite_leggings"), GRAPHITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("dankestmod", "graphite_boots"), GRAPHITE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier("dankestmod", "sunny_side_up_egg"), SUNNY_SIDE_UP_EGG);
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "emerald_egg"), EMERALD_EGG);
        
        
        
    }
}
