package gaborboy95.furnituremod.init;

import gaborboy95.furnituremod.Furnituremod;
import gaborboy95.furnituremod.Reference;
import gaborboy95.furnituremod.blocks.FurnitureCubes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnitureBlocks {
	public static Block barstool_block;
	public static Block table;
	public static Block laptop;
	
	public static void init()
	{
		barstool_block = new FurnitureCubes(Material.iron).setUnlocalizedName("barstool_block").setCreativeTab(Furnituremod.tabFurniture);
		table = new FurnitureCubes(Material.wood).setUnlocalizedName("table").setCreativeTab(Furnituremod.tabFurniture);
		laptop = new FurnitureCubes(Material.anvil).setUnlocalizedName("Laptop").setCreativeTab(Furnituremod.tabFurniture);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(barstool_block, barstool_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(table, table.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(laptop, laptop.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(barstool_block);
		registerRender(table);
		registerRender(laptop);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
