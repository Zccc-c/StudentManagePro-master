package pers.kuroko.service;

import pers.kuroko.entity.Leader;

import java.util.List;

public interface LeaderService {
    List<Leader> queryAllLeader();

    Leader queryLeaderById(int leaderId);

    int addLeader(Leader leader);

    int deleteLeaderById(int id);

    int updateLeader(Leader leader);
}
