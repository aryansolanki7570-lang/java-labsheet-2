
import java.util.Scanner;

class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = (ch >= 'a' && ch <= 'z' ||
                         ch >= 'A' && ch <= 'Z') ?
                        ("aeiouAEIOU".indexOf(ch) >= 0 ?
                        "Vowel" : "Consonant") :
                        (ch >= '0' && ch <= '9' ?
                        "Digit" : "Special Symbol");

        System.out.println(result);

        sc.close();
    }
}

}
