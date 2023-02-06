import java.util.Scanner;
public class ausTut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Internet internetObjekt = new Internet();
        System.out.println("Bitte geben Sie den Namen des Chefs ein: ");
        String temp = input.nextLine();
        intenetObjekt.setBossName(temp);
        System.out.println("Der Name des Chefs ist: " + internetObjekt.getBossName());
    }
}
