package seedu.address.logic.commands;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;

import org.junit.jupiter.api.Test;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.HelpCommand.SHOWING_HELP_MESSAGE;

public class RemarkCommandTest {
    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();

    @Test
    public void execute() {
        assertCommandFailure(new RemarkCommand(), model, "MESSAGE_NOT_IMPLEMENTED_YET");
    }
}
