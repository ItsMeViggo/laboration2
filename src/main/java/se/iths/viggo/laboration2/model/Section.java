package se.iths.viggo.laboration2.model;

public class Section {
    private static Integer id = 0;

    private Integer sectionId = 0;
    private final String name;
    private final String city;

    public Section(String name, String city) {
        id++;
        this.sectionId = id;
        this.name = name;
        this.city = city;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
