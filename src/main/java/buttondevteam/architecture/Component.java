package buttondevteam.architecture;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.architecture.commands.BaseCommand;
import buttondevteam.lib.TBMCCoreAPI;
import buttondevteam.lib.chat.TBMCChatAPI;

/**
 * A Module class allows the compacting of projects into one single package. 
 * 
 * Each feature can have its commands and listeners coded into the Module class,
 * as well as any other pointers to memory units, or other classes in the package. 
 * 
 * This package can then be moved from eclipse project to eclipse project smoothly, 
 * as long as the destination project has the Module abstract class, and as long as all dependencies are either
 * contained in the moved package, or moved along with it.
 * @author Alisolarflare
 *
 */
public abstract class Component{
	/**
	 * Registers the module, when called by the JavaPlugin class. Call
	 * registerCommand() and registerListener() within this method.
	 * 
	 * @param plugin	Plugin class called to register commands and listeners
	 */
	public abstract void register(JavaPlugin plugin);
	/**
	 * Registers a TBMCCommand to the plugin
	 * @param plugin          Main plugin responsible for stuff
	 * @param label           Name of the command in plugin.yml
	 * @param commandExecutor Custom coded CommandExecutor class 
	 */
	protected void registerCommand(JavaPlugin plugin, BaseCommand commandBase){
		TBMCChatAPI.AddCommand(plugin, commandBase);
		//plugin.getCommand(commandBase.getClass().getSimpleName().toString()).setExecutor(commandBase);
	}
	/**
	 * Registers a Listener to this plugin
	 * @param plugin          Main plugin responsible for stuff
	 * @param label           Name of the command in plugin.yml
	 * @param commandExecutor Custom coded CommandExecutor class 
	 */
	protected Listener registerListener(JavaPlugin plugin, Listener listener){
		TBMCCoreAPI.RegisterEventsForExceptions(listener, plugin);
		return listener;
	}

	public void saveData(FileConfiguration config, String pathToData, Object data){
		config.set("moduledata." + this.getClassName() + "." + pathToData, data);
	}
	public Object getData(FileConfiguration config, String pathToData, Object data){
		return config.get("moduledata." + this.getClassName() + "." + pathToData, data);
	}
	
	public String getClassName(){
		Class<?> enclosingClass = getClass().getEnclosingClass();
		String className = "nullModule";
		if (enclosingClass != null) {
		  className = (enclosingClass.getName());
		} else {
		  className = (getClass().getName());
		}
		return className;
	}
	
}
