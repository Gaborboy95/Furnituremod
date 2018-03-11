package gaborboy95.furnituremod.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy implements ProxyInterface
{
    public World getClientWorld()
    {
        return null;
    }

    public EntityPlayer getClientPlayer()
    {
        return null;
    }

    @Override
    public boolean isSinglePlayer()
    {
        return false;
    }

    @Override
    public boolean isDedicatedServer()
    {
        return true;
    }

    @Override
    public void preInit()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
