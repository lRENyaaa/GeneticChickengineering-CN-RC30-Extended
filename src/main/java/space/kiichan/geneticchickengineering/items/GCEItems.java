package space.kiichan.geneticchickengineering.items;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class GCEItems {

    private GCEItems() {}

    public static final SlimefunItemStack POCKET_CHICKEN = makeChicken("袋子", "&7右鍵在方塊上", "&7來釋放雞");
    public static final SlimefunItemStack CHICKEN_NET = new SlimefunItemStack("GCE_CHICKEN_NET", new ItemStack(Material.COBWEB), "雞網", "使雞可攜帶", "&e右鍵點擊&7 使用");
    public static final SlimefunItemStack WATER_EGG = new SlimefunItemStack("GCE_WATER_EGG", new ItemStack(Material.TURTLE_SPAWN_EGG), "&9水蛋", "裝有水", "&e右鍵點擊&7 使用");
    public static final SlimefunItemStack LAVA_EGG = new SlimefunItemStack("GCE_LAVA_EGG", new ItemStack(Material.STRIDER_SPAWN_EGG), "&c熔岩蛋", "裝有熔岩", "&e右鍵點擊&7 使用");
    public static final SlimefunItemStack GENETIC_SEQUENCER = new SlimefunItemStack("GCE_GENETIC_SEQUENCER", new ItemStack(Material.SMOKER), "&c基因測序儀", "用於確認雞的基因型態", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack EXCITATION_CHAMBER = new SlimefunItemStack("GCE_EXCITATION_CHAMBER", new ItemStack(Material.BLAST_FURNACE), "&c鼓舞室", "讓雞產生資源", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack EXCITATION_CHAMBER_2 = new SlimefunItemStack("GCE_EXCITATION_CHAMBER_2", new ItemStack(Material.BLAST_FURNACE), "&c促進鼓舞室", "使雞可以更快的產生資源", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(15));
    public static final SlimefunItemStack PRIVATE_COOP = new SlimefunItemStack("GCE_PRIVATE_COOP", new ItemStack(Material.BEEHIVE), "&c私人雞舍", "足夠讓兩隻雞...", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(2));

    public static SlimefunItemStack makeChicken(String chickenType, String... lore) {
        // Used only during plugin initialization
        String type = chickenType.replace(" ","_").toUpperCase();
        return new SlimefunItemStack("GCE_"+type+"_CHICKEN", "1638469a599ceef7207537603248a9ab11ff591fd378bea4735b346a7fae893", chickenType + "雞", lore);
    }
    public static SlimefunItemStack makeChickenIcon(String chickenType, ItemStack icon, String... lore) {
        // Used only during plugin initialization
        String type = chickenType.replace(" ","_").toUpperCase();
        return new SlimefunItemStack("GCE_"+type+"_CHICKEN_ICON", icon);
    }

}
