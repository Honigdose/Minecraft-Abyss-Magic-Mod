package com.honigdose.abyssmagicmod.datagen;

import com.honigdose.abyssmagicmod.AbyssMagicMod;
import com.honigdose.abyssmagicmod.block.ModBlocks;
import com.honigdose.abyssmagicmod.block.ModBlocks;
import com.honigdose.abyssmagicmod.block.ModBlocks;
import com.honigdose.abyssmagicmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AbyssMagicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.CHALK.get());
        basicItem(ModItems.RAW_CHALK.get());

        basicItem(ModItems.QUILL.get());

        simpleBlockItem(ModBlocks.MORTAR_AND_PESTLE);
        simpleBlockItem(ModBlocks.INK_BOTTLE);
        simpleBlockItem(ModBlocks.EMPTY_INK_BOTTLE);

        simpleBlockItem(ModBlocks.MAGIC_ROUND_BOTTLE);
        simpleBlockItem(ModBlocks.MAGIC_TRIANGLE_BOTTLE);
        simpleBlockItem(ModBlocks.MAGIC_SQUARE_BOTTLE);
        basicItem(ModItems.ROUND_FIRE_ESSENCE.get());
        basicItem(ModItems.SQUARE_FIRE_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_FIRE_ESSENCE.get());
        basicItem(ModItems.ROUND_SOLAR_ESSENCE.get());
        basicItem(ModItems.SQUARE_SOLAR_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_SOLAR_ESSENCE.get());
        basicItem(ModItems.ROUND_LUNAR_ESSENCE.get());
        basicItem(ModItems.SQUARE_LUNAR_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_LUNAR_ESSENCE.get());
        basicItem(ModItems.ROUND_WATER_ESSENCE.get());
        basicItem(ModItems.SQUARE_WATER_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_WATER_ESSENCE.get());
        basicItem(ModItems.ROUND_NATURE_ESSENCE.get());
        basicItem(ModItems.SQUARE_NATURE_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_NATURE_ESSENCE.get());
        basicItem(ModItems.ROUND_AIR_ESSENCE.get());
        basicItem(ModItems.SQUARE_AIR_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_AIR_ESSENCE.get());
        basicItem(ModItems.ROUND_DEMONIC_ESSENCE.get());
        basicItem(ModItems.SQUARE_DEMONIC_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_DEMONIC_ESSENCE.get());
        basicItem(ModItems.ROUND_CELESTIAL_ESSENCE.get());
        basicItem(ModItems.SQUARE_CELESTIAL_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_CELESTIAL_ESSENCE.get());
        basicItem(ModItems.ROUND_VOID_ESSENCE.get());
        basicItem(ModItems.SQUARE_VOID_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_VOID_ESSENCE.get());
        basicItem(ModItems.ROUND_ARCANA_ESSENCE.get());
        basicItem(ModItems.SQUARE_ARCANA_ESSENCE.get());
        basicItem(ModItems.TRIANGLE_ARCANA_ESSENCE.get());

        basicItem(ModItems.ASTRATHYL.get());
        basicItem(ModItems.ABYSSSTEEL.get());
        basicItem(ModItems.FIRERYTE.get());
        basicItem(ModItems.SYLPHTHYL.get());
        basicItem(ModItems.SUIRYTE.get());
        basicItem(ModItems.FLORASTEEL.get());
        basicItem(ModItems.LUNARIUM.get());
        basicItem(ModItems.SOLARIUM.get());
        basicItem(ModItems.MYRINIUM.get());
        basicItem(ModItems.MANATHYL.get());
        basicItem(ModItems.BLOODGOLD.get());
        basicItem(ModItems.CELESTIUM.get());

        basicItem(ModItems.RAW_ASTRATHYL.get());
        basicItem(ModItems.RAW_ABYSSSTEEL.get());
        basicItem(ModItems.RAW_FIRERYTE.get());
        basicItem(ModItems.RAW_SYLPHTHYL.get());
        basicItem(ModItems.RAW_SUIRYTE.get());
        basicItem(ModItems.RAW_FLORASTEEl.get());
        basicItem(ModItems.RAW_LUNARIUM.get());
        basicItem(ModItems.RAW_SOLARIUM.get());
        basicItem(ModItems.RAW_CELESTIUM.get());
        basicItem(ModItems.RAW_BLOODGOLD.get());
        basicItem(ModItems.RAW_MYRINIUM.get());

        basicItem(ModItems.PURE_SILVER.get());

        basicItem(ModItems.SILVER.get());
        basicItem(ModItems.AIR_SILVER.get());
        basicItem(ModItems.NATURE_SILVER.get());
        basicItem(ModItems.FIRE_SILVER.get());
        basicItem(ModItems.WATER_SILVER.get());
        basicItem(ModItems.SOLAR_SILVER.get());
        basicItem(ModItems.LUNAR_SILVER.get());

        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.RAW_LUNAR_SILVER.get());
        basicItem(ModItems.RAW_SOLAR_SILVER.get());
        basicItem(ModItems.RAW_AIR_SILVER.get());
        basicItem(ModItems.RAW_WATER_SILVER.get());
        basicItem(ModItems.RAW_FIRE_SILVER.get());
        basicItem(ModItems.RAW_NATURE_SILVER.get());

        basicItem(ModItems.PURE_GOLD.get());

        basicItem(ModItems.AIR_GOLD.get());
        basicItem(ModItems.NATURE_GOLD.get());
        basicItem(ModItems.FIRE_GOLD.get());
        basicItem(ModItems.WATER_GOLD.get());
        basicItem(ModItems.SOLAR_GOLD.get());
        basicItem(ModItems.LUNAR_GOLD.get());

        basicItem(ModItems.RAW_LUNAR_GOLD.get());
        basicItem(ModItems.RAW_SOLAR_GOLD.get());
        basicItem(ModItems.RAW_AIR_GOLD.get());
        basicItem(ModItems.RAW_WATER_GOLD.get());
        basicItem(ModItems.RAW_FIRE_GOLD.get());
        basicItem(ModItems.RAW_NATURE_GOLD.get());

        basicItem(ModItems.AIR_CRYSTAL_SHARD.get());
        basicItem(ModItems.NATURE_CRYSTAL_SHARD.get());
        basicItem(ModItems.WATER_CRYSTAL_SHARD.get());
        basicItem(ModItems.FIRE_CRYSTAL_SHARD.get());
        basicItem(ModItems.SOLAR_CRYSTAL_SHARD.get());
        basicItem(ModItems.LUNAR_CRYSTAL_SHARD.get());
        basicItem(ModItems.VOID_CRYSTAL_SHARD.get());
        basicItem(ModItems.CELESTIAL_CRYSTAL_SHARD.get());
        basicItem(ModItems.DEMONIC_CRYSTAL_SHARD.get());
        basicItem(ModItems.ARCANA_CRYSTAL_SHARD.get());

        simpleBlockItem(ModBlocks.LARGE_ARCANA_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_AIR_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_FIRE_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_NATURE_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_WATER_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_LUNAR_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_SOLAR_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_DEMONIC_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_VOID_CRYSTAL);
        simpleBlockItem(ModBlocks.LARGE_CELESTIAL_CRYSTAL);

        saplingItem(ModBlocks.BABY_FIRE_CRYSTAL);
        saplingItem(ModBlocks.BABY_WATER_CRYSTAL);
        saplingItem(ModBlocks.BABY_AIR_CRYSTAL);
        saplingItem(ModBlocks.BABY_NATURE_CRYSTAL);
        saplingItem(ModBlocks.BABY_LUNAR_CRYSTAL);
        saplingItem(ModBlocks.BABY_SOLAR_CRYSTAL);
        saplingItem(ModBlocks.BABY_DEMONIC_CRYSTAL);
        saplingItem(ModBlocks.BABY_CELESTIAL_CRYSTAL);
        saplingItem(ModBlocks.BABY_VOID_CRYSTAL);
        saplingItem(ModBlocks.BABY_ARCANA_CRYSTAL);

        saplingItem(ModBlocks.FIRE_CRYSTAL);
        saplingItem(ModBlocks.WATER_CRYSTAL);
        saplingItem(ModBlocks.AIR_CRYSTAL);
        saplingItem(ModBlocks.NATURE_CRYSTAL);
        saplingItem(ModBlocks.LUNAR_CRYSTAL);
        saplingItem(ModBlocks.SOLAR_CRYSTAL);
        saplingItem(ModBlocks.DEMONIC_CRYSTAL);
        saplingItem(ModBlocks.CELESTIAL_CRYSTAL);
        saplingItem(ModBlocks.VOID_CRYSTAL);
        saplingItem(ModBlocks.ARCANA_CRYSTAL);

        saplingItem(ModBlocks.SMALL_FIRE_CRYSTAL);
        saplingItem(ModBlocks.SMALL_WATER_CRYSTAL);
        saplingItem(ModBlocks.SMALL_AIR_CRYSTAL);
        saplingItem(ModBlocks.SMALL_NATURE_CRYSTAL);
        saplingItem(ModBlocks.SMALL_LUNAR_CRYSTAL);
        saplingItem(ModBlocks.SMALL_SOLAR_CRYSTAL);
        saplingItem(ModBlocks.SMALL_DEMONIC_CRYSTAL);
        saplingItem(ModBlocks.SMALL_CELESTIAL_CRYSTAL);
        saplingItem(ModBlocks.SMALL_VOID_CRYSTAL);
        saplingItem(ModBlocks.SMALL_ARCANA_CRYSTAL);

        saplingItem(ModBlocks.VERY_SMALL_FIRE_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_WATER_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_AIR_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_NATURE_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_LUNAR_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_SOLAR_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_DEMONIC_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_CELESTIAL_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_VOID_CRYSTAL);
        saplingItem(ModBlocks.VERY_SMALL_ARCANA_CRYSTAL);

        // Tree
        // Scarlet Tree
        buttonItem(ModBlocks.SCARLET_TREE_BUTTON, ModBlocks.SCARLET_TREE_PLANKS);
        fenceItem(ModBlocks.SCARLET_TREE_FENCE, ModBlocks.SCARLET_TREE_PLANKS);
        wallItem(ModBlocks.SCARLET_TREE_WALL, ModBlocks.SCARLET_TREE_PLANKS);
        simpleBlockItem(ModBlocks.SCARLET_TREE_DOOR);
        saplingItem(ModBlocks.SCARLET_TREE_SAPLING);

        // Life Tree
        saplingItem(ModBlocks.LIFE_TREE_SAPLING);
        buttonItem(ModBlocks.BLIFE_TREE_BUTTON, ModBlocks.BLIFE_TREE_PLANKS);
        fenceItem(ModBlocks.BLIFE_TREE_FENCE, ModBlocks.BLIFE_TREE_PLANKS);
        simpleBlockItem(ModBlocks.BLIFE_TREE_DOOR);

        //FIRE
        saplingItem(ModBlocks.BLT_FIRE_HLEAVES);
        saplingItem(ModBlocks.BLT_FIRE_HLEAVES_PLANT);
        saplingItem(ModBlocks.BLIFE_TREE_FIRE_SAPLING);
        //Water
        saplingItem(ModBlocks.BLT_WATER_HLEAVES);
        saplingItem(ModBlocks.BLT_WATER_HLEAVES_PLANT);
        //Tools
        //Stage 1
        handheldItem(ModItems.FIRERYTE_PICKAXE_STAGE1);



    }


    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AbyssMagicMod.MOD_ID,"block/" + item.getId().getPath()));

    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AbyssMagicMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(AbyssMagicMod.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));

    }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(AbyssMagicMod.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(AbyssMagicMod.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AbyssMagicMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
