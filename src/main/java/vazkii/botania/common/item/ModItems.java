/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [Jan 14, 2014, 5:17:47 PM (GMT)]
 */
package vazkii.botania.common.item;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.common.item.brew.ItemBrewFlask;
import vazkii.botania.common.item.brew.ItemBrewVial;
import vazkii.botania.common.item.brew.ItemIncenseStick;
import vazkii.botania.common.item.brew.ItemVial;
import vazkii.botania.common.item.equipment.armor.elementium.ItemElementiumBoots;
import vazkii.botania.common.item.equipment.armor.elementium.ItemElementiumChest;
import vazkii.botania.common.item.equipment.armor.elementium.ItemElementiumHelm;
import vazkii.botania.common.item.equipment.armor.elementium.ItemElementiumLegs;
import vazkii.botania.common.item.equipment.armor.manasteel.ItemManasteelBoots;
import vazkii.botania.common.item.equipment.armor.manasteel.ItemManasteelChest;
import vazkii.botania.common.item.equipment.armor.manasteel.ItemManasteelHelm;
import vazkii.botania.common.item.equipment.armor.manasteel.ItemManasteelLegs;
import vazkii.botania.common.item.equipment.armor.manaweave.ItemManaweaveBoots;
import vazkii.botania.common.item.equipment.armor.manaweave.ItemManaweaveChest;
import vazkii.botania.common.item.equipment.armor.manaweave.ItemManaweaveHelm;
import vazkii.botania.common.item.equipment.armor.manaweave.ItemManaweaveLegs;
import vazkii.botania.common.item.equipment.armor.terrasteel.ItemTerrasteelBoots;
import vazkii.botania.common.item.equipment.armor.terrasteel.ItemTerrasteelChest;
import vazkii.botania.common.item.equipment.armor.terrasteel.ItemTerrasteelHelm;
import vazkii.botania.common.item.equipment.armor.terrasteel.ItemTerrasteelLegs;
import vazkii.botania.common.item.equipment.bauble.ItemAuraRing;
import vazkii.botania.common.item.equipment.bauble.ItemBaubleCosmetic;
import vazkii.botania.common.item.equipment.bauble.ItemBloodPendant;
import vazkii.botania.common.item.equipment.bauble.ItemDivaCharm;
import vazkii.botania.common.item.equipment.bauble.ItemFlightTiara;
import vazkii.botania.common.item.equipment.bauble.ItemGoldenLaurel;
import vazkii.botania.common.item.equipment.bauble.ItemGreaterAuraRing;
import vazkii.botania.common.item.equipment.bauble.ItemGreaterMagnetRing;
import vazkii.botania.common.item.equipment.bauble.ItemGreaterManaRing;
import vazkii.botania.common.item.equipment.bauble.ItemHolyCloak;
import vazkii.botania.common.item.equipment.bauble.ItemIcePendant;
import vazkii.botania.common.item.equipment.bauble.ItemItemFinder;
import vazkii.botania.common.item.equipment.bauble.ItemKnockbackBelt;
import vazkii.botania.common.item.equipment.bauble.ItemLavaPendant;
import vazkii.botania.common.item.equipment.bauble.ItemMagnetRing;
import vazkii.botania.common.item.equipment.bauble.ItemManaRing;
import vazkii.botania.common.item.equipment.bauble.ItemMiningRing;
import vazkii.botania.common.item.equipment.bauble.ItemMonocle;
import vazkii.botania.common.item.equipment.bauble.ItemPixieRing;
import vazkii.botania.common.item.equipment.bauble.ItemReachRing;
import vazkii.botania.common.item.equipment.bauble.ItemSpeedUpBelt;
import vazkii.botania.common.item.equipment.bauble.ItemSuperLavaPendant;
import vazkii.botania.common.item.equipment.bauble.ItemSuperTravelBelt;
import vazkii.botania.common.item.equipment.bauble.ItemSwapRing;
import vazkii.botania.common.item.equipment.bauble.ItemTinyPlanet;
import vazkii.botania.common.item.equipment.bauble.ItemTravelBelt;
import vazkii.botania.common.item.equipment.bauble.ItemUnholyCloak;
import vazkii.botania.common.item.equipment.bauble.ItemWaterRing;
import vazkii.botania.common.item.equipment.tool.ItemEnderDagger;
import vazkii.botania.common.item.equipment.tool.ItemGlassPick;
import vazkii.botania.common.item.equipment.tool.ItemStarSword;
import vazkii.botania.common.item.equipment.tool.ItemThunderSword;
import vazkii.botania.common.item.equipment.tool.bow.ItemCrystalBow;
import vazkii.botania.common.item.equipment.tool.bow.ItemLivingwoodBow;
import vazkii.botania.common.item.equipment.tool.elementium.ItemElementiumAxe;
import vazkii.botania.common.item.equipment.tool.elementium.ItemElementiumPick;
import vazkii.botania.common.item.equipment.tool.elementium.ItemElementiumShears;
import vazkii.botania.common.item.equipment.tool.elementium.ItemElementiumShovel;
import vazkii.botania.common.item.equipment.tool.elementium.ItemElementiumSword;
import vazkii.botania.common.item.equipment.tool.manasteel.ItemManasteelAxe;
import vazkii.botania.common.item.equipment.tool.manasteel.ItemManasteelPick;
import vazkii.botania.common.item.equipment.tool.manasteel.ItemManasteelShears;
import vazkii.botania.common.item.equipment.tool.manasteel.ItemManasteelShovel;
import vazkii.botania.common.item.equipment.tool.manasteel.ItemManasteelSword;
import vazkii.botania.common.item.equipment.tool.terrasteel.ItemTerraAxe;
import vazkii.botania.common.item.equipment.tool.terrasteel.ItemTerraPick;
import vazkii.botania.common.item.equipment.tool.terrasteel.ItemTerraSword;
import vazkii.botania.common.item.interaction.thaumcraft.ItemElementiumHelmRevealing;
import vazkii.botania.common.item.interaction.thaumcraft.ItemManaInkwell;
import vazkii.botania.common.item.interaction.thaumcraft.ItemManasteelHelmRevealing;
import vazkii.botania.common.item.interaction.thaumcraft.ItemTerrasteelHelmRevealing;
import vazkii.botania.common.item.lens.ItemLens;
import vazkii.botania.common.item.material.ItemDye;
import vazkii.botania.common.item.material.ItemManaResource;
import vazkii.botania.common.item.material.ItemPestleAndMortar;
import vazkii.botania.common.item.material.ItemPetal;
import vazkii.botania.common.item.material.ItemQuartz;
import vazkii.botania.common.item.material.ItemRune;
import vazkii.botania.common.item.record.ItemRecordGaia1;
import vazkii.botania.common.item.record.ItemRecordGaia2;
import vazkii.botania.common.item.relic.ItemAesirRing;
import vazkii.botania.common.item.relic.ItemDice;
import vazkii.botania.common.item.relic.ItemFlugelEye;
import vazkii.botania.common.item.relic.ItemInfiniteFruit;
import vazkii.botania.common.item.relic.ItemKingKey;
import vazkii.botania.common.item.relic.ItemLokiRing;
import vazkii.botania.common.item.relic.ItemOdinRing;
import vazkii.botania.common.item.relic.ItemThorRing;
import vazkii.botania.common.item.rod.ItemCobbleRod;
import vazkii.botania.common.item.rod.ItemDirtRod;
import vazkii.botania.common.item.rod.ItemDiviningRod;
import vazkii.botania.common.item.rod.ItemExchangeRod;
import vazkii.botania.common.item.rod.ItemFireRod;
import vazkii.botania.common.item.rod.ItemGravityRod;
import vazkii.botania.common.item.rod.ItemMissileRod;
import vazkii.botania.common.item.rod.ItemRainbowRod;
import vazkii.botania.common.item.rod.ItemSkyDirtRod;
import vazkii.botania.common.item.rod.ItemSmeltRod;
import vazkii.botania.common.item.rod.ItemTerraformRod;
import vazkii.botania.common.item.rod.ItemTornadoRod;
import vazkii.botania.common.item.rod.ItemWaterRod;
import vazkii.botania.common.lib.LibOreDict;

