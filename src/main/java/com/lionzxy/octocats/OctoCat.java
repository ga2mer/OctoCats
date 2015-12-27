package com.lionzxy.octocats;

import com.lionzxy.octocats.helpers.EntityHelper;
import com.lionzxy.octocats.mobs.OctoCatBase;
import com.lionzxy.octocats.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;

/**
 * Created by LionZXY on 27.12.2015.
 */

@Mod(modid = OctoCat.MODID, version = OctoCat.VERSION)
public class OctoCat {

    public static final String MODID = "octocat";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "com.lionzxy.octocats.proxy.ClientProxy", serverSide = "com.lionzxy.octocats.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static OctoCat INSTANCE = new OctoCat();

    @Mod.EventHandler

    public void init(FMLInitializationEvent event) {
        EntityHelper.registerEntity(OctoCatBase.class,"octoCatBase",0x00FFFF, 0x00008B);
    }


}
