package edu.cnm.deepdive.farkle.model.dao;

import edu.cnm.deepdive.farkle.model.entity.Roll;
import edu.cnm.deepdive.farkle.model.entity.RollDie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RollDieRepository extends JpaRepository<RollDie, Long> {

  List<RollDie> findByRoll(Roll roll);

}