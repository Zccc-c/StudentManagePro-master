package pers.kuroko.service;

import pers.kuroko.entity.Leader;
import pers.kuroko.mapper.LeaderMapper;

import java.util.List;

public class LeaderServiceImpl implements LeaderService{
    private LeaderMapper leaderMapper;

    public void setLeaderMapper(LeaderMapper leaderMapper) {
        this.leaderMapper = leaderMapper;
    }

    @Override
    public List<Leader> queryAllLeader() {
        return leaderMapper.queryAllLeader();
    }

    @Override
    public Leader queryLeaderById(int leaderId) {
        return leaderMapper.queryLeaderById(leaderId);
    }

    @Override
    public int addLeader(Leader leader) {
        return leaderMapper.addLeader(leader);
    }

    @Override
    public int deleteLeaderById(int id) {
        return leaderMapper.deleteLeaderById(id);
    }

    @Override
    public int updateLeader(Leader leader) {
        return leaderMapper.updateLeader(leader);
    }
}
