package gaborboy95.furnituremod;

import gaborboy95.furnituremod.init.FurnitureBlocks;
import gaborboy95.furnituremod.init.FurnitureItems;
import gaborboy95.furnituremod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Furnituremod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final  FurnitureTab tabFurniture = new FurnitureTab("tabFurniture");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		FurnitureBlocks.init();
		FurnitureBlocks.register();
		FurnitureItems.init();
		FurnitureItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
