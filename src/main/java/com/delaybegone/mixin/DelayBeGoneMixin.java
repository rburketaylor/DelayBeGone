package com.delaybegone.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public class DelayBeGoneMixin {
	@ModifyConstant(method = "isBlocking", constant = @Constant(intValue = 5))
	private int removeDelay(int delay){
		delay = 0;
		return delay;
	}
}