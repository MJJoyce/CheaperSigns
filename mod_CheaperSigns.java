package net.minecraft.src;

public class mod_CheaperSigns extends BaseMod
{
    public mod_CheaperSigns()
    {
        ModLoader.AddRecipe(new ItemStack(Item.sign, 1), new Object[] {" X", " |", Character.valueOf('X'), Block.planks, Character.valueOf('|'), Item.stick});
    }

    public String Version()
    {
        return "1.8_1";
    }
}
