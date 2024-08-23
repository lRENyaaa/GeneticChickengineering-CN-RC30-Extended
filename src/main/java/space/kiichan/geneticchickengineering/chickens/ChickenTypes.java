package space.kiichan.geneticchickengineering.chickens;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import java.util.LinkedHashMap;
import java.util.Map;

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
            put(60, new Object[]{"羽毛", new ItemStack(Material.FEATHER)});
            put(29, new Object[]{"骨头", new ItemStack(Material.BONE)});
            put(44, new Object[]{"圆石", new ItemStack(Material.COBBLESTONE)});
            put(52, new Object[]{"泥土", new ItemStack(Material.DIRT)});
            put(56, new Object[]{"燧石", new ItemStack(Material.FLINT)});
            put(58, new Object[]{"沙子", new ItemStack(Material.SAND)});
            put(59, new Object[]{"煤炭", new ItemStack(Material.COAL)});
            put(13, new Object[]{"线", new ItemStack(Material.STRING)});
            put(21, new Object[]{"皮革", new ItemStack(Material.LEATHER)});
            put(25, new Object[]{"糖", new ItemStack(Material.SUGAR)});
            put(27, new Object[]{"海绵", new ItemStack(Material.SPONGE)});
            put(28, new Object[]{"闪长岩", new ItemStack(Material.DIORITE)});
            put(37, new Object[]{"安山岩", new ItemStack(Material.ANDESITE)});
            put(42, new Object[]{"沙砾", new ItemStack(Material.GRAVEL)});
            put(43, new Object[]{"冰", new ItemStack(Material.ICE)});
            put(48, new Object[]{"花岗岩", new ItemStack(Material.GRANITE)});
            put(50, new Object[]{"黏土", new ItemStack(Material.CLAY)});
            put(51, new Object[]{"橡木原木", new ItemStack(Material.OAK_LOG)});
            put(54, new Object[]{"火药", new ItemStack(Material.GUNPOWDER)});
            put(55, new Object[]{"海带", new ItemStack(Material.KELP)});
            put(57, new Object[]{"黏液球", new ItemStack(Material.SLIME_BALL)});
            put(5, new Object[]{"金锭", new ItemStack(Material.GOLD_INGOT)});
            put(9, new Object[]{"下界岩", new ItemStack(Material.NETHERRACK)});
            put(11, new Object[]{"玻璃", new ItemStack(Material.GLASS)});
            put(12, new Object[]{"青金石", new ItemStack(Material.LAPIS_LAZULI)});
            put(17, new Object[]{"铁锭", new ItemStack(Material.IRON_INGOT)});
            put(19, new Object[]{"铁粉", SlimefunItems.IRON_DUST});
            put(20, new Object[]{"金粉", SlimefunItems.GOLD_DUST});
            put(23, new Object[]{"银粉", SlimefunItems.SILVER_DUST});
            put(24, new Object[]{"锌粉", SlimefunItems.ZINC_DUST});
            put(26, new Object[]{"蛋糕", new ItemStack(Material.CAKE)});
            put(33, new Object[]{"黑曜石", new ItemStack(Material.OBSIDIAN)});
            put(35, new Object[]{"铜粉", SlimefunItems.COPPER_DUST});
            put(36, new Object[]{"镁", SlimefunItems.MAGNESIUM_DUST});
            put(39, new Object[]{"锡粉", SlimefunItems.TIN_DUST});
            put(40, new Object[]{"雪球", new ItemStack(Material.SNOWBALL)});
            put(41, new Object[]{"紅石", new ItemStack(Material.REDSTONE)});
            put(46, new Object[]{"仙人掌", new ItemStack(Material.CACTUS)});
            put(47, new Object[]{"铝粉", SlimefunItems.ALUMINUM_DUST});
            put(49, new Object[]{"铅粉", SlimefunItems.LEAD_DUST});
            put(53, new Object[]{"黑石", new ItemStack(Material.BLACKSTONE)});
            put(1, new Object[]{"灵魂土", new ItemStack(Material.SOUL_SOIL)});
            put(3, new Object[]{"烈焰棒", new ItemStack(Material.BLAZE_ROD)});
            put(7, new Object[]{"恶魂之泪", new ItemStack(Material.GHAST_TEAR)});
            put(15, new Object[]{"硫酸盐", SlimefunItems.SULFATE});
            put(31, new Object[]{"菌光体", new ItemStack(Material.SHROOMLIGHT)});
            put(4, new Object[]{"下界石英", new ItemStack(Material.QUARTZ)});
            put(8, new Object[]{"玄武岩", new ItemStack(Material.BASALT)});
            put(16, new Object[]{"哭泣的黑曜石", new ItemStack(Material.CRYING_OBSIDIAN)});
            put(32, new Object[]{"灵魂沙", new ItemStack(Material.SOUL_SAND)});
            put(10, new Object[]{"末影珍珠", new ItemStack(Material.ENDER_PEARL)});
            put(18, new Object[]{"下界疣", new ItemStack(Material.NETHER_WART)});
            put(34, new Object[]{"幻翼膜", new ItemStack(Material.PHANTOM_MEMBRANE)});
            put(22, new Object[]{"岩浆膏", new ItemStack(Material.MAGMA_CREAM)});
            put(38, new Object[]{"萤石粉", new ItemStack(Material.GLOWSTONE_DUST)});
            put(45, new Object[]{"末地石", new ItemStack(Material.END_STONE)});
            put(0, new Object[]{"海晶砂砾", new ItemStack(Material.PRISMARINE_CRYSTALS)});
            put(2, new Object[]{"海晶碎片", new ItemStack(Material.PRISMARINE_SHARD)});
            put(6, new Object[]{"经验", new ItemStack(Material.EXPERIENCE_BOTTLE)});
            put(14, new Object[]{"绿宝石", new ItemStack(Material.EMERALD)});
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

    public static final void registerChickens(Research research, PocketChicken<LivingEntity> pc, ItemGroup category, RecipeType rt) {
        for (int i=typemap.size()-1; i>-1; i--) {
            Object[] attrs = typemap.get(i);
            pc.fakeVariant(i, (String) attrs[0], category, rt);
        }
        pc.plugin.log.info("Registered "+typemap.size()+" chickens");
    }

}
