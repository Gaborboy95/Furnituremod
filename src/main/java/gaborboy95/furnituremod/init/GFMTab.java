package gaborboy95.furnituremod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GFMTab extends CreativeTabs
{
    private String title = "";
    private boolean hoveringButton = false;

    public GFMTab(String label)
    {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(GFMBlocks.table);
    }

    @Override
    public String getTranslatedTabLabel()
    {
        return hoveringButton ? title : "itemGroup.tabGfmFurniture";
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setHoveringButton(boolean hoveringButton)
    {
        this.hoveringButton = hoveringButton;
    }
}
