package poo.composicao.MuitosParaMuitos;

import java.util.ArrayList;

public class Aluno {
    
    final String name;
    final ArrayList<Curso> courses = new ArrayList<>();

    Aluno(String name){
        this.name = name;
    }

    public void addCourse(Curso course){
        this.courses.add(course);
        course.students.add(this);
    }
}
