package seedu.medmoriser.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.medmoriser.model.Medmoriser;
import seedu.medmoriser.model.Model;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Medmoriser has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setMedmoriser(new Medmoriser());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
