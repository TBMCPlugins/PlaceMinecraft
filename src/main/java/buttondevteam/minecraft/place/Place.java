package buttondevteam.minecraft.place;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.architecture.Component;
import buttondevteam.minecraft.place.commands.Cube;

public class Place extends Component{

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new Cube());
	}
	
}