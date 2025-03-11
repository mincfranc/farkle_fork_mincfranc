package edu.cnm.deepdive.farkle.service;

import edu.cnm.deepdive.farkle.model.entity.UserProfile;
import java.util.UUID;

public interface AbstractUserService {

  UserProfile getCurrent();

  UserProfile get(UUID externalKey);

  UserProfile getOrCreate(String oauthKey, String displayName);

  UserProfile update(UserProfile user);

}
