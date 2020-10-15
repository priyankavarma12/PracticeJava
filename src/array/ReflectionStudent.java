package array;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReflectionStudent {

    public static void main(String[] args) {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        /* Get names from Methods */
        List<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add( method.getName() );
        }
        /* Sort and print names */
        Collections.sort( methodList );
        for(String name : methodList){
            System.out.println(name);
        }

    }
}
