package gaborboy95.furnituremod.init;

import gaborboy95.furnituremod.Reference;
import gaborboy95.furnituremod.blocks.BlockTable;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.LinkedList;
import java.util.List;

public class GFMBlocks
{
    /* Initial release */
    public static Block table, barstool;

    public static void init()
    {
        table = new BlockTable(Material.WOOD, SoundType.WOOD).setUnlocalizedName("table_planks").setRegistryName("table_planks");
    }

    public static void register()
    {
        registerBlock(table);
    }

    public static void registerBlock(Block block)
    {
        registerBlock(block, new ItemBlock(block));
    }

    public static void registerRenders()
    {
        registerRender(table);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerBlock(Block block, ItemBlock item)
    {
        RegistrationHandler.BLOCKS.add(block);
        item.setRegistryName(block.getRegistryName());
        GFMItems.RegistrationHandler.ITEMS.add(item);
    }

    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    public static class RegistrationHandler
    {
        public static final List<Block> BLOCKS = new LinkedList<>();

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Block> event)
        {
            GFMBlocks.init();
            GFMBlocks.register();
            BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
        }
    }
}
