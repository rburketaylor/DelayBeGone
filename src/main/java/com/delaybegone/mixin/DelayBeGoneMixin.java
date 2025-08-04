package com.delaybegone.mixin;

import net.minecraft.component.type.BlocksAttacksComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BlocksAttacksComponent.class)
public class DelayBeGoneMixin {
	/**
	 * @reason Remove block attack delay to improve combat responsiveness
	 * @author DelayBeGone
	 */
	@Overwrite
	public int getBlockDelayTicks() {
		return 0;
	}
}