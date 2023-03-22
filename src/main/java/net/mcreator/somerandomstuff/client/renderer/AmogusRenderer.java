
package net.mcreator.somerandomstuff.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.somerandomstuff.entity.AmogusEntity;
import net.mcreator.somerandomstuff.client.model.Modelamogus;

public class AmogusRenderer extends MobRenderer<AmogusEntity, Modelamogus<AmogusEntity>> {
	public AmogusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelamogus(context.bakeLayer(Modelamogus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AmogusEntity entity) {
		return new ResourceLocation("some_random_stuff:textures/entities/amogustexture.png");
	}
}
