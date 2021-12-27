package framework.TTH1;

import java.util.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("display in hashMap");
        System.out.println(hashMap + "\n");

        Map < String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("display");
        System.out.println(treeMap);


        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("tu", 31);
        linkedHashMap.put("trung", 29);
        linkedHashMap.put("hieu", 29);
        System.out.println("display");
        System.out.println(linkedHashMap.get("tu"));
    }
}
