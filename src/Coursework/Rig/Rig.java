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
  private Memory memory;
  private Problem problem;

  public static void main(String[] args) {
    System.out.println("""
        Author: 38879913
        Assignment: Coursework 2
        Brief: Memory management simulator in Java
            """);

    Rig rig = new Rig();
    while (true) {

      /*
       * Taken and adapted from given code examples in workshops
       * from https://github.lancs.ac.uk/stovold/SCC211_AY23.
       */
      System.out.println("\r\n=================");
      System.out.println("LZSCC211 Coursework 2:" + rig.name());
      System.out.println("=================\r\n");
      System.out.println("1. Test 1");
      System.out.println("2. Test 2");
      System.out.println("3. Test 3");
      System.out.println("4. Test 4");
      System.out.println("5. Test 5");
      System.out.println("6. Custom inputs");
      System.out.println("0. Exit");

      System.out.print("Pick a problem: ");
      Integer selectedOption = 0;
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      String line = "";
      try {
        line = buffer.readLine();
        System.out.println();
        selectedOption = Integer.parseInt(line);
      } catch (NumberFormatException e) {
        System.out.println("I don't know what '" + line + "' is, please input a number.");
        continue;
      } catch (IOException e) {
        System.out.println("IOException, quitting...");
      }

      if (selectedOption == 0) {
        break;
      }

      switch (selectedOption) {
        case 1:
          rig.print(selectedOption);
          break;
        case 2:
          rig.print(selectedOption);
          break;
        case 3:
          rig.print(selectedOption);
          break;
        case 4:
          rig.print(selectedOption);
          break;
        case 5:
          rig.print(selectedOption);
          break;
        case 6:
          rig.print(selectedOption);
          break;
        default:
          return;
      }

      System.out.println("Initialising problem: " + rig.problem.name());
      rig.problem.init();
      System.out.println(rig.problem.name() + " established.");
      System.out.println("Running...\r\n");
    }
  }

  public void print(int testCase) {
    System.out.println("Starting test: " + testCase);
    System.out.println();
    switch(testCase){
      case 1:
        test1();
        break;
      case 2:
        test2();
        break;
      case 3:
        test3();
        break;
      case 4:
        test4();
        break;
      case 5:
        test5();
        break;
      case 6:
        custom();
        break;
      default:
        return;
    }
  }

  public void init() {
    System.out.println("Initialising...");
    this.memory = new Memory();
  }

  public String name() {
    return name;
  }

  public void test1(){
    System.out.println("Running test 1...");
    System.out.println("Requesting 1024 bytes of memory... memory allocated");
    memory.malloc(1024);
    System.out.println("Pointer: " + memory.getGuard());
  }
  public void test2(){}
  public void test3(){}
  public void test4(){}
  public void test5(){}
  public void custom(){}
}