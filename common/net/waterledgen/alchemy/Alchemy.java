package net.waterledgen.alchemy;

 import java.util.Random;
 
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Alchemy.MOD_ID, name = Alchemy.MOD_NAME, version = Alchemy.VERSION, dependencies = Alchemy.DEPENDENCIES )
public class Alchemy {
	//Constants
	public static final String MOD_ID = "alchemy";
	public static final String MOD_NAME = "Novus Apothicarium";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[14.23.4.2708]";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase()+":";

	//Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static Alchemy instance;
	
	@SidedProxy(clientSide = "net.waterledgen.alchemy.ClientProxy", serverSide = "net.waterledgen.alchemy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.Init(event);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
