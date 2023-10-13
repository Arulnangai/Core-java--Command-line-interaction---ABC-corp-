package bean;

import java.util.ArrayList;

public class Skill {
    private String technology;
    private int experience;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Skill(String technology, int experience) {
        this.technology = technology;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "technology='" + technology + '\'' +
                ", experience=" + experience +
                '}';
    }
}

