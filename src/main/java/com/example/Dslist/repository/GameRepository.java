package com.example.Dslist.repository;


import com.example.Dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game , Long> {
}
