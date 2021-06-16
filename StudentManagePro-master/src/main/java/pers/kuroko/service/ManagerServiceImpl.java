package pers.kuroko.service;

import pers.kuroko.entity.Manager;
import pers.kuroko.mapper.ManagerMapper;

import java.util.List;

public class ManagerServiceImpl implements ManagerService{
    private ManagerMapper managerMapper;
    @Override
    public List<Manager> queryAllManager() {
        return managerMapper.queryAllManager();
    }

    @Override
    public Manager queryManagerById(int managerId) {
        return managerMapper.queryManagerById(managerId);
    }

    @Override
    public int addManager(Manager manager) {
        return managerMapper.addManager(manager);
    }

    @Override
    public int deleteManagerById(int id) {
        return managerMapper.deleteManagerById(id);
    }

    @Override
    public int updateManager(Manager manager) {
        return managerMapper.updateManager(manager);
    }

    public void setManagerMapper(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }
}
