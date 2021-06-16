package pers.kuroko.service;

import pers.kuroko.entity.Department;
import pers.kuroko.entity.Student;
import pers.kuroko.mapper.DepartmentMapper;
import pers.kuroko.mapper.StuMapper;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentMapper departmentMapper;

    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }


    @Override
    public List<Department> queryAllDepartment() {
        return departmentMapper.queryAllDepartment();
    }

    @Override
    public int addDepartment(Department department) {
        return departmentMapper.addDepartment(department);
    }

    @Override
    public Department queryDepartmentById(int id) {
        return departmentMapper.queryDepartmentById(id);
    }

    @Override
    public int deleteDepartmentById(int id) {
        return departmentMapper.deleteDepartmentById(id);
    }

    @Override
    public int updateDepartment(Department department) {
        return departmentMapper.updateDepartment(department);
    }
}
