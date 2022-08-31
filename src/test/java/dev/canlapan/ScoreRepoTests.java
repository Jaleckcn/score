package dev.canlapan;

import dev.canlapan.entities.Score;
import dev.canlapan.repos.ScoreRepo;
import dev.canlapan.score.ScoreApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest(classes = ScoreApplication.class)
@Transactional //any CRUD operations will not persist outside of the test
//All statements are rolled back
public class ScoreRepoTests {

    @Autowired
    ScoreRepo scoreRepo;

    @Test
    void add_score(){
        Score score = new Score(0,1000,"BBB");
        Score savedScore = this.scoreRepo.save(score);
        Assertions.assertNotEquals(0,savedScore.getId());
    }

    @Test
    void all_scores(){
        Score score1 = new Score(0,1000,"BBB");
        Score savedScore1 = this.scoreRepo.save(score1);

        Score score2 = new Score(0,1000,"BBB");
        Score savedScore2 = this.scoreRepo.save(score2);

        Score score3 = new Score(0,1000,"BBB");
        Score savedScore3 = this.scoreRepo.save(score3);

        Score score4 = new Score(0,1000,"BBB");
        Score savedScore4 = this.scoreRepo.save(score4);


        List<Score> scores = this.scoreRepo.findAll();
        System.out.println(scores);
        Assertions.assertEquals(4,scores.size());

    }



}
