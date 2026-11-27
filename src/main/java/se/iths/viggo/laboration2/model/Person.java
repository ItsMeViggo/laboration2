package se.iths.viggo.laboration2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private static Integer id = 0;

    private Integer personId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final LocalDate employmentDate;
    private final Section section;
    private AccessCard accessCard;

    private final List<Competence> competences = new ArrayList<>();

    public Person(String firstName, String lastName, String email, LocalDate employmentDate, Section section) {
        id++;
        personId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.employmentDate = employmentDate;
        this.section = section;
    }

    public Person(String firstName, String lastName, String email, LocalDate employmentDate, Section section, AccessCard accessCard) {
        id++;
        personId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.employmentDate = employmentDate;
        this.section = section;
        this.accessCard = accessCard;
    }

    public Integer getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public Section getSection() {
        return section;
    }

    public AccessCard getAccessCard() {
        return accessCard;
    }

    public void addCompetence(Competence competence) {
        if (!competences.contains(competence)) {
            competences.add(competence);
        }
    }
    
    public List<Competence> getCompetences() {
        return competences;
    }
}
