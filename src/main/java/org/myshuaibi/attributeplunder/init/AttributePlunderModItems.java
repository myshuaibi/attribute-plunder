/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.myshuaibi.attributeplunder.init;

import org.myshuaibi.attributeplunder.AttributePlunderMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class AttributePlunderModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AttributePlunderMod.MODID);
	public static final DeferredItem<Item> OMINOUS_SWORD = block(AttributePlunderModBlocks.OMINOUS_SWORD);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}