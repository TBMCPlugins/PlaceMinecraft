package buttondevteam.architecture.commands;

public abstract class CommandBlockCommand extends BaseCommand{
	@Override
	public String[] GetHelpText(String alias){
		return new String[] {
			"This command doesn't have help text.	",
		};
	}
	
	public boolean GetPlayerOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean GetModOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
