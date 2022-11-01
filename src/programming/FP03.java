package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Increase salary of the employees by 10% whose age is > 25
 */
public class FP03
{
  public static void main(String[] args)
  {

    List<Employee> employees = new ArrayList<>();

    employees.add(new Employee(1L, "Rohit", 45000D, 15L));
    employees.add(new Employee(2L, "Rahul", 65000D, 10L));
    employees.add(new Employee(3L, "Suresh", 85000D, 27L));
    employees.add(new Employee(4L, "Dinesh", 15000D, 36L));
    employees.add(new Employee(5L, "Utsav", 30000D, 18L));

    increaseSalary(employees);
  }

  private static void increaseSalary(List<Employee> employees)
  {
    System.out.println(employees);
    List<Employee> incrementedEmployeeSalary = employees.stream().filter(e -> e.getEmpAge() > 25).collect(Collectors.toList());

    incrementedEmployeeSalary.stream().map(e ->
    {
      e.setEmpSalary(e.getEmpSalary() + 0.10 * e.getEmpSalary());
      return e;
    }).forEach(System.out::println);
  }
}
