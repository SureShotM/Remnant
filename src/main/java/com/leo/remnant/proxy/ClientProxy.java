package com.leo.remnant.proxy;


import com.leo.remnant.init.ModItems;
import com.leo.remnant.utility.helper.ItemRenderHelper;

public class ClientProxy extends CommonProxy{


    @Override
    public void preInit() {
        super.preInit();
        ItemRenderHelper.preInit();
    }


    @Override
    public void init() {
        super.init();
        ItemRenderHelper.registerItemRenderer();
    }

    @Override
    public void postInit() {
        super.postInit();
    }
}
