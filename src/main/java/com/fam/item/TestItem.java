package com.fam.item;

import com.fam.ForAfterMemory;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class TestItem extends Item {
    public TestItem(Settings settings) {
        super(settings);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ForAfterMemory.MOD_ID, name), item);
    }

    public static final Item Ruby = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item Raw_Ruby = registerItem("raw_ruby", new Item(new Item.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(Ruby);
        entries.add(Raw_Ruby);
    }

    public static void registerModItems() {
        ForAfterMemory.LOGGER.info("Registering Mod Items for " + ForAfterMemory.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(TestItem::addItemsToIngredientTabItemGroup);
    }
}
