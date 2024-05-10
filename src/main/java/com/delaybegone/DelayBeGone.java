package com.delaybegone;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DelayBeGone implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("delaybegone");

	@Override
	public void onInitialize() {
		LOGGER.info("DelayBeGone is initializing!");
	}
}