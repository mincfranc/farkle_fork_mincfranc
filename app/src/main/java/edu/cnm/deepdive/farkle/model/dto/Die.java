package edu.cnm.deepdive.farkle.model.dto;

import com.google.gson.annotations.Expose;

public class Die {

  @Expose(serialize = false)
  private int value;

  @Expose(serialize = false)
  private int group;

}
