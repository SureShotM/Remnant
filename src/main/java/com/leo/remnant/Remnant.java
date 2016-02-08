package com.leo.remnant;

import com.leo.remnant.init.ModItems;
import com.leo.remnant.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "remnant", name = "Remnant(Dust)", version = "1.0.0")
public class Remnant {

    @SidedProxy(clientSide="com.leo.remnant.proxy.ClientProxy", serverSide="com.leo.remnant.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();

        proxy.preInit();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
    }

}
