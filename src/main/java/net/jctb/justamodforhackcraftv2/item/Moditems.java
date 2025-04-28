//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jctb.justamodforhackcraftv2.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> STEEL;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "justamodforhackcraftv2");
        STEEL = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    }
}
