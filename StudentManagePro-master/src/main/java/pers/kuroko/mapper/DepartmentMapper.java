package pers.kuroko.mapper;

import pers.kuroko.entity.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> queryAllDepartment();

    int addDepartment(Department department);

    Department queryDepartmentById(int id);

    int deleteDepartmentById(int id);

    int updateDepartment(Department department);
}
