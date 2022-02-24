import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        
        System.out.println("\n...ArrayList items...\n");
        List<String> nameList=new ArrayList<>();
        nameList.add("Micheal");
        nameList.add("Tony");
        nameList.add("Birlin");
        nameList.forEach((name)->System.out.println(name));


        System.out.println("\n...HashSet items...");
        Set<Integer> marksSet=new HashSet<>();
        marksSet.add(85);
        marksSet.add(90);
        marksSet.add(87);
        marksSet.forEach((marks)->System.out.println(marks));

        System.out.println("\n...HashMap items...");
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Micheal", 85);
        hashMap.put("Tony", 90);
        hashMap.put("Birlin", 87);
        hashMap.forEach((name,marks)->{ System.out.println(name+" : "+marks);});

        System.out.println("\n...TreeSet items...");
        Set<String> treeSet =new TreeSet<>();
        treeSet.addAll(nameList);
        treeSet.forEach((name)->{System.out.println(name);});

        System.out.println("\n...TreeMap items...");
        Map<String,Integer> treeMap=new TreeMap<>();
        treeMap.putAll(hashMap);
        treeMap.forEach((name,marks)->{ System.out.println(name+" : "+marks);});
    }
    
}