public final class ModItems {

    public static Item lexicon;
    public static Item petal;
    public static Item dye;
    public static Item pestleAndMortar;
    public static Item twigWand;
    public static Item manaResource;
    public static Item lens;
    public static Item rune;
    public static Item signalFlare;
    public static Item manaTablet;
    public static Item manaGun;
    public static Item manaCookie;
    public static Item fertilizer;
    public static Item grassSeeds;
    public static Item dirtRod;
    public static Item terraformRod;
    public static Item grassHorn;
    public static Item manaMirror;
    public static Item manasteelHelm;
    public static Item manasteelHelmRevealing;
    public static Item manasteelChest;
    public static Item manasteelLegs;
    public static Item manasteelBoots;
    public static Item manasteelPick;
    public static Item manasteelShovel;
    public static Item manasteelAxe;
    public static Item manasteelSword;
    public static Item manasteelShears;
    public static Item terrasteelHelm;
    public static Item terrasteelHelmRevealing;
    public static Item terrasteelChest;
    public static Item terrasteelLegs;
    public static Item terrasteelBoots;
    public static Item terraSword;
    public static Item tinyPlanet;
    public static Item manaRing;
    public static Item auraRing;
    public static Item manaRingGreater;
    public static Item auraRingGreater;
    public static Item travelBelt;
    public static Item knockbackBelt;
    public static Item icePendant;
    public static Item lavaPendant;
    public static Item goldLaurel;
    public static Item magnetRing;
    public static Item waterRing;
    public static Item miningRing;
    public static Item terraPick;
    public static Item divaCharm;
    public static Item flightTiara;
    public static Item enderDagger;
    public static Item quartz;
    public static Item waterRod;
    public static Item elementiumHelm;
    public static Item elementiumHelmRevealing;
    public static Item elementiumChest;
    public static Item elementiumLegs;
    public static Item elementiumBoots;
    public static Item elementiumPick;
    public static Item elementiumShovel;
    public static Item elementiumAxe;
    public static Item elementiumSword;
    public static Item elementiumShears;
    public static Item openBucket;
    public static Item spawnerMover;
    public static Item pixieRing;
    public static Item superTravelBelt;
    public static Item rainbowRod;
    public static Item tornadoRod;
    public static Item fireRod;
    public static Item vineBall;
    public static Item slingshot;
    public static Item manaBottle;
    public static Item laputaShard;
    public static Item virus;
    public static Item reachRing;
    public static Item skyDirtRod;
    public static Item itemFinder;
    public static Item superLavaPendant;
    public static Item enderHand;
    public static Item glassPick;
    public static Item spark;
    public static Item sparkUpgrade;
    public static Item diviningRod;
    public static Item gravityRod;
    public static Item regenIvy;
    public static Item manaInkwell;
    public static Item vial;
    public static Item brewVial;
    public static Item brewFlask;
    public static Item bloodPendant;
    public static Item missileRod;
    public static Item holyCloak;
    public static Item unholyCloak;
    public static Item craftingHalo;
    public static Item blackLotus;
    public static Item monocle;
    public static Item clip;
    public static Item cobbleRod;
    public static Item smeltRod;
    public static Item worldSeed;
    public static Item spellCloth;
    public static Item thornChakram;
    public static Item overgrowthSeed;
    public static Item craftPattern;
    public static Item ancientWill;
    public static Item corporeaSpark;
    public static Item livingwoodBow;
    public static Item crystalBow;
    public static Item cosmetic;
    public static Item swapRing;
    public static Item flowerBag;
    public static Item phantomInk;
    public static Item poolMinecart;
    public static Item pinkinator;
    public static Item infiniteFruit;
    public static Item kingKey;
    public static Item flugelEye;
    public static Item thorRing;
    public static Item odinRing;
    public static Item lokiRing;
    public static Item aesirRing;
    public static Item dice;
    public static Item keepIvy;
    public static Item blackHoleTalisman;
    public static Item recordGaia1;
    public static Item recordGaia2;
    public static Item temperanceStone;
    public static Item incenseStick;
    public static Item terraAxe;
    public static Item waterBowl;
    public static Item obedienceStick;
    public static Item cacophonium;
    public static Item slimeBottle;
    public static Item starSword;
    public static Item exchangeRod;
    public static Item magnetRingGreater;
    public static Item thunderSword;
    public static Item manaweaveHelm;
    public static Item manaweaveChest;
    public static Item manaweaveLegs;
    public static Item manaweaveBoots;
    public static Item autocraftingHalo;
    public static Item gaiaHead;
    public static Item sextant;
    public static Item speedUpBelt;
    public static Item baubleBox;

