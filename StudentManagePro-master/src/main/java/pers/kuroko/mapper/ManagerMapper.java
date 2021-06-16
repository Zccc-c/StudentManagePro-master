package pers.kuroko.mapper;

import pers.kuroko.entity.Manager;

import java.util.List;

public interface ManagerMapper {
    List<Manager> queryAllManager();

    Manager queryManagerById(int managerId);

    int addManager(Manager manager);

    int deleteManagerById(int managerId);

    int updateManager(Manager manager);
}
