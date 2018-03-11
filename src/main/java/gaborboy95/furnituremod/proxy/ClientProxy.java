package gaborboy95.furnituremod.proxy;

import gaborboy95.furnituremod.Reference;
import gaborboy95.furnituremod.init.GFMBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
    public static boolean rendering = false;
    public static Entity renderEntity = null;
    public static Entity backupEntity = null;

    @Override
    public EntityPlayer getClientPlayer()
    {
        return Minecraft.getMinecraft().player;
    }

    @Override
    public boolean isSinglePlayer()
    {
        return Minecraft.getMinecraft().isSingleplayer();
    }

    @Override
    public boolean isDedicatedServer()
    {
        return false;
    }

    @Override
    public void preInit()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            GFMBlocks.registerRenders();
        }
    }
}
