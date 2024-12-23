package String;

public class SameANDreverse {

    public static void main(String[] args) {


        String name = "MS DHONI";
        String substring1 = name.substring(0, 2);
        String substring2 = name.substring(3);

        System.out.print(substring1+ " ");
        for (int i = substring2.length()-1; i>=0; i--) {
            System.out.print(substring2.charAt(i));
        }

    }
}
