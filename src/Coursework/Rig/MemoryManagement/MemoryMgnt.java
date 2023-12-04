package Coursework.Rig.MemoryManagement;

import java.util.LinkedList;
import java.util.Queue;

public class MemoryMgnt {
  private Queue chunks = new LinkedList<>();
  public void allocate(int mem2allocate){
    
  }
  public Queue getChunks(){
    return chunks;
  }

  public void free(int mem){
    System.out.println("Freeing " + mem + " bytes of memory");
  }

  public void malloc(int mem){
    System.out.println("Allocating " + mem + " bytes of memory");
  }
}
