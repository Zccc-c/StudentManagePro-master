package pers.kuroko.service;

import pers.kuroko.entity.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> queryAllManager();

    Manager queryManagerById(int managerId);

    int addManager(Manager manager);

    int deleteManagerById(int id);

    int updateManager(Manager manager);
}
