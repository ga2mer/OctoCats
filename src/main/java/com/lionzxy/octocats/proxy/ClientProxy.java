package com.lionzxy.octocats.proxy;

import com.lionzxy.octocats.OctoCat;
import com.lionzxy.octocats.mobs.OctoCatBase;
import com.lionzxy.octocats.renders.OctoCatBaseRender;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

/**
 * Created by LionZXY on 27.12.2015.
 */
public class ClientProxy extends CommonProxy {

    public void registerRenderers()
    {
        super.registerRenderers();
        RenderingRegistry.registerEntityRenderingHandler(OctoCatBase.class, new OctoCatBaseRender(new ModelBiped(), 0.5F));
    }
}
