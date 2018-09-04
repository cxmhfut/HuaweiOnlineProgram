package huawei.huawei_066_070;

import java.util.*;

/**
 * 成绩排序
 */
public class Huawei_068 {
    public static class Student {
        String name;
        int score;
        int index;

        Student(String name, int score,int index) {
            this.name = name;
            this.score = score;
            this.index = index;
        }

        @Override
        public String toString() {
            return name + " " + score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            List<Student> students = new ArrayList<>();
            int n = sc.nextInt();
            int ascend = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String name = sc.next();
                int score = sc.nextInt();
                students.add(new Student(name, score,i));
            }

            Collections.sort(students,new MyComparator(ascend));

            for(Student s:students){
                System.out.println(s);
            }
        }

        sc.close();
    }

    public static class MyComparator implements Comparator<Student> {
        int ascend;

        MyComparator(int ascend){
            this.ascend = ascend;
        }

        @Override
        public int compare(Student o1, Student o2) {
            if(o1.score==o2.score){
                return o1.index-o2.index;
            }
            if(ascend==1)return o1.score-o2.score;
            else return o2.score-o1.score;
        }
    }
}
