import java.util.Scanner;

public class letterToGrrade {

    public static void main(String arg[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Grade letter :");
        String grade = scanner.nextLine();

        if (!(grade.length() <= 2)) {
            System.out.println("Enter a valid charecter.");
        }

        Grade Grade = new Grade();

        System.out.println(Grade.getNumericGrade(grade));


    }
}
