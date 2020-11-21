import java.util.ArrayList;

import java.util.Scanner;

/*
Task
https://docs.google.com/viewer?url=http://statement.bacs.cs.istu.ru/statement/get/CjpiYWNzL3Byb2JsZW0vc2Nob29sXzhfNF9oaXN0b2dyYW0vc3RhdGVtZW50L3ZlcnNpb25zL0MvcGRmEgYKBHFVbvI/bacs/Jm9ErpvzCyltpZnjP_d0wwWrnSYCYJ7i4auWQVgA6o5cntasMRD62OLiYcR8qpKHNtNhIUzsGzTPsF_AE1L6Hza_njpIm-JZPbcNlqtImx0Dtc83tVRQ7CvWQuUZAzjIDr0MDJwE82fUc4QiVYCTQRTj9L7Z_AtWtcMTCT8o9X6BJlepU7sab_sCOFfE12CFt6SfxF_Yq6R4bDOSpPFbgKhN7POR3slG1vDUlQiQ7kR2F-84o0WLwfvk214QCdQewxTm2y-3f_9DNg2rtBnDMLdDKRJ4lUsF4_j-2TbKk4_f3IBY__oH3M7OhWuuJSY551LxpggylnV5VeqkCl9Z1A
*/

public class Task2 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> chars = new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            chars.add(0);
        }
        String line;
        while (sc.hasNext()) {
            line = sc.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char current = line.charAt(i);
                if (current != ' ') {
                    chars.set(current, chars.get(current) + 1);
                }
            }
        }

        int height = Integer.MIN_VALUE;
        for (int x : chars) {
            if (height < x) {
                height = x;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < chars.size(); j++) {
                if (chars.get(j) != 0)
                    if (chars.get(j) >= height - i) {
                        System.out.print('#');
                    } else {
                        System.out.print(' ');
                    }
            }
            System.out.println();
        }

        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i) != 0) System.out.print((char) i);
        }
    }
}
