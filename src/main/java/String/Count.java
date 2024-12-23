package String;

public class Count {


    public static void main(String[] args) {
        String name = "Aasiisyubsnerikdnjskrgknocwssfgfbbesss";
        char c = 's';
        int count = 0;

        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i) == c){
                count ++;
            }
        }
        System.out.println(count);
    }


}
