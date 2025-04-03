package edu.cnm.deepdive.farkle.model.dto;

import com.google.gson.annotations.Expose;
import java.util.UUID;

public class User {

  @Expose(serialize = false)
  private UUID key;

  @Expose
  private String displayName;
//Can be used to update profile
}
