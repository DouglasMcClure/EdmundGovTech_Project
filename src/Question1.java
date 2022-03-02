import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList nameList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();

            input = input.toUpperCase();
            int digits = 005;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                stringBuilder.append(input.charAt(i));
            }
            for (int j = 0; j < nameList.size(); j++) {
                for (int k = 0; k < nameList.size(); k++) {

                    if (nameList.get(j).equals(nameList.get(k))){
                        stringBuilder.append(digits + 005);
                    }
                    else {
                        digits = 005;
                        stringBuilder.append(digits);
                    }
                }
            }
            System.out.println(stringBuilder);
            nameList.add(stringBuilder);
            System.out.println(nameList);
        }
    }
}
