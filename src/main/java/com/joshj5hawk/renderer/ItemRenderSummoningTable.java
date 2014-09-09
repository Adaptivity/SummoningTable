package com.joshj5hawk.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemRenderSummoningTable implements IItemRenderer
{

	TileEntitySpecialRenderer render;
	private TileEntity entity;
	
	public ItemRenderSummoningTable(TileEntitySpecialRenderer render, TileEntity entity)
	{
	}
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		if(type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON)
		{
			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
		}
	}

}
