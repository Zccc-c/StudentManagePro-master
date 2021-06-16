package pers.kuroko.service;

import pers.kuroko.entity.Group;
import pers.kuroko.mapper.GroupMapper;

import java.util.List;

public class GroupServiceImpl implements GroupService{

    private GroupMapper groupMapper;

    public void setGroupMapper(GroupMapper groupMapper) {
        this.groupMapper = groupMapper;
    }

    @Override
    public List<Group> queryAllGroup() {
        return groupMapper.queryAllGroup();
    }

    @Override
    public Group queryGroupById(int groupId) {
        return groupMapper.queryGroupById(groupId);
    }

    @Override
    public int addGroup(Group group) {
        return groupMapper.addGroup(group);
    }

    @Override
    public int deleteGroupById(int id) {
        return groupMapper.deleteGroupById(id);
    }

    @Override
    public int updateGroup(Group group) {
        return groupMapper.updateGroup(group);
    }
}
