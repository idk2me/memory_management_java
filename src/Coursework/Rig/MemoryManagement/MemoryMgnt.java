package Coursework.Rig.MemoryManagement;

import java.util.Arrays;
import java.lang.Math;

public class MemoryMgnt {
  private int[] memory = new int[8192];
  private int free = 8192 - 4;

  public void free(int ptr) {
    // for(int i = 0; i < memory.getMemory()[ptr] + memory.getMemory()[ptr + 1];
    // i++){
    // memory.getMemory()[ptr + i] = 0;
    // }
  }

  public int malloc(int length) {
    int prev;
    int next;
    int[] toAllocate = sbrk(length); // creates a chunk of memory to be allocated
    int head = toAllocate[0];
    free -= free - head;
    int end = toAllocate.length - 1;
    for (int i = 1; i < end - 2; i++) {
      memory[(int) Math.abs(head-1 + i)] = toAllocate[i];
    }
    memory[head - 4] = head; // points to the start of the chunks data
    prev = head-3;
    while (memory[prev] == 0 || memory[prev] == -1) {
      prev--;
      if(prev - 1 == 0){
        prev = 0;
        break;
      }
    }
    memory[head - 2] = prev;
    next = head;
    try {
      while (memory[next] == 0 || memory[next] == -1) {
        next++;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      next = -2;
    } finally {
      memory[head - 3] = next + 3;
    }

    memory[head - 1] = next;
    memory[head - 3] = toAllocate.length - 1;

    return head + 4;
  }

  // sbrk() returns a pointer to a block of memory and block of memory
  // which will be allocated by malloc()
  public int[] sbrk(int length) {
    int actualLength = nearestPowerOfTwo(length);
    if (actualLength + 4 > free) {
      throw new OutOfMemoryError("Not enough memory");
    }
    // +1 so that the base pointer is returned as part of the array
    int[] block = new int[actualLength + 1];
    Arrays.fill(block, -1);
    int i = 0;
    for (; i < block.length - 1; i++) {
      if (i < 1) {
        block[i] = free - block.length - 2;
      }
    }
    // free -= length;
    return block;
  }

  public void print() {
    for (int i : memory) {
      System.out.print(i + " | ");
    }
  }

  public int nearestPowerOfTwo(int length) {
    return length == 1 ? 1 : Integer.highestOneBit(length - 1) * 2;
  }

  public void storeData(int ptr, String data){
    int[] temp = new int[data.length()];
    for(int i = 0; i < data.length(); i++){
      temp[i] = (int) data.charAt(i);
    }
    for(int i = 0; i < temp.length; i++){
      memory[ptr - 4 + i] = temp[i];
    }
  }

  public void getData(int ptr){
    String dataDecoded = "";
    int idx = 0;
    while(memory[ptr + idx] != -1){
      dataDecoded += (char) memory[ptr - 4 + idx];
      idx++;
    }
    System.out.println(dataDecoded);
  }
}
