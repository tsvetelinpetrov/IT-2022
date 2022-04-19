package sit.tu_varna.bg.models;

import java.util.Set;
import java.util.TreeSet;

public class Skills {
    private Set<Skill> jobSkills;
    private Set<Skill> personaSkills;

    public Skills() {
        jobSkills = new TreeSet<Skill>() {{
            add(new Skill("Java", (short) 0));
            add(new Skill("HTML", (short) 0));
            add(new Skill("CSS", (short) 0));
            add(new Skill("JavaScript", (short) 0));
        }};

        personaSkills = new TreeSet<Skill>() {{
            add(new Skill("Комуникативност", (short) 0));
            add(new Skill("Работа в екип", (short) 0));
            add(new Skill("Креативност", (short) 0));
        }};
    }

    public void updateJobSkills(String name, short value) {
        Skill skill = new Skill(name, value);
        jobSkills.remove(skill);
        jobSkills.add(skill);
    }

    public void updatePersonSkills(String name, short value) {
        Skill skill = new Skill(name, value);
        personaSkills.remove(skill);
        personaSkills.add(skill);
    }

    public Set<Skill> getJobSkills() {
        return jobSkills;
    }

    public Set<Skill> getPersonaSkills() {
        return personaSkills;
    }
}
