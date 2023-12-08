package Coursework.Rig.MemoryManagement;

import java.util.Arrays;

public class Memory {
  private static int[] memory;
  private int guard; // guard that points to free length
  private int free; // int that shows length of free memory
  // it's 0 if memory is still not asked by sbrk
  private int prev; // pointer to previous block
  private int next; // pointer to next block

  public Memory(){
    memory = new int[8192];
    Arrays.fill(memory, 0);
    memory[1] = free - 5; // free memory length
    memory[memory.length - 1] = -1; // Defines end of memory
  }

  public void allocate(int size){
    int availableSpace = getFree(); 
    memory[availableSpace - size + 5] = 1; // first guard to show that memory is allocated
    memory[availableSpace- size + 6] = size; // available chunk memory
    setFree(getFree() - size); // free memory length

  }

  public void setGuard(int guard){
    this.guard = guard;
  }

  public void setFree(int free){
    this.free = free;
  }

  public void setPrev(int prev){
    this.prev = prev;
  }

  public void setNext(int next){
    this.next = next;
  }

  public int getGuard(){
    return guard;
  }

  public int getFree(){
    return free;
  }

  public int getPrev(){
    return prev;
  }

  public int getNext(){
    return next;
  }

  public int[] getMemory(){
    return memory;
  }

}
