import com.workintech.company.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        Employee employee1 = new Employee(1, "Gülbeyaz", "Özer");
        Employee employee2 = new Employee(2, "Maya", "Özer");
        Employee employee3 = new Employee(3, "Mehmet", "Özer");
        Employee employee4 = new Employee(1, "Melisa", "Bayram");
        Employee employee5 = new Employee(4, "Beren", "Bayram");
        Employee employee6 = new Employee(3, "Bahar", "Bayram");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        System.out.println("employees listesi: " + employees);

        System.out.println("**************");

        List<Employee> arrayToEmployees = new ArrayList(employees);
        List<Employee> repeatEmployees = new LinkedList<>();
        Map<Long,String> mapEmployees=new HashMap<>();

        System.out.println("employees Array listesi: " + arrayToEmployees);

        System.out.println("****************************");

        for (int i = 0; i < arrayToEmployees.size() - 1; i++) {
            for (int j = i + 1; j < arrayToEmployees.size(); j++) {
                if (arrayToEmployees.get(i).getId() == arrayToEmployees.get(j).getId()) {
                    repeatEmployees.add(arrayToEmployees.get(j));
                    arrayToEmployees.remove(arrayToEmployees.get(j));
                }else{
                    mapEmployees.put(arrayToEmployees.get(i).getId(),arrayToEmployees.get(i).getEmployee());
                }
            }
        }
        System.out.println("cleaned list :"+arrayToEmployees);
        System.out.println("repeat list :"+repeatEmployees);
        System.out.println("map :"+mapEmployees);

    }
}
