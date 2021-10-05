package io.github.gaming32.beta_hardness.mixin;

import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.gaming32.beta_hardness.BlockHardnessMod;

@Mixin(Blocks.class)
public abstract class BlocksMixin {
	@Inject(at = @At("HEAD"), method = "<clinit>()V")
	private static void init(CallbackInfo info) {
		BlockHardnessMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
