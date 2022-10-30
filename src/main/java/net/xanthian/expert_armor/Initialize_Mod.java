package net.xanthian.expert_armor;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.xanthian.expert_armor.compat.*;
import net.xanthian.expert_armor.item.ExpertArmor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initialize_Mod implements ModInitializer {

    public static final String MOD_ID = "expert_armor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup EXPERT = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "expert"),
            () -> new ItemStack(ExpertArmor.NETHERITE_PLATE));

    @Override
    public void onInitialize() {

        ExpertArmor.registerModItems();
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(MOD_ID, "eamodcompat"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
        });
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TRCompat.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            Gobber2Compat.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            MMCompat.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("botania")) {
            Botania.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            BetterNether.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            BetterEnd.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("copperequipment")) {
            CopperEquipment.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("advancednetherite")) {
            AdvancedNetherite.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("the_aether")) {
            AetherReborn.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            DragonLoot.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("amethystequipment")) {
            AmethystEquipment.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("boneequipment")) {
            BoneEquipment.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("dirtmonds")) {
            Dirtmonds.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("emerald_tools")) {
            Emerald_Tools.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("obsidianequipment")) {
            ObsidianEquipment.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("valleycraft")) {
            ValleyCraft.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("more_gems")) {
            More_Gems.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("indrev")) {
            IndustrialRevolution.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("mobz")) {
            MobZ.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
            TwilightForest.registerModItems();
        }
    }
}