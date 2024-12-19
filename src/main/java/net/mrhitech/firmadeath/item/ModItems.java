package net.mrhitech.firmadeath.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mrhitech.firmadeath.FirmaDeath;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirmaDeath.MOD_ID);



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
