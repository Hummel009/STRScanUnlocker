package com.github.hummel.strscan;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import lotr.common.command.LOTRCommandStrScan;

@Mod(modid = "strscan", dependencies = "required-after:lotr", useMetadata = true)
public class Main {
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		e.registerServerCommand(new LOTRCommandStrScan());
	}
}