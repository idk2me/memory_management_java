package Coursework.Rig.MemoryManagement;

import java.util.LinkedList;

// this is going to be a singleton class
public class Memory {
  private static final int MAX_MEMORY = 1024;
  private static Memory memory;
  private LinkedList<Chunk> chunks = new LinkedList<>();

  private Memory() {}; // private constructor

  static {
    try {
      memory = new Memory();
    } catch (Exception e) {
      throw new RuntimeException("Exception occurred in creating singleton instance");
    }
  }

  public Memory getInstance() {
    return memory;
  }

  public void malloc(){};
}