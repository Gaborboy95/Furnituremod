package gaborboy95.furnituremod;

import gaborboy95.furnituremod.init.FurnitureBlocks;
import gaborboy95.furnituremod.init.FurnitureItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FurnitureTab extends CreativeTabs{

	public FurnitureTab(String label) {
		super(label);
	}
	
	@Override
	public Item getTabIconItem() {
		return FurnitureItems.coin_item;
	}

}
