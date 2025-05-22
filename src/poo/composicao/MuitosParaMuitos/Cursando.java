package poo.composicao.MuitosParaMuitos;

public class Cursando {
    public static void main(String[] args) {

        Curso course = new Curso("Calculus");
        Curso course1 = new Curso("Software Engineering");
        
        Aluno student1 = new Aluno("James");

        student1.addCourse(course);
        student1.addCourse(course1);

        for (Curso courses : student1.courses) {
            System.out.println(courses.name);
        }
    }
}
