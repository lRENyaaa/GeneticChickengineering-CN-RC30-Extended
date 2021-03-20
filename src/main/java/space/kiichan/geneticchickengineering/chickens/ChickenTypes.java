package space.kiichan.geneticchickengineering.chickens;

import java.util.LinkedHashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import space.kiichan.geneticchickengineering.items.GCEItems;

public final class ChickenTypes {

    private ChickenTypes() {};

    private static final Map<Integer, Object[]> typemap = new LinkedHashMap<Integer, Object[]>() {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
            /* Key: int[] of dominance as returned by DNA.getTyping()
             * Value[0]: String of chicken type
             * Value[1]: ItemStack of the resource it gives
             */
            put(63, new Object[]{"羽毛",new ItemStack(Material.FEATHER)});
            put(31, new Object[]{"骨頭",new ItemStack(Material.BONE)});
            put(47, new Object[]{"鵝卵石",new ItemStack(Material.COBBLESTONE)});
            put(55, new Object[]{"土",new ItemStack(Material.DIRT)});
            put(59, new Object[]{"燧石",new ItemStack(Material.FLINT)});
            put(61, new Object[]{"沙子",new ItemStack(Material.SAND)});
            put(62, new Object[]{"水", GCEItems.WATER_EGG});
            put(15, new Object[]{"煤炭",new ItemStack(Material.COAL)});
            put(23, new Object[]{"線",new ItemStack(Material.STRING)});
            put(27, new Object[]{"皮革",new ItemStack(Material.LEATHER)});
            put(29, new Object[]{"糖",new ItemStack(Material.SUGAR)});
            put(30, new Object[]{"海綿",new ItemStack(Material.SPONGE)});
            put(39, new Object[]{"閃長岩",new ItemStack(Material.DIORITE)});
            put(43, new Object[]{"安山岩",new ItemStack(Material.ANDESITE)});
            put(45, new Object[]{"礫石",new ItemStack(Material.GRAVEL)});
            put(46, new Object[]{"冰",new ItemStack(Material.ICE)});
            put(51, new Object[]{"花崗岩",new ItemStack(Material.GRANITE)});
            put(53, new Object[]{"黏土",new ItemStack(Material.CLAY)});
            put(54, new Object[]{"橡木原木",new ItemStack(Material.OAK_LOG)});
            put(57, new Object[]{"火藥",new ItemStack(Material.GUNPOWDER)});
            put(58, new Object[]{"海帶",new ItemStack(Material.KELP)});
            put(60, new Object[]{"史萊姆",new ItemStack(Material.SLIME_BALL)});
            put(7, new Object[]{"金",new ItemStack(Material.GOLD_INGOT)});
            put(11, new Object[]{"地獄石",new ItemStack(Material.NETHERRACK)});
            put(13, new Object[]{"玻璃",new ItemStack(Material.GLASS)});
            put(14, new Object[]{"青金石",new ItemStack(Material.LAPIS_LAZULI)});
            put(19, new Object[]{"鐵",new ItemStack(Material.IRON_INGOT)});
            put(21, new Object[]{"鐵粉", SlimefunItems.IRON_DUST});
            put(22, new Object[]{"金粉", SlimefunItems.GOLD_DUST});
            put(25, new Object[]{"銀粉", SlimefunItems.SILVER_DUST});
            put(26, new Object[]{"鋅粉", SlimefunItems.ZINC_DUST});
            put(28, new Object[]{"蛋糕",new ItemStack(Material.CAKE)});
            put(35, new Object[]{"黑曜石",new ItemStack(Material.OBSIDIAN)});
            put(37, new Object[]{"銅粉", SlimefunItems.COPPER_DUST});
            put(38, new Object[]{"鎂", SlimefunItems.MAGNESIUM_DUST});
            put(41, new Object[]{"熔岩", GCEItems.LAVA_EGG});
            put(42, new Object[]{"錫粉", SlimefunItems.TIN_DUST});
            put(44, new Object[]{"雪球",new ItemStack(Material.SNOWBALL)});
            put(49, new Object[]{"紅石",new ItemStack(Material.REDSTONE)});
            put(50, new Object[]{"仙人掌",new ItemStack(Material.CACTUS)});
            put(52, new Object[]{"鋁粉", SlimefunItems.ALUMINUM_DUST});
            put(56, new Object[]{"鉛粉", SlimefunItems.LEAD_DUST});
            put(3, new Object[]{"黑石",new ItemStack(Material.BLACKSTONE)});
            put(5, new Object[]{"靈魂土",new ItemStack(Material.SOUL_SOIL)});
            put(9, new Object[]{"烈焰桿",new ItemStack(Material.BLAZE_ROD)});
            put(17, new Object[]{"幽靈之淚",new ItemStack(Material.GHAST_TEAR)});
            put(33, new Object[]{"硫酸鹽", SlimefunItems.SULFATE});
            put(6, new Object[]{"蕈光體",new ItemStack(Material.SHROOMLIGHT)});
            put(10, new Object[]{"地獄石英",new ItemStack(Material.QUARTZ)});
            put(18, new Object[]{"玄武岩",new ItemStack(Material.BASALT)});
            put(34, new Object[]{"哭泣的黑曜石",new ItemStack(Material.CRYING_OBSIDIAN)});
            put(12, new Object[]{"靈魂砂",new ItemStack(Material.SOUL_SAND)});
            put(20, new Object[]{"終界珍珠",new ItemStack(Material.ENDER_PEARL)});
            put(36, new Object[]{"地獄疙瘩",new ItemStack(Material.NETHER_WART)});
            put(24, new Object[]{"夜魅皮膜",new ItemStack(Material.PHANTOM_MEMBRANE)});
            put(40, new Object[]{"岩漿球",new ItemStack(Material.MAGMA_CREAM)});
            put(48, new Object[]{"螢石粉",new ItemStack(Material.GLOWSTONE_DUST)});
            put(1, new Object[]{"鑽石",new ItemStack(Material.DIAMOND)});
            put(2, new Object[]{"終界石",new ItemStack(Material.END_STONE)});
            put(4, new Object[]{"海磷晶體",new ItemStack(Material.PRISMARINE_CRYSTALS)});
            put(8, new Object[]{"海磷碎片",new ItemStack(Material.PRISMARINE_SHARD)});
            put(16, new Object[]{"經驗",new ItemStack(Material.EXPERIENCE_BOTTLE)});
            put(32, new Object[]{"綠寶石",new ItemStack(Material.EMERALD)});
            put(0, new Object[]{"獄髓錠",new ItemStack(Material.NETHERITE_INGOT)});
        }
    };

    public static final Object[] get(int typing) {
        return typemap.get(typing);
    }

    public static final String getName(int typing) {
        return (String) typemap.get(typing)[0];
    }

    public static final ItemStack getResource(int typing) {
        return (ItemStack) typemap.get(typing)[1];
    }

    public static final void registerChickens(Research research, PocketChicken pc, Category category, RecipeType rt) {
        for (int i=typemap.size()-1; i>-1; i--) {
            Object[] attrs = typemap.get(i);
            pc.fakeVariant(i, (String) attrs[0], category, rt);
        }
        pc.plugin.log.info("Registered "+typemap.size()+" chickens");
    }

}
