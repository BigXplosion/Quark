/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [18/04/2016, 22:56:01 (GMT)]
 */
package vazkii.quark.building.block.slab;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import vazkii.quark.base.block.BlockModSlab;

public class BlockSnowBricksSlab extends BlockModSlab {

	public BlockSnowBricksSlab(boolean doubleSlab) {
		super("snow_bricks_slab", Material.CRAFTED_SNOW, doubleSlab);
		setHardness(0.2F);
		setSoundType(SoundType.SNOW);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
	public boolean isToolEffective(String type, IBlockState state) {
		return type.equals("shovel");
	}
	
	@Override
	public boolean canHarvestBlock(IBlockAccess world, BlockPos pos, EntityPlayer player) {
		return true;
	}

}
