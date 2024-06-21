package com.fam.item;

import com.fam.ForAfterMemory;
import com.fam.block.TestBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ForAfterMemory.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(TestItem.Ruby)).entries(((displayContext, entries) -> {
                        entries.add((TestItem.Ruby));
                        entries.add((TestItem.Raw_Ruby));

                        entries.add(TestBlocks.RUBY_BLOCK);

                        entries.add(Items.DIAMOND);
                    })).build());

    public static void registerItemGroups() {
        ForAfterMemory.LOGGER.info("Registering Item Groups for " + ForAfterMemory.MOD_ID);
    }
}
