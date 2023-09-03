package net.trique.triqueapi;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriQueAPI implements ModInitializer {
	public static final String MOD_ID = "triqueapi";
    public static final Logger LOGGER = LoggerFactory.getLogger("triqueapi");

	@Override
	public void onInitialize() {
		LOGGER.info("TriQue API works properly! YUSUF REIS ANNENE SELAMLAR KARŞİM <3!");
	}
}