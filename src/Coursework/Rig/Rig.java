/* 
Name of project: Memory management simulator for LZSCC211
Author: 38879913
Started: 04/12/2023
Finished: TBD
Purpose: code for coursework 2 of LZSCC211
*/

package Coursework.Rig;

import Coursework.Rig.MemoryManagement.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Rig implements Problem {
  private String name = "Memory Management simulator for LZSCC211";
  private MemoryMgnt memory = new MemoryMgnt();
  private Problem problem;

  public static void main(String[] args) {
    Rig rig = new Rig();
    System.out.println("""
        \n========================================\n
        Author: 38879913
        Assignment: Coursework 2
        Brief: Memory management simulator in Java
        \n========================================\n
            """);
    // rig.memory.print();
    rig.print(1);
    rig.print(2);
    rig.print(3);
    rig.print(4);
    rig.print(5);
  }

  public void print(int n) {
    switch(n){
      case 1:
        test1();
        break;
      case 2:
        test2();
        break;
    }
  }

  public String name() {
    return name;
  }

  public void init() {
  }

  public void test1() {
    System.out.println("\nRunning test number 1");
    System.out.println("Allocating 1024 bytes...");
    int headWithData = memory.malloc(1024);
    System.out.println("Saving name of project to memory...");
    memory.storeData(headWithData, name());
    System.out.println("Head of allocated memory: 0x" + Integer.toHexString(headWithData));
    System.out.println("Allocating 1024 bytes...");
    int head = memory.malloc(1024);
    System.out.println("Head of allocated memory: 0x" + Integer.toHexString(head));
    System.out.println("Retrieving data from memory...");
    memory.getData(headWithData);
    // memory.print();
    // free();
    try{
      head = memory.malloc(10240);
    } catch (OutOfMemoryError e){
      System.out.println("Out of memory");
    }
    System.out.println("Head of allocated memory: 0x" + Integer.toHexString(head));
  }
  public void test2() {
    try {
      System.out.println("\nRunning test number 2");
      System.out.println("Allocating 1024 bytes...");
      int headWithData = memory.malloc(1024);
      System.out.println("Saving string \"Some random string\" to memory...");
      memory.storeData(headWithData, "Some random string");
      System.out.println("Head of allocated memory: 0x" + Integer.toHexString(headWithData));
      System.out.println("Allocating 1024 bytes...");
      int head = memory.malloc(1024);
      System.out.println("Head of allocated memory: 0x" + Integer.toHexString(head));
      System.out.println("Allocating 1024 bytes...");
      head = memory.malloc(1024);
      System.out.println("Head of allocated memory: 0x" + Integer.toHexString(head));
      System.out.println("Allocating 1024 bytes...");
      head = memory.malloc(1024);
      System.out.println("Head of allocated memory: 0x" + Integer.toHexString(head));
      System.out.println("Allocating 1024 bytes...");
      head = memory.malloc(1024);
      System.out.println("Head of allocated memory: 0x" + Integer.toHexString(head));
      System.out.println("Allocating 1024 bytes...");
      System.out.println("Getting previously stored memory at location 0x" + Integer.toHexString(headWithData));
      memory.getData(headWithData);
      head = memory.malloc(1024);
      System.out.println("Head of allocated memory: 0x" + Integer.toHexString(head));
      System.out.println("Allocating 1024 bytes...");
      head = memory.malloc(1024);
      System.out.println("Head of allocated memory: 0x" + Integer.toHexString(head));
    } catch (OutOfMemoryError e) {
      System.out.println("Out of memory");
    }
  }
}