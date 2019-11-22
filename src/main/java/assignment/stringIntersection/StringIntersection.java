package assignment.stringIntersection;

import java.util.*;

public class StringIntersection {


    //Using HashSet
    public ArrayList<String> getCommonWord(ArrayList<String> list1, ArrayList<String> list2){

        HashSet<String> set1=new HashSet<String>(list1);
        HashSet<String> set2=new HashSet<String>(list2);

        set1.retainAll(set2);

        ArrayList<String> arrayList = new ArrayList<>(set1);
        Collections.sort(arrayList);

        return arrayList;
    }

    //Using HashMap
    public ArrayList<String> getCommonWord1(ArrayList<String> list1, ArrayList<String> list2){

        HashMap<String,Integer> map1=new HashMap();
        HashMap<String,Integer> map2=new HashMap();

        ArrayList<String> arrayList = new ArrayList<>();
        int n=map1.size();

        for(int i = 0; i < list1.size(); i++){
            if(!map1.containsKey(list1.get(i))){
                map1.put(list1.get(i), 1);
            }
        }

        for(int i = 0; i < list2.size(); i++) {
            if (map1.containsKey(list2.get(i))) {
                map2.put(list2.get(i), 1);
            }
        }

        for (String word:map2.keySet()) {
            arrayList.add(word);
        }

        Collections.sort(arrayList);
        return arrayList;
    }

    //Brute Force
    public ArrayList<String> getCommonWord2(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> arrayList = new ArrayList<>();

        for (String str1:list1) {
            for (String str2:list2) {
                if(str2.equals(str1)){
                    if(!arrayList.contains(str1)){
                        arrayList.add(str1);
                    }
                }
            }

        }
        Collections.sort(arrayList);
        return arrayList;
    }


    public ArrayList<String> getArrayList(String s){

        String[] s1 = s.split(" ");
        ArrayList list=new ArrayList();

        for (String str:s1) {
            list.add(str.toUpperCase());
        }

        Collections.sort(list);
        return list;
    }

}
