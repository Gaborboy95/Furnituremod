package gaborboy95.furnituremod.proxy;

import gaborboy95.furnituremod.init.FurnitureBlocks;
import gaborboy95.furnituremod.init.FurnitureItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		FurnitureBlocks.registerRenders();
		FurnitureItems.registerRenders();
	}
}
