package interview;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1","2","3","4","5");
        System.out.println("Before Converting ::"+stringList);
        System.out.println("After Converting :: "+convertStringToInteger(stringList));

        List<Employee> employees = Arrays.asList(
                new Employee("Priyanka", 101),
                new Employee("Priyanka", 102),
                new Employee("Priyanka", 103),
                new Employee("Priyanka", 104),
                new Employee("John", 105),
                new Employee("John", 106),
                new Employee("John", 107),
                new Employee("Henry", 108),
                new Employee("Henry", 109)
        );
       // Map<String, List<Employee>> employeesByName = employees.stream().collect(Collectors.groupingBy( Employee::getName ));
       // System.out.println(employeesByName);

        Map<String, List<Employee>> employeesByName1 = method( employees );
        System.out.println(employeesByName1);

    }

    private static List<Integer> convertStringToInteger(List<String> stringList){
        if(stringList instanceof  List){
            System.out.println("Print String Type");
        } else {
            System.out.println("Not String Type");
        }
        List<Integer> newList = stringList.stream().map( Integer::parseInt ).collect( Collectors.toList() );
        return  newList;
    }

    private static Map<String,List<Employee>> method(List<Employee> listOfEmployees){
        Map<String, List<Employee>> employeesByName = listOfEmployees.stream().collect( Collectors.groupingBy( Employee::getName ) );
        return employeesByName;
    }


}

/** Using java 8
Input
Priyanka, 101, dob
Priyanka, 102, dob
Priyanka, 103, dob
Priyanka, 104, dob
John, 105, dob
Henry, 106, dob
Henry, 107, dob

Output - All Employees cid w.r.t to names
Priyanka - 101, 102, 103,104 (w.r.t to name )
John - 105 (w.r.t to name)
Henry - 106, 107 (w.r.t name)

Actual Output
 Before Converting ::[1, 2, 3, 4, 5]
 Print String Type
 After Converting :: [1, 2, 3, 4, 5]
 {John=[Employee{name='John', id=105}, Employee{name='John', id=106}, Employee{name='John', id=107}], Priyanka=[Employee{name='Priyanka', id=101}, Employee{name='Priyanka', id=102}, Employee{name='Priyanka', id=103}, Employee{name='Priyanka', id=104}], Henry=[Employee{name='Henry', id=108}, Employee{name='Henry', id=109}]}

 */
