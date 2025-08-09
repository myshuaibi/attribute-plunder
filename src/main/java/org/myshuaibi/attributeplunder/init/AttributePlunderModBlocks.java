/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.myshuaibi.attributeplunder.init;

import org.myshuaibi.attributeplunder.block.OminousSwordBlock;
import org.myshuaibi.attributeplunder.AttributePlunderMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class AttributePlunderModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AttributePlunderMod.MODID);
	public static final DeferredBlock<Block> OMINOUS_SWORD = REGISTRY.register("ominous_sword", OminousSwordBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}