    public static void init() {
        lexicon = new ItemLexicon();
        petal = new ItemPetal();
        dye = new ItemDye();
        pestleAndMortar = new ItemPestleAndMortar();
        twigWand = new ItemTwigWand();
        manaResource = new ItemManaResource();
        lens = new ItemLens();
        rune = new ItemRune();
        signalFlare = new ItemSignalFlare();
        manaTablet = new ItemManaTablet();
        manaGun = new ItemManaGun();
        manaCookie = new ItemManaCookie();
        fertilizer = new ItemFertilizer();
        grassSeeds = new ItemGrassSeeds();
        dirtRod = new ItemDirtRod();
        terraformRod = new ItemTerraformRod();
        grassHorn = new ItemGrassHorn();
        manaMirror = new ItemManaMirror();
        manasteelHelm = new ItemManasteelHelm();
        manasteelHelmRevealing = new ItemManasteelHelmRevealing();
        manasteelChest = new ItemManasteelChest();
        manasteelLegs = new ItemManasteelLegs();
        manasteelBoots = new ItemManasteelBoots();
        manasteelPick = new ItemManasteelPick();
        manasteelShovel = new ItemManasteelShovel();
        manasteelAxe = new ItemManasteelAxe();
        manasteelSword = new ItemManasteelSword();
        manasteelShears = new ItemManasteelShears();
        terrasteelHelm = new ItemTerrasteelHelm();
        terrasteelHelmRevealing = new ItemTerrasteelHelmRevealing();
        terrasteelChest = new ItemTerrasteelChest();
        terrasteelLegs = new ItemTerrasteelLegs();
        terrasteelBoots = new ItemTerrasteelBoots();
        terraSword = new ItemTerraSword();
        tinyPlanet = new ItemTinyPlanet();
        manaRing = new ItemManaRing();
        auraRing = new ItemAuraRing();
        manaRingGreater = new ItemGreaterManaRing();
        auraRingGreater = new ItemGreaterAuraRing();
        travelBelt = new ItemTravelBelt();
        knockbackBelt = new ItemKnockbackBelt();
        icePendant = new ItemIcePendant();
        lavaPendant = new ItemLavaPendant();
        goldLaurel = new ItemGoldenLaurel();
        magnetRing = new ItemMagnetRing();
        waterRing = new ItemWaterRing();
        miningRing = new ItemMiningRing();
        terraPick = new ItemTerraPick();
        divaCharm = new ItemDivaCharm();
        flightTiara = new ItemFlightTiara();
        enderDagger = new ItemEnderDagger();
        quartz = new ItemQuartz();
        waterRod = new ItemWaterRod();
        elementiumHelm = new ItemElementiumHelm();
        elementiumHelmRevealing = new ItemElementiumHelmRevealing();
        elementiumChest = new ItemElementiumChest();
        elementiumLegs = new ItemElementiumLegs();
        elementiumBoots = new ItemElementiumBoots();
        elementiumPick = new ItemElementiumPick();
        elementiumShovel = new ItemElementiumShovel();
        elementiumAxe = new ItemElementiumAxe();
        elementiumSword = new ItemElementiumSword();
        elementiumShears = new ItemElementiumShears();
        openBucket = new ItemOpenBucket();
        spawnerMover = new ItemSpawnerMover();
        pixieRing = new ItemPixieRing();
        superTravelBelt = new ItemSuperTravelBelt();
        rainbowRod = new ItemRainbowRod();
        tornadoRod = new ItemTornadoRod();
        fireRod = new ItemFireRod();
        vineBall = new ItemVineBall();
        slingshot = new ItemSlingshot();
        manaBottle = new ItemBottledMana();
        laputaShard = new ItemLaputaShard();
        virus = new ItemVirus();
        reachRing = new ItemReachRing();
        skyDirtRod = new ItemSkyDirtRod();
        itemFinder = new ItemItemFinder();
        superLavaPendant = new ItemSuperLavaPendant();
        enderHand = new ItemEnderHand();
        glassPick = new ItemGlassPick();
        spark = new ItemSpark();
        sparkUpgrade = new ItemSparkUpgrade();
        diviningRod = new ItemDiviningRod();
        gravityRod = new ItemGravityRod();
        regenIvy = new ItemRegenIvy();
        manaInkwell = new ItemManaInkwell();
        vial = new ItemVial();
        brewVial = new ItemBrewVial();
        brewFlask = new ItemBrewFlask();
        bloodPendant = new ItemBloodPendant();
        missileRod = new ItemMissileRod();
        holyCloak = new ItemHolyCloak();
        unholyCloak = new ItemUnholyCloak();
        craftingHalo = new ItemCraftingHalo();
        blackLotus = new ItemBlackLotus();
        monocle = new ItemMonocle();
        clip = new ItemClip();
        cobbleRod = new ItemCobbleRod();
        smeltRod = new ItemSmeltRod();
        worldSeed = new ItemWorldSeed();
        spellCloth = new ItemSpellCloth();
        thornChakram = new ItemThornChakram();
        overgrowthSeed = new ItemOvergrowthSeed();
        craftPattern = new ItemCraftPattern();
        ancientWill = new ItemAncientWill();
        corporeaSpark = new ItemCorporeaSpark();
        livingwoodBow = new ItemLivingwoodBow();
        crystalBow = new ItemCrystalBow();
        cosmetic = new ItemBaubleCosmetic();
        swapRing = new ItemSwapRing();
        flowerBag = new ItemFlowerBag();
        phantomInk = new ItemPhantomInk();
        poolMinecart = new ItemPoolMinecart();
        pinkinator = new ItemPinkinator();
        infiniteFruit = new ItemInfiniteFruit();
        kingKey = new ItemKingKey();
        flugelEye = new ItemFlugelEye();
        thorRing = new ItemThorRing();
        odinRing = new ItemOdinRing();
        lokiRing = new ItemLokiRing();
        aesirRing = new ItemAesirRing();
        dice = new ItemDice();
        keepIvy = new ItemKeepIvy();
        blackHoleTalisman = new ItemBlackHoleTalisman();
        recordGaia1 = new ItemRecordGaia1();
        recordGaia2 = new ItemRecordGaia2();
        temperanceStone = new ItemTemperanceStone();
        incenseStick = new ItemIncenseStick();
        terraAxe = new ItemTerraAxe();
        waterBowl = new ItemWaterBowl();
        obedienceStick = new ItemObedienceStick();
        cacophonium = new ItemCacophonium();
        slimeBottle = new ItemSlimeBottle();
        starSword = new ItemStarSword();
        exchangeRod = new ItemExchangeRod();
        magnetRingGreater = new ItemGreaterMagnetRing();
        thunderSword = new ItemThunderSword();
        manaweaveHelm = new ItemManaweaveHelm();
        manaweaveLegs = new ItemManaweaveLegs();
        manaweaveChest = new ItemManaweaveChest();
        manaweaveBoots = new ItemManaweaveBoots();
        autocraftingHalo = new ItemAutocraftingHalo();
        gaiaHead = new ItemGaiaHead();
        sextant = new ItemSextant();
        speedUpBelt = new ItemSpeedUpBelt();
        baubleBox = new ItemBaubleBox();

        OreDictionary.registerOre(LibOreDict.LEXICON, lexicon);
        for (int i = 0; i < 16; i++) {
            OreDictionary.registerOre(LibOreDict.PETAL[i], new ItemStack(petal, 1, i));
            OreDictionary.registerOre(LibOreDict.DYE[i], new ItemStack(dye, 1, i));
            OreDictionary.registerOre(LibOreDict.RUNE[i], new ItemStack(rune, 1, i));
        }
        for (int i = 0; i < 7; i++) OreDictionary.registerOre(LibOreDict.QUARTZ[i], new ItemStack(quartz, 1, i));

        OreDictionary.registerOre(LibOreDict.PESTLE_AND_MORTAR, pestleAndMortar);
        OreDictionary.registerOre(LibOreDict.MANA_STEEL, new ItemStack(manaResource, 1, 0));
        OreDictionary.registerOre(LibOreDict.MANA_PEARL, new ItemStack(manaResource, 1, 1));
        OreDictionary.registerOre(LibOreDict.MANA_DIAMOND, new ItemStack(manaResource, 1, 2));
        OreDictionary.registerOre(LibOreDict.LIVINGWOOD_TWIG, new ItemStack(manaResource, 1, 3));
        OreDictionary.registerOre(LibOreDict.TERRA_STEEL, new ItemStack(manaResource, 1, 4));
        OreDictionary.registerOre(LibOreDict.LIFE_ESSENCE, new ItemStack(manaResource, 1, 5));
        OreDictionary.registerOre(LibOreDict.REDSTONE_ROOT, new ItemStack(manaResource, 1, 6));
        OreDictionary.registerOre(LibOreDict.ELEMENTIUM, new ItemStack(manaResource, 1, 7));
        OreDictionary.registerOre(LibOreDict.PIXIE_DUST, new ItemStack(manaResource, 1, 8));
        OreDictionary.registerOre(LibOreDict.DRAGONSTONE, new ItemStack(manaResource, 1, 9));
        OreDictionary.registerOre(LibOreDict.PRISMARINE_SHARD, new ItemStack(manaResource, 1, 10));
        OreDictionary.registerOre(LibOreDict.PLACEHOLDER, new ItemStack(manaResource, 1, 11));
        OreDictionary.registerOre(LibOreDict.RED_STRING, new ItemStack(manaResource, 1, 12));
        OreDictionary.registerOre(LibOreDict.DREAMWOOD_TWIG, new ItemStack(manaResource, 1, 13));
        OreDictionary.registerOre(LibOreDict.GAIA_INGOT, new ItemStack(manaResource, 1, 14));
        OreDictionary.registerOre(LibOreDict.ENDER_AIR_BOTTLE, new ItemStack(manaResource, 1, 15));
        OreDictionary.registerOre(LibOreDict.MANA_STRING, new ItemStack(manaResource, 1, 16));
        OreDictionary.registerOre(LibOreDict.MANASTEEL_NUGGET, new ItemStack(manaResource, 1, 17));
        OreDictionary.registerOre(LibOreDict.TERRASTEEL_NUGGET, new ItemStack(manaResource, 1, 18));
        OreDictionary.registerOre(LibOreDict.ELEMENTIUM_NUGGET, new ItemStack(manaResource, 1, 19));
        OreDictionary.registerOre(LibOreDict.ROOT, new ItemStack(manaResource, 1, 20));
        OreDictionary.registerOre(LibOreDict.PEBBLE, new ItemStack(manaResource, 1, 21));
        OreDictionary.registerOre(LibOreDict.MANAWEAVE_CLOTH, new ItemStack(manaResource, 1, 22));
        OreDictionary.registerOre(LibOreDict.MANA_POWDER, new ItemStack(manaResource, 1, 23));

        OreDictionary.registerOre(LibOreDict.VIAL, new ItemStack(vial, 1, 0));
        OreDictionary.registerOre(LibOreDict.FLASK, new ItemStack(vial, 1, 1));

        BotaniaAPI.blackListItemFromLoonium(lexicon);
        BotaniaAPI.blackListItemFromLoonium(overgrowthSeed);
        BotaniaAPI.blackListItemFromLoonium(blackLotus);
        int min = Item.getIdFromItem(Items.record_13);
        int max = Item.getIdFromItem(Items.record_wait);
        for (int i = min; i <= max; i++) BotaniaAPI.blackListItemFromLoonium(Item.getItemById(i));

        OreDictionary.registerOre("rodBlaze", Items.blaze_rod);
        OreDictionary.registerOre("powderBlaze", Items.blaze_powder);
    }
}
