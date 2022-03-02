import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

    private static String digits(String name){
        ArrayList nameList = new ArrayList();
        nameList.add(name);
        int digits = 005;
        for (int j = 0; j < nameList.size(); j++) {
            for (int k = 0; k < nameList.size(); k++) {
                String otherName = nameList.get(k).toString();
                if (name.equals(otherName.substring(0, 2))){
                    String addDigits = name;
                    addDigits = addDigits.substring(addDigits.length()-3);
                    digits = Integer.parseInt(addDigits) + 005;
                    System.out.println(digits);
                    addDigits = addDigits + String.valueOf(digits);
                    return addDigits;
                }
            }
        }
        name = name + digits;
        return name;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList nameList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();

            input = input.toUpperCase();

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                stringBuilder.append(input.charAt(i));
            }
            String newName = digits(input);
            System.out.println(newName);
            nameList.add(newName);
            System.out.println(nameList);
        }
    }
}
