package com.telepathicgrunt.world_blender.features;

import com.telepathicgrunt.world_blender.WorldBlender;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class WBConfiguredFeatures
{
    public static final ConfiguredFeature<?,?> WB_PORTAL_ALTAR = WBFeatures.WB_PORTAL_ALTAR.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG);
    public static final ConfiguredFeature<?,?> ANTI_FLOATING_BLOCKS_AND_SEPARATE_LIQUIDS = WBFeatures.ANTI_FLOATING_BLOCKS_AND_SEPARATE_LIQUIDS.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG);

    public static void registerConfiguredFeatures()
    {
        MutableRegistry<ConfiguredFeature<?, ?>> registry = (MutableRegistry<ConfiguredFeature<?, ?>>) WorldGenRegistries.CONFIGURED_FEATURE;

        Registry.register(registry, new ResourceLocation(WorldBlender.MODID, "portal_altar"), WB_PORTAL_ALTAR);
        Registry.register(registry, new ResourceLocation(WorldBlender.MODID, "anti_floating_blocks_and_separate_liquids"), ANTI_FLOATING_BLOCKS_AND_SEPARATE_LIQUIDS);
    }
}
