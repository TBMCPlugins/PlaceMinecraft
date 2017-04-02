package buttondevteam.minecraft.place;

import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.architecture.Component;
import buttondevteam.minecraft.place.commands.Cube;

public class PlaceComponent extends Component{
	public Writer writer;
	public Reader reader;
	public Translator translator;

	@Override
	public void register(JavaPlugin plugin) {
		this.registerCommand(plugin, new Cube(this));
		
		this.writer = new Writer();
		this.reader = new Reader();
		this.translator = new Translator();
		
	}
	
}