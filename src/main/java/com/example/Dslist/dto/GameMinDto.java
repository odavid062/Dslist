package com.example.Dslist.dto;

import com.example.Dslist.entities.Game;

public class GameMinDto {
     private Long id;
     private String tittle;
     private Integer year;
     private String imgUrl;
     private String shortDescription;


    public GameMinDto() {

    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        tittle = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
