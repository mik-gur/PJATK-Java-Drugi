package service;

import entity.Student;

import java.util.Scanner;

public class StudentService {

    private Student student = new Student();

    private Student student2 = new Student();

    public Student setFirstExerciseStudent() {
        student.setImie("Mikołaj");
        student.setNazwisko("Gurgul");
        student.setGrupa(22);
        student.setKierunek("Informatyka");
        return student;
    }

    public Student setStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        student2.setImie(scanner.nextLine());
        System.out.println("Podaj nazwisko: ");
        student2.setNazwisko(scanner.nextLine());
        System.out.println("Podaj grupę: ");
        student2.setGrupa(scanner.nextInt());
        System.out.println("Podaj kierunek: ");
        scanner = new Scanner(System.in);
        student2.setKierunek(scanner.nextLine());
        return student2;
    }
    public void getStudent(Student student) {
        System.out.println("imie: " +student.getImie());
        System.out.println("nazwisko: " + student.getNazwisko());
        System.out.println("grupa: " + student.getGrupa());
        System.out.println("kierunek: "+ student.getKierunek());
        System.out.println("");
    }
}
