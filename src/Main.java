import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new FileInputStream("grades.csv"));
        sc.nextLine();
        List<Integer> grades = new ArrayList<>();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int firstComma = line.indexOf(",");
            String noClassName = line.substring(firstComma + 1);
            int secondComma = noClassName.indexOf(",");
            String noClssNumber = noClassName.substring(secondComma + 1);
            String gradeasString = noClssNumber.substring(0, noClssNumber.indexOf(","));
            grades.add(Integer.parseInt(gradeasString));
        }

        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        System.out.println("Average: " + sum / grades.size());
    }
}