package com.example.Dslist.service;

import com.example.Dslist.dto.GameListDto;
import com.example.Dslist.entities.GameList;
import com.example.Dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameListService {  // Nome corrigido para GameListService

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {  // Corrigido para retornar List<GameListDto>
        List<GameList> result = gameListRepository.findAll();
        List<GameListDto> dto = new ArrayList<>();

        for (GameList gameList : result) {
            dto.add(new GameListDto(gameList));
        }

        return dto;
    }
}
