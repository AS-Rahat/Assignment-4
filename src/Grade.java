public class Grade {

    private double number;

    public double getNumericGrade(String grade) {

        String ch = "grade";


        if (ch == "A")
            number = 4;
        else if (ch == "B")
            number = 3;
        else if (ch == "C")
            number = 2;
        else if (ch == "D")
            number = 1;
        else if (ch == "F")
            number = 0;
        else if (ch == "A+")
            number = 4.3;
        else if (ch == "A-")
            number = 3.7;
        else if (ch == "B+")
            number = 3.3;
        else if (ch == "B-")
            number = 2.7;
        else
            System.out.println("");

        return number=number;

    }

}
