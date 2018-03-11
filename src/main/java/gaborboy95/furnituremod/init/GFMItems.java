package gaborboy95.furnituremod.init;

import gaborboy95.furnituremod.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.LinkedList;
import java.util.List;

public class GFMItems
{
    /* No current items... */

    public static void register()
    {

    }
    public static void init()
    {

    }

    public static void registerItem(Item item)
    {
        RegistrationHandler.ITEMS.add(item);
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    public static class RegistrationHandler
    {
        public static final List<Item> ITEMS = new LinkedList<>();

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event)
        {
            GFMItems.init();
            GFMItems.register();
            ITEMS.stream().forEach(item -> event.getRegistry().register(item));
        }
    }
}
