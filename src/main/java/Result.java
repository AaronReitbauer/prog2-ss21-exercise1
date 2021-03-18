import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> modification = new ArrayList<>();

        if (grades.get(0) > 60) {
            System.out.println("Out of Range");
            return new ArrayList<>();
        }

        for (int i=1; i<grades.size(); i++) {
           if (grades.get(i) >= 38) {


               if ((grades.get(i) + 1) % 5 == 0) {
                   modification.add(grades.get(i) + 1);

               } else if ((grades.get(i) + 2) % 5 == 0) {
                   modification.add(grades.get(i) + 2);

               }
               else {
                   modification.add(grades.get(i));
               }

           }
           else {
               modification.add(grades.get(i));
           }
        }


        return modification;
    }




    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int studentsCount = input.nextInt();

        List<Integer> grades = new ArrayList<Integer>(studentsCount);

        for (int i = 0; i < studentsCount; i++) {
            int stud = input.nextInt();
            grades.add(stud);


        }

        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));

        }


    }

}
