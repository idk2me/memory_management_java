package Coursework.Rig.MemoryManagement;

public class MemoryMgnt {
  private Memory memory;

  public MemoryMgnt(Memory memory){
    this.memory = memory;
    memory.sbrk(25);
  }

  public void srbk(){
    System.out.println("SBRK");
  }
}
