package com.lionzxy.octocats.helpers;

import com.lionzxy.octocats.OctoCat;
import com.lionzxy.octocats.mobs.OctoCatBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

/**
 * Created by LionZXY on 27.12.2015.
 */
public class EntityHelper {

    public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor)
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.registerModEntity(entityClass, name, entityID, OctoCat.INSTANCE, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID,         primaryColor, secondaryColor));
    }
}
