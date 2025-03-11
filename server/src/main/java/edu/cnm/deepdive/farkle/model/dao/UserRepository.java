package edu.cnm.deepdive.farkle.model.dao;

import edu.cnm.deepdive.farkle.model.entity.UserProfile;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserProfile,Long> {

  Optional<UserProfile> findByAuthKey(String authKey);

  Optional<UserProfile> findByExternalKey(UUID externalKey);


}
