package ru.tiktaktoe.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.tiktaktoe.entity.GameInstance;

public interface GameInstanceRepo extends JpaRepository<GameInstance, Integer> {
}
