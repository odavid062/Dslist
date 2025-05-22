package com.example.Dslist.dto;

import com.example.Dslist.entities.GameList;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto(){

    }
    public GameListDto(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
