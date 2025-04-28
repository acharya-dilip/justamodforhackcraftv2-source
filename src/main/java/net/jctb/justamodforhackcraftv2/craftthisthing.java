//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jctb.justamodforhackcraftv2;

import com.mojang.logging.LogUtils;
import net.jctb.justamodforhackcraftv2.block.ModBlocks;
import net.jctb.justamodforhackcraftv2.item.Moditems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("justamodforhackcraftv2")
public class craftthisthing {
    public static final String MOD_ID = "justamodforhackcraftv2";
    public static final Logger LOGGER = LogUtils.getLogger();

    public craftthisthing() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        Moditems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(Moditems.STEEL);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.STEEL_BLOCK);
            event.accept(ModBlocks.STEEL_BLOCK_REINFORCED);
            event.accept(ModBlocks.STEEL_CASING);
            event.accept(ModBlocks.STEEL_GIRDLE);
            event.accept(ModBlocks.STEEL_LAMP);
            event.accept(ModBlocks.STEEL_LAMP_GREEN);
            event.accept(ModBlocks.STEEL_LAMP_PURPLE);
            event.accept(ModBlocks.STEEL_LAMP_RED);
        }

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
