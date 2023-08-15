package controllers;

import java.util.HashMap;
import java.util.Map;

import controllerImpl.DoWrite23279;
import controllerImpl.DoWriteS500;
import controllerImpl.GoToErrorPage;
import controllerImpl.Go_To_23279;
import controllerImpl.Go_To_Base_Page;
import controllerImpl.Go_To_Do_Write_Page;
import controllerImpl.Go_To_WireS500;
import controllerImpl.Show5WriteInJourney;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.GO_TO_ERROR_PAGE, new GoToErrorPage());
		commands.put(CommandName.GO_TO_BASE_PAGE, new Go_To_Base_Page());
		commands.put(CommandName.GO_TO_23279, new Go_To_23279());
		commands.put(CommandName.DO_WRITE, new DoWrite23279());
		commands.put(CommandName.GO_TO_DO_WRITE_PAGE, new Go_To_Do_Write_Page());
		commands.put(CommandName.SHOW_5_IN_JOURNEY, new Show5WriteInJourney());
		commands.put(CommandName.GO_TO_WIRES500, new Go_To_WireS500());
		commands.put(CommandName.DO_WRITES500, new DoWriteS500());
	}

	public Command getCommand(String name) {
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;

	}

}
