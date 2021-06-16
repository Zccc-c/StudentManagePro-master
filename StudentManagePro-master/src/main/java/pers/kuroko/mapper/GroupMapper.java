package pers.kuroko.mapper;

import pers.kuroko.entity.Group;

import java.util.List;

public interface GroupMapper {
    List<Group> queryAllGroup();

    Group queryGroupById(int groupId);

    int addGroup(Group group);

    int deleteGroupById(int groupId);

    int updateGroup(Group group);
}
