import java.util.LinkedList;
import java.util.Scanner;

/*
Task
https://docs.google.com/viewer?url=http://statement.bacs.cs.istu.ru/statement/get/CjNiYWNzL3Byb2JsZW0vc2Nob29sXzhfNl84L3N0YXRlbWVudC92ZXJzaW9ucy9ydS9wZGYSBgoEui7mVQ/bacs/Sny7192E9aaStOnjQ1CkQGeLyTJKIkhcw51yghJaXhUOInj39UfNWSIV1VqdcKoI3QA5wepkq96uIR5PwqA_Hr0obWH77b0N7Pp0rigfVFXeo34PfICYyG1PlMmMJZIZUwtqslHQ8n-XXiUjjgaELWUFBVo4WrK7ix3eqAc4Xp4Q7jtYAu1hhfWh_dnT0jiVuFM97KdoRHiYn2ibiurBNCBsppAEtSpQcSJvyowH5o44Ib-Yh41nxYuFnS3CguSNzV9G6bSjjqYdEXjUoNKNOEV9UrH8EYsMQR3m_osOvF6Eeuont73nhzZwz5u5owBRisGohr3HHMNuxPhicTwCoQ
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (string.length() - 1 < i * i) {
                count = i - 1;
                break;
            }
        }

        LinkedList<Character> chars = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            chars.add(string.charAt(i));
        }

        for (int i = count; i > 1; i--) {
            chars.add(i*i + 1, chars.get(i));
            chars.remove(i);
        }

        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println();
    }
}
