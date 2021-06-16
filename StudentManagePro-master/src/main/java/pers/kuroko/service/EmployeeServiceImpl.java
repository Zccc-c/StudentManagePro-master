package pers.kuroko.service;

import pers.kuroko.entity.Employee;
import pers.kuroko.mapper.EmployeeMapper;

import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService{

    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int deleteEmployeeById(int id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public Employee queryEmployeeById(int id) {
        return employeeMapper.queryEmployeeById(id);
    }

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }
}
