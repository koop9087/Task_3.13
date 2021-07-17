import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] stringArray = line.split(" ");
        for(int i = 0, j = 1; i < stringArray.length && j < stringArray.length; i++, j++) {
            if(stringArray[i].length() > stringArray[j].length()) {
                 result = stringArray[i];
            }
        }
        System.out.println(result);
    }
}
