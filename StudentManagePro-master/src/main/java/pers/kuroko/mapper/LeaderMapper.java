package pers.kuroko.mapper;

import pers.kuroko.entity.Leader;

import java.util.List;

public interface LeaderMapper {
    List<Leader> queryAllLeader();

    Leader queryLeaderById(int leaderId);

    int addLeader(Leader leader);

    int deleteLeaderById(int leaderId);

    int updateLeader(Leader leader);
}
