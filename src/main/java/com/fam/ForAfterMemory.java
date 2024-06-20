package com.fam;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForAfterMemory implements ModInitializer {
	public static final String MOD_ID = "foraftermemory";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("For Time Machine Server Minecrafter!");
	}
}