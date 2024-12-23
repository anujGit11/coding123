package String;

import org.springframework.beans.factory.parsing.QualifierEntry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonOcc {

    public static void main(String[] args) {

        String name = "ADNFSGJSGHHGFHBERBGJIOQVF";


        Map<Character,Integer> map = new LinkedHashMap();

        //Occurrence of each characters
        for (int i = 0; i <name.length() ; i++) {

            char ch = name.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);

        //Occurence of 1st non repeating character

        for(Entry<Character,Integer> entrySet : map.entrySet()){
            if(entrySet.getValue() == 1){
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }
}
