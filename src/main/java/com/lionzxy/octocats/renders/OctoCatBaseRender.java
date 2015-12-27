package com.lionzxy.octocats.renders;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by LionZXY on 27.12.2015.
 */
public class OctoCatBaseRender extends RenderBiped {
    private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/steve.png");

    public OctoCatBaseRender(ModelBiped model, float sizeTen) {
        super(model,sizeTen);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return textureLocation;
    }
}
