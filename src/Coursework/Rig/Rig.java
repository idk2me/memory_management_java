/* 
Name of project: Memory management simulator for LZSCC211
Author: 38879913
Started: 04/12/2023
Finished: TBD
Purpose: code for coursework 2 of LZSCC211
*/ 


package Coursework.Rig;

import Coursework.Rig.MemoryManagement.MemoryMgnt;

public class Rig implements Problem{
  private String name = "Memory Management Coursework";
  // private MemoryMgnt memoryMgnt = new MemoryMgnt();
  public static void main(String[] args) {
    System.out.println("This is the main file!\n");
  }

  public void print(){
    System.out.println("Printing...");
  }

  public void init(){
    System.out.println("Initialising...");
  }

  public String name(){
    return name;
  }
}