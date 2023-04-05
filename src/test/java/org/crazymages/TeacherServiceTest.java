package org.crazymages;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TeacherServiceTest {

    @Test
    public void test() {
        //given
        TeacherService teacherService = new TeacherService();
        Teacher excepted = new Teacher();
        excepted.group = Set.of("43e");
        excepted.name = "Даниил";
        excepted.teacherClass = "java";

        //when
        Teacher daniil = teacherService.createTeacherDaniil();

        //then
        assertEquals(excepted, daniil);

        assertEquals(excepted.group, daniil.group);
        assertEquals(excepted.name, daniil.name);
        assertEquals(excepted.teacherClass, daniil.teacherClass);

    }

}