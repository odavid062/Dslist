package com.example.Dslist.service;


import com.example.Dslist.dto.GameDto;
import com.example.Dslist.dto.GameMinDto;
import com.example.Dslist.entities.Game;
import com.example.Dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDto dto = new GameDto(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = new ArrayList<>();

        for (Game game : result) {
            dto.add(new GameMinDto(game));
        }

        return dto;
    }
}