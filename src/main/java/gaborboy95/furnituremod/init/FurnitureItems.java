package gaborboy95.furnituremod.init;

import gaborboy95.furnituremod.Furnituremod;
import gaborboy95.furnituremod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnitureItems {
	
	public static Item coin_item;
	
	public static void init() {
		coin_item = new Item().setUnlocalizedName("coin_item").setCreativeTab(Furnituremod.tabFurniture);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(coin_item, coin_item.getUnlocalizedName().substring(5));//"tile.coin_item"
	}
	
	public static void registerRenders()
	{
		registerRender(coin_item);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
