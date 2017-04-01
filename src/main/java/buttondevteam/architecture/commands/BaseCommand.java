package buttondevteam.architecture.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import buttondevteam.lib.chat.TBMCCommandBase;

public abstract class BaseCommand extends TBMCCommandBase implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		return OnCommand(sender, label, args);
	}
	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
			"This command doesn't have help text ask a dev to write one",
			"If you're a dev, write the help text you lazy bastard. -Ali"
		};
	}
}
