package seedu.address.model.assignment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class AssignmentIdTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new AssignmentId(null));
    }

    @Test
    public void constructor_invalidId_throwsIllegalArgumentException() {
        String invalidId = "";
        assertThrows(IllegalArgumentException.class, () -> new AssignmentId(invalidId));
    }

    @Test
    public void isValidId() {
        // invalid id
        assertFalse(AssignmentId.isValidAssignmentId(null)); // null
        assertFalse(AssignmentId.isValidAssignmentId("")); // empty string
        assertFalse(AssignmentId.isValidAssignmentId(" ")); // spaces only
        assertFalse(AssignmentId.isValidAssignmentId("^")); // only non-alphanumeric characters
        assertFalse(AssignmentId.isValidAssignmentId("5252*")); // contains non-alphanumeric characters
        assertFalse(AssignmentId.isValidAssignmentId("abac gjku")); // alphabets only
        assertFalse(AssignmentId.isValidAssignmentId("kk12658j")); // alphanumeric characters
        assertFalse(AssignmentId.isValidAssignmentId("A0276123J20")); // with capital letters
        assertFalse(AssignmentId.isValidAssignmentId("A0276123J20 A2552 6456 R20")); // long names

        // valid id
        assertTrue(AssignmentId.isValidAssignmentId("12345")); // numbers only
    }

    @Test
    public void equals() {
        AssignmentId id = new AssignmentId("123");

        // same values -> returns true
        assertTrue(id.equals(new AssignmentId("123")));

        // same object -> returns true
        assertTrue(id.equals(id));

        // null -> returns false
        assertFalse(id.equals(null));

        // different types -> returns false
        assertFalse(id.equals(5.0f));

        // different values -> returns false
        assertFalse(id.equals(new AssignmentId("223")));
    }
}