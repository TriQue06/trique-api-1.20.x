package net.trique.triqueapi.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.trique.triqueapi.TriQueAPI;

public class Tags {
    public static class Items {
        public static final TagKey<Item> OVER_HELMETS =
                createTag("over_helmets");
        public static final TagKey<Item> OVER_CHESTPLATES =
                createTag("over_chestplates");
        public static final TagKey<Item> OVER_LEGGINGS =
                createTag("over_leggings");
        public static final TagKey<Item> OVER_BOOTS =
                createTag("over_boots");
        public static final TagKey<Item> OVER_SWORDS =
                createTag("over_swords");
        public static final TagKey<Item> OVER_AXES =
                createTag("over_axes");
        public static final TagKey<Item> OVER_PICKAXES =
                createTag("over_pickaxes");
        public static final TagKey<Item> OVER_SHOVELS =
                createTag("over_shovels");
        public static final TagKey<Item> OVER_HOES =
                createTag("over_hoes");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(TriQueAPI.MOD_ID, name));
        }
    }
}
