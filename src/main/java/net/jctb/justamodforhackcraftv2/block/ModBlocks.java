//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.jctb.justamodforhackcraftv2.block;

import java.util.function.Supplier;
import net.jctb.justamodforhackcraftv2.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS;
    public static final RegistryObject<Block> STEEL_BLOCK;
    public static final RegistryObject<Block> STEEL_BLOCK_REINFORCED;
    public static final RegistryObject<Block> STEEL_CASING;
    public static final RegistryObject<Block> STEEL_GIRDLE;
    public static final RegistryObject<Block> STEEL_LAMP;
    public static final RegistryObject<Block> STEEL_LAMP_GREEN;
    public static final RegistryObject<Block> STEEL_LAMP_RED;
    public static final RegistryObject<Block> STEEL_LAMP_PURPLE;

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        Moditems.ITEMS.register(name, () -> new BlockItem((Block)block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "justamodforhackcraftv2");
        STEEL_BLOCK = registerBlock("steel_block", () -> new Block(Properties.of().strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
        STEEL_BLOCK_REINFORCED = registerBlock("steel_block_reinforced", () -> new Block(Properties.of().strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
        STEEL_CASING = registerBlock("steel_casing", () -> new Block(Properties.of().strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.LODESTONE)));
        STEEL_GIRDLE = registerBlock("steel_girdle", () -> new Block(Properties.of().strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.LODESTONE)));
        STEEL_LAMP = registerBlock("steel_lamp", () -> new Block(Properties.of().strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.COPPER).lightLevel((state) -> 15)));
        STEEL_LAMP_GREEN = registerBlock("steel_lamp_green", () -> new Block(Properties.of().strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.COPPER).lightLevel((state) -> 15)));
        STEEL_LAMP_RED = registerBlock("steel_lamp_red", () -> new Block(Properties.of().strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.COPPER).lightLevel((state) -> 15)));
        STEEL_LAMP_PURPLE = registerBlock("steel_lamp_purple", () -> new Block(Properties.of().strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.COPPER).lightLevel((state) -> 15)));
    }
}
