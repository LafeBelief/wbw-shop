package cn.wbw.collection;

import java.util.*;

/**
 * @author hyl
 * @date 2021/5/22 14:44
 */
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xxx");
        list.add("xxx");
        list.add("xxx");
        list.add("xxx");
        list.add("xxx");
        list.remove("s");
        list.get(0);
        System.out.println(list);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("s");
        linkedList.add("s");
        linkedList.remove("s");

        HashSet<String> hashSet = new HashSet<>(20);
        hashSet.add("sas");
        hashSet.add("sasx");
        hashSet.remove("sasa");

        HashMap<String,String> map = new HashMap<>(20);
        map.put("sasa","sasa");
        map.put("sasa","sasa");
        map.put("sasa","saa");
        map.remove("xaxa");
//        Map<String,String> stringMap = new

        System.out.println(map.hashCode());
        System.out.println("xaa".hashCode());
        System.out.println(list.hashCode());
    }
}
