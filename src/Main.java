import service.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Zadanie 2.1
        StudentService studentService = new StudentService();
        studentService.getStudent(studentService.setFirstExerciseStudent());

        // Zadanie 2.2
        studentService.getStudent(studentService.setStudent());

        // Zadanie 2.3
        PrimitiveTypesService primitiveTypesService = new PrimitiveTypesService();
        primitiveTypesService.print();

        // Zadanie 2.4
        TwoStringsCheckerService twoStringsCheckerService = new TwoStringsCheckerService();
        twoStringsCheckerService.print();

        // Zadanie 2.5
        OperatingNumbersService operatingNumbersService = new OperatingNumbersService();
        operatingNumbersService.print();

        // Zadanie 2.6
        TableService tableService = new TableService();
        tableService.print();

        // Zadanie 2.7
        RollerService rollerService = new RollerService();
        rollerService.print();

        // Zadanie 2.8
        LogicalOperatorTableService logicalOperatorTableService = new LogicalOperatorTableService();
        logicalOperatorTableService.print();

        // Zadanie 2.9
        LetterGameService letterGameService = new LetterGameService();
        letterGameService.guessTheLetter();

        // Zadanie 2.10
        PowerOf2Service powerOf2Service = new PowerOf2Service();
        powerOf2Service.printPowerOf2();

        // Zadanie 2.11
        VehicleProg vehicleProg = new VehicleProg();
        vehicleProg.printZad11();

        // Zadanie 2.12
        vehicleProg.printZad12();

        // Zadanie 2.13
        vehicleProg.printZad13();

        //Zadanie 2.14
        vehicleProg.printZad14();
    }
}