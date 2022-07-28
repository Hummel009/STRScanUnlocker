package unlocker;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import lotr.common.command.LOTRCommandStrScan;

@Mod(modid = "unlocker", dependencies = "required-after:lotr")
public class STRScanUnlocker {
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		e.registerServerCommand(new LOTRCommandStrScan());
	}
}
