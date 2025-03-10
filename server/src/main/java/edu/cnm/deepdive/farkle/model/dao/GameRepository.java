package edu.cnm.deepdive.farkle.model.dao;

import edu.cnm.deepdive.farkle.model.entity.Game;
import edu.cnm.deepdive.farkle.model.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{

  List<Game> findByUserProfile(User user);
}
