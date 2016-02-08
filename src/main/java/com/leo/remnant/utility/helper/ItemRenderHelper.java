package com.leo.remnant.utility.helper;


import com.leo.remnant.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderHelper {
    public static void preInit() {
        ModelBakery.addVariantName(ModItems.dust, "remnant:dustwhite");
    }

    public static void registerItemRenderer(){
        reg(ModItems.dust,0,"dustblue");
        reg(ModItems.dust,1,"dustorange");
        reg(ModItems.dust,2,"dustbrown");
        reg(ModItems.dust,3,"dustwhite");
    }


    public static void reg(Item item, int meta,String file) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, meta, new ModelResourceLocation("remnant" + ":" + file, "inventory"));
    }
}
