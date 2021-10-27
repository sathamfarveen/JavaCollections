import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasmapExample {

    public static void main(String[] args) {

        Map<Integer,Employee> hasmapex = new HashMap<Integer,Employee>();

        Employee emp1 = new Employee(1,"satham1",10000);
        Employee emp2 = new Employee(2,"satham2",10000);
        Employee emp3 = new Employee(3,"satham3",10000);
        Employee emp4 = new Employee(4,"satham4",10000);

        hasmapex.put(emp1.getId(), emp1);
        hasmapex.put(emp2.getId(), emp2);
        hasmapex.put(emp3.getId(), emp3);
        hasmapex.put(emp4.getId(), emp4);

//        Set<Map.Entry<Integer,Employee>> entries = hasmapex.entrySet();
//
//        for (Map.Entry<Integer,Employee> emp: entries) {
//
//            System.out.println(emp.getKey());
//            Employee employee = emp.getValue();
//            employee.display();
//        }

        Iterator<Integer> iterator= hasmapex.keySet().iterator();

        while(iterator.hasNext()){
          Employee emp = hasmapex.get(iterator.next());
          emp.display();
        }

    }
}
