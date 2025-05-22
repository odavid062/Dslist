package com.example.Dslist.service;

import com.example.Dslist.dto.GameMinDto;
import com.example.Dslist.entities.Game;
import com.example.Dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = new ArrayList<>();

        for (Game game : result) {
            dto.add(new GameMinDto(game));
        }

        return dto;
    }
}
