package Coursework.Rig.MemoryManagement;

public class SBRK {
  int head;
  int end; 
  int free; 
  int prev; 
  int next;

  public SBRK(int[] memory, int head, int end, int free, int prev, int next){
    this.head = head;
    this.end = memory.length - 1;
    this.free = free;
    this.prev = prev;
    this.next = next;
  }
}
