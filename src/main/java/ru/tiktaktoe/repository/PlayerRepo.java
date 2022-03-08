package ru.tiktaktoe.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.tiktaktoe.entity.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer> {
    Player findByName(String name);
}
