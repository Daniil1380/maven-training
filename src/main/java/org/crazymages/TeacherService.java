package org.crazymages;

import java.util.Set;

public class TeacherService {


    public Teacher createTeacherDaniil() {
        Teacher teacher = new Teacher();
        teacher.teacherClass = "java";
        teacher.name = "даниил";
        teacher.group = Set.of("43e");
        return teacher;
    }

}
