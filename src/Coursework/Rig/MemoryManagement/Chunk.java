package Coursework.Rig.MemoryManagement;

public class Chunk {
  private int used;
  private int length;
  private String data;
      /*
   * prev and next are the pointers to previous and next chunks
   */
  private int prev;
  private int next;

  public Chunk(int length) {
    this.length = length;
  }

  public void setData(String data) {
    this.data = data;
  }

  public int getLength() {
    return length;
  }

  public String getData() {
    return data;
  }

  public void setPrev(int prev) {
    this.prev = prev;
  }

  public void setNext(int next) {
    this.next = next;
  }
}
