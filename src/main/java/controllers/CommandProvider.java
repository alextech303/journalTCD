package controllers;

import java.util.HashMap;
import java.util.Map;

import controllerImpl.GoToErrorPage;
import controllerImpl.Go_To_Base_Page;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.GO_TO_ERROR_PAGE, new GoToErrorPage());
		commands.put(CommandName.GO_TO_BASE_PAGE, new Go_To_Base_Page());
	}

	public Command getCommand(String name) {
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;

	}

}
