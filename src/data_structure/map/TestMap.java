package data_structure.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        Map<String, Student> treeMap = new TreeMap<String, Student>();
        Map<Student, String> treeMap1 = new TreeMap<>();
        // add elements to treeMap
        treeMap.put("1a", new Student("A", 12, "Hanoi"));
        treeMap.put("3s", new Student("C", 13, "Hanoi"));
        treeMap.put("2df", null);
        treeMap.put("5sdf", null);
        treeMap.put("4sdf", new Student("D", 14, "Hanoi"));

        // show treeMap
        show(treeMap);



        treeMap1.put(new Student("D", 14, "Hanoi"),"12");

    }

    public static void show(Map<String, Student> map) {
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
class Student{
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student@name=" + name + ",age=" + age + ",address=" + address;
    }
}
