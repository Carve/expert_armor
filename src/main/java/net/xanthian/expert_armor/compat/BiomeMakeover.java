package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.xanthian.expert_armor.Initialise;

public class BiomeMakeover {

    public static final Item CRUDE_CLADDED_PLATE = registerItem(
            new Item(new FabricItemSettings()));

    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, "biomemakeover/crude_cladded_plate"), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup();
    }

    private static void addToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(BiomeMakeover.CRUDE_CLADDED_PLATE));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}