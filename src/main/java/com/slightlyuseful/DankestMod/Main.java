package com.slightlyuseful.DankestMod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("dankestmod");
	
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
		.rarity(Rarity.EPIC));
	

	public static final Item BLACK_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item WHITE_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item ORANGE_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item MAGENTA_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item LIGHT_BLUE_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item YELLOW_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item LIME_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item PINK_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item GRAY_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item LIGHT_GRAY_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item CYAN_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item PURPLE_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item BLUE_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item BROWN_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item GREEN_SOCK = new Item(new FabricItemSettings().maxCount(2));
	public static final Item RED_SOCK = new Item(new FabricItemSettings().maxCount(2));

	public static final Item GRAPHITE = new Item(new FabricItemSettings());
	
	public static final ItemGroup DANKEST_GROUP = FabricItemGroupBuilder.create(
		new Identifier("dankestmod", "items"))
		.icon(() -> new ItemStack(CUM))
		.appendItems(stacks -> {
			stacks.add(new ItemStack(CUM));
			stacks.add(new ItemStack(BLACK_SOCK));
			stacks.add(new ItemStack(WHITE_SOCK));
			stacks.add(new ItemStack(ORANGE_SOCK));
			stacks.add(new ItemStack(MAGENTA_SOCK));
			stacks.add(new ItemStack(LIGHT_BLUE_SOCK));
			stacks.add(new ItemStack(YELLOW_SOCK));
			stacks.add(new ItemStack(LIME_SOCK));
			stacks.add(new ItemStack(PINK_SOCK));
			stacks.add(new ItemStack(GRAY_SOCK));
			stacks.add(new ItemStack(LIGHT_GRAY_SOCK));
			stacks.add(new ItemStack(CYAN_SOCK));
			stacks.add(new ItemStack(PURPLE_SOCK));
			stacks.add(new ItemStack(BLUE_SOCK));
			stacks.add(new ItemStack(BROWN_SOCK));
			stacks.add(new ItemStack(GREEN_SOCK));
			stacks.add(new ItemStack(RED_SOCK));
			stacks.add(new ItemStack(GRAPHITE));
		})
		.build();

	



	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("dankestmod", "cum"), CUM);

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


		CompostingChanceRegistry.INSTANCE.add(CUM, (float) 300);
		LOGGER.info("DankestMod initialized.");
	}
}
