package buttondevteam.minecraft.place.commands;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import buttondevteam.architecture.commands.ModCommand;
import buttondevteam.minecraft.place.Writer;


//Tests the Writer's hardWrite method
public class Cube extends ModCommand{

	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		Writer.hardWrite(player.getLocation(), Material.LEAVES);
		return true;
	}
	@Override
	public String GetCommandPath() {
		return "place cube";
	}

}
