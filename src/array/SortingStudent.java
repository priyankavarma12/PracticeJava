package array;

import java.util.*;

public class SortingStudent {

    public static void main(String[] args) {
       Scanner in = new Scanner( System.in );
        int i = Integer.parseInt( in.nextLine() );

        List<Student> list = new ArrayList<>();

        while(i>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student s = new Student( id, fname, cgpa );
            list.add( s );

            i--;
        }

        list.sort( Comparator.comparing( Student::getCgpa ).reversed()
                .thenComparing( Student::getFname ).thenComparing( Student::getId ) );

        for(Student st : list){
            System.out.println(st.getFname());
        }
        in.close();
    }
}
