package pers.kuroko.mapper;

import pers.kuroko.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> queryAllEmployee();

    public int addEmployee(Employee employee);

    public int deleteEmployeeById(int id);

    public int updateEmployee(Employee employee);

    public Employee queryEmployeeById(int id);
}
