package seedu.medmoriser.testutil;

import seedu.medmoriser.model.Medmoriser;
import seedu.medmoriser.model.questionset.QuestionSet;

/**
 * A utility class to help with building Medmoriser objects.
 * Example usage: <br>
 *     {@code Medmoriser md = new MedmoriserBuilder().withQuestionSet("John", "Doe").build();}
 */
public class MedmoriserBuilder {

    private Medmoriser medmoriser;

    public MedmoriserBuilder() {
        medmoriser = new Medmoriser();
    }

    public MedmoriserBuilder(Medmoriser medmoriser) {
        this.medmoriser = medmoriser;
    }

    /**
     * Adds a new {@code QuestionSet} to the {@code Medmoriser} that we are building.
     */
    public MedmoriserBuilder withQuestionSet(QuestionSet questionSet) {
        medmoriser.addQuestionSet(questionSet);
        return this;
    }

    public Medmoriser build() {
        return medmoriser;
    }
}