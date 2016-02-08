package com.leo.remnant.init;

import com.leo.remnant.Remnant;
import com.leo.remnant.item.DustItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item dust = new DustItem();

    public static void init() {
        GameRegistry.registerItem(dust);
    }


}



