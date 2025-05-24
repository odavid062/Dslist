package com.example.Dslist.controller;


import com.example.Dslist.dto.GameListDto;
import com.example.Dslist.dto.ReplacementDto;
import com.example.Dslist.projections.GameMinProjection;
import com.example.Dslist.service.GameListService;
import com.example.Dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameListDto findById(@PathVariable Long id) {
        return gameListService.findById(id);
    }

    @GetMapping
    public List<GameListDto> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinProjection> findGames(@PathVariable Long listId) {
        return gameService.findByGameList(listId);
    }


    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDto body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
