package poo.composicao.MuitosParaMuitos;

import java.util.ArrayList;

public class Curso {
    final String name;
    final ArrayList<Aluno> students = new ArrayList<>();

    Curso(String name){
        this.name = name;
    }

    public void addStudent(Aluno student){
        this.students.add(student);
        student.courses.add(this);
    }
}
