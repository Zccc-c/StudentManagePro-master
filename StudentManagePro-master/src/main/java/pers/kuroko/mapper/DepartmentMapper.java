package pers.kuroko.mapper;

import pers.kuroko.entity.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> queryAllDepartment();

    int addDepartment(Department department);

    Department queryDepartmentById(int deptId);

    int deleteDepartmentById(int deptId);

    int updateDepartment(Department department);
}
