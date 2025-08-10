package org.myshuaibi.attributeplunder.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class OminousSwordBlock extends PressurePlateBlock {
	public OminousSwordBlock() {
		super(BlockSetType.IRON,
				BlockBehaviour.Properties.of().mapColor(MapColor.NONE)
						.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.composter.empty")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.composter.empty")),
								() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.composter.empty")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.composter.empty")),
								() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.composter.empty"))))
						.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape().forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}