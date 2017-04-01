package buttondevteam.architecture.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class PlayerCommand extends BaseCommand{
	/**replaces CommandExecutor functionality*/
	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args){
		return OnCommand(sender, string, args);
	}
	/**replaces TBMCCommandBase functionality*/
	@Override
	public boolean OnCommand(CommandSender sender, String alias, String[] args){
		return OnCommand((Player) sender, alias, args);
	}
	public abstract boolean OnCommand(Player player, String alias, String[] args);
	@Override
	public boolean GetPlayerOnly() {
		return true;
	}

	@Override
	public boolean GetModOnly() {
		return false;
	}
	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
			"This command doesn't have help text.	",
			"If you're a player, ask a mod to write one",
			"If you're a mod, ask a dev to write one",
			"If you're a dev, write the help text you lazy bastard. -Ali"
		};
	}
	
}
