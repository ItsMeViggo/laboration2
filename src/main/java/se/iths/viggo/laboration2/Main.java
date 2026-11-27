package se.iths.viggo.laboration2;

import se.iths.viggo.laboration2.model.AccessCard;
import se.iths.viggo.laboration2.model.Competence;
import se.iths.viggo.laboration2.model.Person;
import se.iths.viggo.laboration2.model.Section;

import java.time.LocalDate;
import java.util.List;

public class Main {
    static void main() {
        Section headquartersSection = new Section("Headquarters", "Stockholm");
        Section viewPointSection = new Section("View Point", "Gothenburg");
        Section overseasSection = new Section("Overseas", "London");

        List<Competence> competences = List.of(
                new Competence("Java", "Java Programming"),
                new Competence("SQL", "Relational Database"),
                new Competence("Project Management", "Managing Projects")
        );

        List<Person> persons = List.of(
                new Person("Alexander", "Svensson", "alex.svensson@company.se",
                        LocalDate.of(2021, 1, 1), headquartersSection,
                        new AccessCard("CARD-001", LocalDate.of(2021, 1, 1), LocalDate.of(2030, 1, 1))),

                new Person("Erik", "Andersson", "erik.andersson@company.se",
                        LocalDate.of(2020, 3, 15), headquartersSection),

                new Person("Anna", "Johansson", "anna.johansson@company.se",
                        LocalDate.of(2021, 8, 1), headquartersSection,
                        new AccessCard("CARD-002", LocalDate.of(2021, 8, 1), LocalDate.of(2030, 8, 1))),

                new Person("Oscar", "Karlsson", "oscar.karlsson@company.se",
                        LocalDate.of(2023, 1, 10), headquartersSection,
                        new AccessCard("CARD-003", LocalDate.of(2023, 1, 10), LocalDate.of(2030, 1, 10))),

                new Person("Emma", "Nilsson", "emma.nilsson@company.se",
                        LocalDate.of(2022, 5, 20), headquartersSection),

                new Person("Sofia", "Lindberg", "sofia.lindberg@company.se",
                        LocalDate.of(2019, 11, 12), headquartersSection,
                        new AccessCard("CARD-004", LocalDate.of(2019, 11, 12), LocalDate.of(2030, 11, 12))),

                new Person("William", "Larsson", "william.larsson@company.se",
                        LocalDate.of(2021, 4, 15), viewPointSection,
                        new AccessCard("CARD-005", LocalDate.of(2021, 4, 15), LocalDate.of(2030, 4, 15))),

                new Person("Alice", "Olsson", "alice.olsson@company.se",
                        LocalDate.of(2023, 6, 1), viewPointSection,
                        new AccessCard("CARD-006", LocalDate.of(2023, 6, 1), LocalDate.of(2030, 6, 1))),

                new Person("Hugo", "Persson", "hugo.persson@company.se",
                        LocalDate.of(2025, 2, 10), viewPointSection),

                new Person("Maja", "Eriksson", "maja.eriksson@company.se",
                        LocalDate.of(2024, 8, 19), viewPointSection,
                        new AccessCard("CARD-007", LocalDate.of(2024, 8, 19), LocalDate.of(2030, 8, 19)))
        );

        persons.getFirst().addCompetence(competences.get(0));
        persons.getFirst().addCompetence(competences.get(2));

        persons.get(1).addCompetence(competences.get(0));

        persons.get(2).addCompetence(competences.get(2));

        persons.get(4).addCompetence(competences.get(0));

        persons.get(6).addCompetence(competences.get(2));

        for (Person person : persons) {
            IO.println("Person ID: " + person.getPersonId());
            IO.println("Name: " + person.getFirstName() + " " + person.getLastName());
            IO.println("Email: " + person.getEmail());
            IO.println("Employment date: " + person.getEmploymentDate());

            IO.println("Section: " + person.getSection().getName());
            IO.println("City: " + person.getSection().getCity());

            if (person.getAccessCard() != null) {
                AccessCard card = person.getAccessCard();

                IO.println("Card number: " + card.getCardNumber());
                IO.println("Issue date: " + card.getIssueDate());
                IO.println("Validity date: " + card.getValidityDate());
            } else {
                IO.println("Access card: None");
            }

            if (!person.getCompetences().isEmpty()) {
                IO.println("Competences:");
                for (Competence competence : person.getCompetences()) {
                    IO.println(competence.getCompetenceName());
                }
            }

            System.out.println("--------------------------------");
        }

    }
}
