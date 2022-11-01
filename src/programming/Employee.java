package programming;

public class Employee
{
  private Long empId;
  private String empName;
  private Double empSalary;
  private Long empAge;

  public Employee(Long empId, String empName, Double empSalary, Long empAge)
  {
    this.empId = empId;
    this.empName = empName;
    this.empSalary = empSalary;
    this.empAge = empAge;
  }

  public Long getEmpId()
  {
    return empId;
  }

  public void setEmpId(Long empId)
  {
    this.empId = empId;
  }

  public String getEmpName()
  {
    return empName;
  }

  public void setEmpName(String empName)
  {
    this.empName = empName;
  }

  public Double getEmpSalary()
  {
    return empSalary;
  }

  public void setEmpSalary(Double empSalary)
  {
    this.empSalary = empSalary;
  }

  public Long getEmpAge()
  {
    return empAge;
  }

  public void setEmpAge(Long empAge)
  {
    this.empAge = empAge;
  }

  @Override
  public String toString()
  {
    return "Employee{" +
        "empId=" + empId +
        ", empName='" + empName + '\'' +
        ", empSalary=" + empSalary +
        ", empAge=" + empAge +
        '}';
  }
}
