package pers.kuroko.service;

import pers.kuroko.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    public List<Employee> queryAllEmployee();

    public int addEmployee(Employee employee);

    public int deleteEmployeeById(int id);

    public int updateEmployee(Employee employee);

    public Employee queryEmployeeById(int id);
}