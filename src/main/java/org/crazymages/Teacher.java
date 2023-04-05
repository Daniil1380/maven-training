package org.crazymages;

import java.util.Objects;
import java.util.Set;

public class Teacher {

    String name;
    Set<String> group;
    String teacherClass;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (!Objects.equals(name, teacher.name)) return false;
        if (!Objects.equals(group, teacher.group)) return false;
        return Objects.equals(teacherClass, teacher.teacherClass);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (teacherClass != null ? teacherClass.hashCode() : 0);
        return result;
    }
}
