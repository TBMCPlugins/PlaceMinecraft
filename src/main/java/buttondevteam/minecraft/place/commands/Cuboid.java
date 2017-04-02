package buttondevteam.minecraft.place.commands;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import buttondevteam.architecture.commands.ModCommand;
import buttondevteam.minecraft.place.PlaceComponent;


//Tests the Writer's hardWrite method
public class Cuboid extends ModCommand{
	PlaceComponent place;
	public Cuboid(PlaceComponent place){
		this.place = place;
	}
	@Override
	public boolean OnCommand(Player player, String alias, String[] args) {
		player.sendMessage("Writing Cube...");
		place.writer.hardWrite(player.getLocation(), Material.DIRT);
		player.sendMessage("Cube Written!");
		return true;
	}
	@Override
	public String GetCommandPath() {
		return "place cube";
	}

}
