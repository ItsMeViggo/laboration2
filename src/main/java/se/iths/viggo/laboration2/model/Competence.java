package se.iths.viggo.laboration2.model;

public class Competence {
    private static Integer id = 0;

    private final Integer competenceId;
    private final String competenceName;
    private final String description;

    public Competence(String competenceName, String description) {
        id++;
        this.competenceId = id;
        this.competenceName = competenceName;
        this.description = description;
    }

    public Integer getCompetenceId() {
        return competenceId;
    }

    public String getCompetenceName() {
        return competenceName;
    }

    public String getDescription() {
        return description;
    }
}
