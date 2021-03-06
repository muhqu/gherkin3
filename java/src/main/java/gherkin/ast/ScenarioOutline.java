package gherkin.ast;

import java.util.Collections;
import java.util.List;

public class ScenarioOutline extends ScenarioDefinition {
    private final List<Examples> examples;

    public ScenarioOutline(List<Tag> tags, Location location, String keyword, String name, String description, List<Step> steps, List<Examples> examples) {
        super(tags, location, keyword, name, description, steps);
        this.examples = Collections.unmodifiableList(examples);
    }

    public List<Examples> getExamples() {
        return examples;
    }
}
