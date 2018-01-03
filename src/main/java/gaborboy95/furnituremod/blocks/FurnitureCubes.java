package gaborboy95.furnituremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

public class FurnitureCubes extends Block{

	public FurnitureCubes(Material materialIn) {
		super(materialIn);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
			
	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
}
