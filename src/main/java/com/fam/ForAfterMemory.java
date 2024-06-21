package com.fam;

import com.fam.block.TestBlocks;
import com.fam.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fam.item.TestItem;

public class ForAfterMemory implements ModInitializer {
	public static final String MOD_ID = "foraftermemory";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("For Time Machine Server Minecrafter!");
		LOGGER.info("Current Version : 0.0.1");
		ModItemGroups.registerItemGroups();
		TestItem.registerModItems();
		TestBlocks.registerBodBlocks();
	}
}