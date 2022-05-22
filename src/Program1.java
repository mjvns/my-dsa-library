import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {
    class Student implements Comparable<Student>{
        int id;
        String name;

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public int compareTo(Student o) {
            if(this.name.compareTo(o.name) == 0){
                return this.id - o.id;
            }
            return o.id - this.id;
        }
    }

    public static void main(String args[]){
        List<Student> ls = new ArrayList<Student>();
        Program1 p1 = new Program1();
        ls.add(p1.new Student(1,"Ram"));
        ls.add(p1.new Student(2,"Ram"));
        ls.add(p1.new Student(3,"Ram"));
        ls.add(p1.new Student(4,"Shyam"));
        ls.add(p1.new Student(5,"Harish"));

        Collections.sort(ls);

        for(Student std :ls){
            System.out.println(std.id + " " + std.name);
        }
    }
}
