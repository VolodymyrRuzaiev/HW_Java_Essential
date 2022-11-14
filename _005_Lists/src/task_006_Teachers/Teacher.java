package task_006_Teachers;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Comparable<Teacher> {
    List<Teacher> teachers = new ArrayList<>();
    private String name;
    private Integer level;

    public Teacher(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.level.compareTo(o.level);
    }

    @Override
    public String toString() {
        return "Teacher{" + "name='" + name + '\'' + ", level=" + level + '}';
    }
}

