import java.util.HashMap;
import java.util.Map;

public class HashmapBasic {

    // for every player we'll give a balance
    //<key, value>
    static HashMap<String, Boolean> map = new HashMap<>();

    public static void main(String[] args) {

        map.put("Magdalena", true);
        map.put("Slyva", false);

        System.out.println(map.get("Magdalena"));

        // Check if a key exists
        if(map.containsKey("Joe")) System.out.println(1);

        // Check if a value exists
        if(map.containsValue(Boolean.FALSE)) System.out.println(2);

        // Loop through all the keys and print values
        for(String s : map.keySet()) System.out.println(s);

        // Loop through all the values and print the key
        for(Boolean s : map.values()) System.out.println(s);

        // Looping through the entry set
        for(Map.Entry key_value : map.entrySet()) System.out.println(key_value);

        // Removing from the hashmap
        map.remove("Slyva");
        for(Map.Entry key_value : map.entrySet()) System.out.println("After remove: \n" + key_value);


    }
}
