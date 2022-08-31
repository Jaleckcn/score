package dev.canlapan.controllers;

import dev.canlapan.entities.Score;
import dev.canlapan.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/scores")
    @ResponseBody
    public List<Score> allScores(){

        return this.scoreService.getAllScores();
    }
}
