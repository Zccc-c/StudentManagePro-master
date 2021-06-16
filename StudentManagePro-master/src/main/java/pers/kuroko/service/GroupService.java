package pers.kuroko.service;

import pers.kuroko.entity.Group;

import java.util.List;

public interface GroupService {

    List<Group> queryAllGroup();

    Group queryGroupById(int groupId);

    int addGroup(Group group);

    int deleteGroupById(int id);

    int updateGroup(Group group);
}
