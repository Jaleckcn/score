package dev.canlapan.services;

import dev.canlapan.entities.Score;

import java.util.List;

public interface ScoreService {

    Score registerScore(Score score);

    List<Score> getAllScores();
}
