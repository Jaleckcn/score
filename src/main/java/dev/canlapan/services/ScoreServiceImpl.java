package dev.canlapan.services;

import dev.canlapan.entities.Score;
import dev.canlapan.repos.ScoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoreRepo scoreRepo;

    @Override
    public Score registerScore(Score score) {
        return null;
    }

    @Override
    public List<Score> getAllScores() {
        return this.scoreRepo.findAll();
    }
}
