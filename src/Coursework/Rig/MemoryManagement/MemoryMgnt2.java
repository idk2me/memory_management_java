package Coursework.Rig.MemoryManagement;

import java.util.Arrays;

public class MemoryMgnt2 {
  private int[] memory;
  
  public MemoryMgnt2(){
    memory = new int[8192];
    Arrays.fill(memory, 0);
  }

  public void free(int ptr){
    for(int i = 0; i < memory[ptr] + memory[ptr + 1]; i++){
      memory[ptr + i] = 0;
    }
  }

  public int malloc(int size){
    int[] temp = sbrk(size);
    if(temp != null){
      for(int i = 0; i < size; i++){
        memory[i] = temp[i];
      }
      return 1;
    }
    return 0; 
  }

  public int[] sbrk(int size){
    return new int[size];
  }
}
