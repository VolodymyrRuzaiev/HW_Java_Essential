package com.task_004_Computer;
// pattern
public class Computer {
  // field
   String cpu = "'no name'";
    // method
    public void set_cpu(String cpu){

        this.cpu = cpu;
    }
    public void get_cpu(){

        System.out.printf("This computer has got CPU %1$s\n", this.cpu);

    }

}
