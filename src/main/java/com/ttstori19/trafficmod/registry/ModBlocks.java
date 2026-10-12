package com.ttstori19.trafficmod.registry;

import com.ttstori19.trafficmod.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "trafficmod");

    public static final RegistryObject<Block> ROAD_BLOCK = BLOCKS.register("road", RoadBlock::new);
    public static final RegistryObject<Block> TRAFFIC_SIGN_BLOCK = BLOCKS.register("traffic_sign", TrafficSignBlock::new);
    public static final RegistryObject<Block> TRAFFIC_LIGHT_BLOCK = BLOCKS.register("traffic_light", TrafficLightBlock::new);
    public static final RegistryObject<Block> POLICE_STATION_BLOCK = BLOCKS.register("police_station", PoliceStationBlock::new);
    public static final RegistryObject<Block> HOSPITAL_BLOCK = BLOCKS.register("hospital", HospitalBlock::new);
    public static final RegistryObject<Block> GAS_STATION_BLOCK = BLOCKS.register("gas_station", GasStationBlock::new);
    public static final RegistryObject<Block> EDITABLE_SIGN_BLOCK = BLOCKS.register("editable_sign", EditableSignBlock::new);
}
