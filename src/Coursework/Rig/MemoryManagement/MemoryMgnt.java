package Coursework.Rig.MemoryManagement;

import java.util.Arrays;

public class MemoryMgnt {
  private Memory memory = new Memory();

  public void free(int ptr){
    for(int i = 0; i < memory.getMemory()[ptr] + memory.getMemory()[ptr + 1]; i++){
      memory.getMemory()[ptr + i] = 0;
    }
  }

  public int malloc(int size){
    int[] temp, headPtr = sbrk(size);
    if(headPtr != null){
      for(int i = 0; i < size; i++){
        memory.getMemory()[i] = temp[i];
      }
      return 1;
    }
    return 0; 
  }

  public int[] sbrk(int size){
    int temp = memory.getFree() - 5;
    if(!(size > temp)){
      memory = memory.;
      for(int i = 0; i < size; i++){
        result[i] = memory.getMemory()[i];
      }
      memory.setFree(temp - size);
      return result;
    }
    return null;
  }
}
